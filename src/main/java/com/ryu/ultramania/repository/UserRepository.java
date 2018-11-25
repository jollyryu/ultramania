package com.ryu.ultramania.repository;

import com.ryu.ultramania.model.UserEntity;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class UserRepository {
    private static final String MAPPER_NAME_SPACE="mapper.userMapper.";

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public List getUserInfoAll(){
        return sqlSessionTemplate.selectList(MAPPER_NAME_SPACE + "selectUserInfoAll");
    }

    public void adduserInfo(UserEntity userEntity){
        sqlSessionTemplate.insert(MAPPER_NAME_SPACE+ "addUserInfo", userEntity);
    }

    public List findByUserNameLike(String userName){
        Map<String,Object> params = new HashMap();
        params.put("userName", userName);

        return sqlSessionTemplate.selectList(MAPPER_NAME_SPACE + "findByUserNameLike", params);
    }

    public UserEntity findByUserName(String userName){
        Map<String,Object> params = new HashMap();
        params.put("userName", userName);

        return sqlSessionTemplate.selectOne(MAPPER_NAME_SPACE + "findByUserName", params);
    }

    public List findByForeach(Map<String, Object> paramMap){
        return sqlSessionTemplate.selectList(MAPPER_NAME_SPACE + "foreachUserList", paramMap);
    }


}
