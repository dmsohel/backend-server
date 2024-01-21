package com.exam.examserver.service;

import com.exam.examserver.model.User;
import com.exam.examserver.model.UserRole;

import java.util.List;
import java.util.Set;

public interface UserService {


    //creating User
    public User createUser(User user, Set<UserRole>userRoles) throws Exception;

    //get User
    public User getUser(String username);

    //delete user
    public void deleteUser(Long userId);

    public List<User> findAllUsers();
}
