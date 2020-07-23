package com.ryu.ultramania.controller;

import com.ryu.ultramania.model.UserEntity;
import com.ryu.ultramania.repository.UserJpaRepository;
import com.ryu.ultramania.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

//테스트//
@RestController
public class ServiceController {


    @Autowired
    UserService userService;


    @RequestMapping(value = "/")
    public String tet(){
        return "dddd";
    }

    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    public ResponseEntity<?> registUser(@Validated @RequestBody UserEntity userEntity){
        System.out.println("controller vo check: " + userEntity.toString());
        return new ResponseEntity(null, HttpStatus.OK);
    }

    /**
     * ResponseEntity 으로 응답헤더값을 컨트롤
     * @param id
     * @return UserEntity
     */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ResponseEntity<UserEntity> findUser(@PathVariable int id){
//        System.out.println("findUser-Id");

        return new ResponseEntity(userService.findByOneId(id), HttpStatus.OK);
    }





}
