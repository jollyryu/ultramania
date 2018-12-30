package com.ryu.ultramania.service;

import com.ryu.ultramania.exception.UserNotFoundException;
import com.ryu.ultramania.model.UserEntity;
import com.ryu.ultramania.repository.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserJpaRepository userJpaRepository;

    public UserEntity findByOneId(int id){

        UserEntity userEntity = userJpaRepository.findById(id);
        if(userEntity == null){
            throw new UserNotFoundException("user not found");
        }

        return userEntity;
    }

}
