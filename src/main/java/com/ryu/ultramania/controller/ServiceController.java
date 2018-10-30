package com.ryu.ultramania.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ServiceController {

    @RequestMapping(value = "/")
    public String tet(){
        return "dddd";
    }
}
