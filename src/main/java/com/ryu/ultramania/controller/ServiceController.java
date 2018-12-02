package com.ryu.ultramania.controller;

import com.ryu.ultramania.model.UserEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ServiceController {

    @RequestMapping(value = "/")
    public String tet(){
        return "dddd";
    }

    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    public ResponseEntity<?> registUser(@Validated @RequestBody UserEntity userEntity){
        System.out.println("controller vo check: " + userEntity.toString());
        return new ResponseEntity(null, HttpStatus.OK);
    }



}
