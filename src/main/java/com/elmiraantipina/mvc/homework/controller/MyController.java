package com.elmiraantipina.mvc.homework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {
    @RequestMapping("/")
    public String showAllUnits(){

        return "index";
    }

}
