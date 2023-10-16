package com.springboot.springbootapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstSpeechController {

    @GetMapping("/first-words")
    public String firstWords(){
        return "Give me a scotch, I'm starving!!";
    }

}
