package com.spring.demo.service;

import org.springframework.stereotype.Service;

@Service
public class QuestionService {
    
    public String getAllQuestions() {
        return "List of questions";
    }
}
