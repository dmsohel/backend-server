package com.exam.examserver.service;

import com.exam.examserver.model.exam.Question;
import com.exam.examserver.model.exam.Quiz;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface QuestionService {

    public Question addQuestion(Question question);
    public Question updateQuestion(Question question);
    public Set<Question> getQuestions();
    public Question getQuestion(Long questionId);
    public Set<Question>getQuestionsOfQuiz(Quiz quiz);
    public void deleteQuestion(Long quesId);
    public Question get(Long questionId);

}
