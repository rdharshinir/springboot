package com.spring.demo.controller;

import com.spring.demo.service.QuestionService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("question")
public class Questioncontroller {
    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestions")
    public String getAllQuestions(){
        return questionService.getAllQuestions();
    }
}
