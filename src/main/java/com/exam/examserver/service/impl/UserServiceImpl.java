package com.exam.examserver.service.impl;

import com.exam.examserver.exception.UserFoundException;
import com.exam.examserver.exception.UserNotFoundException;
import com.exam.examserver.model.User;
import com.exam.examserver.model.UserRole;
import com.exam.examserver.repo.RoleRepository;
import com.exam.examserver.repo.UserRepository;
import com.exam.examserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    //creating user
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {

        User local=this.userRepository.findByUsername(user.getUsername());
        if(local!=null){
            System.out.println("User is already there");
            throw new UserFoundException();
        }else{
            //user create
            for(UserRole ur:userRoles){
                roleRepository.save(ur.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            local=this.userRepository.save(user);
        }
        return local;
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }
    //getting user by username
    @Override
    public User getUser(String username){
        return this.userRepository.findByUsername(username);
    }

    //deleting user by userid
    @Override
    public void deleteUser(Long userId){
        this.userRepository.deleteById(userId);
    }

}
