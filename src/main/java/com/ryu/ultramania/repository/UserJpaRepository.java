package com.ryu.ultramania.repository;

import com.ryu.ultramania.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJpaRepository extends JpaRepository<UserEntity, Long>{
  UserEntity findByUserName(@Param("userName") String userName);
  UserEntity findById(@Param("id") int id);

}
