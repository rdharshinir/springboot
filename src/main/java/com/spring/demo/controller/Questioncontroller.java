package com.spring.demo.controller;

import com.spring.demo.Question;
import com.spring.demo.service.QuestionService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("question")
public class Questioncontroller {
    @Autowired
    QuestionService questionService;
    
    @GetMapping("allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }
}
