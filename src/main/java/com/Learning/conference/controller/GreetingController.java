package com.Learning.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class GreetingController {
    @RequestMapping("registration")
    public String getRegistration(Map<String, Object> model){
        return "registration";
    }
}
