package com.ryu.ultramania.repository;

import com.ryu.ultramania.model.ServiceCategoryEntity;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ServiceCategoryRepository  {
    private static final String MAPPER_NAME_SPACE="mapper.serviceCategoryMapper.";

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public ServiceCategoryEntity findByCategoryCode(String categoryCode){
        Map<String,Object> params = new HashMap();
        params.put("categoryCode", categoryCode);
        System.out.println("query 실행...");
        return sqlSessionTemplate.selectOne(MAPPER_NAME_SPACE + "findByCategoryCode", params);

    }
}
