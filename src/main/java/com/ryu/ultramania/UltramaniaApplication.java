package com.ryu.ultramania;

import com.ryu.ultramania.exception.UserNotFoundException;
import com.ryu.ultramania.model.FreeBoardEntity;
import com.ryu.ultramania.model.MemberEntity;
import com.ryu.ultramania.model.ServiceCategoryEntity;
import com.ryu.ultramania.model.UserEntity;
import com.ryu.ultramania.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UltramaniaApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(UltramaniaApplication.class, args);
		System.out.println("Application Start!!!");

	}

//
//	@Autowired
//	ServiceCategoryRepository serviceCategoryRepository;
//
//
//	@Autowired
//	FreeBoardRepository freeBoardRepository;
//
//	@Autowired
//	UserJpaRepository userJpaRepository;
//
//	@Autowired
//	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {


//		UserEntity userEntity = new UserEntity("A00001", "ryu", "jay.ryu@kakaopaycorp.com", "REG", "ppp");
//		userRepository.adduserInfo(userEntity);
//
//		System.out.println(userJpaRepository.findByUserName("jay.ryu"));
//
//		if(userJpaRepository.findByUserName("jay.ryu") == null){
//			throw new UserNotFoundException("user not found");
//		}

//		ServiceCategoryEntity serviceCategoryEntity = new ServiceCategoryEntity();
//
//		serviceCategoryEntity = serviceCategoryRepository.findByCategoryCode("A0001");
//
//		System.out.println(serviceCategoryEntity.getCategoryCode());

//		MemberEntity memberEntity = new MemberEntity();
//		memberEntity.setMemberName("테스트");
//		memberEntity.setMemberEmail("111@naver.com");
//		memberEntity.setMemberPassword("11");
//
//		System.out.println(memberEntity.toString());
//		memberRepository.registMember(memberEntity);



//			System.out.println("frebboard run");
//			FreeBoardEntity freeBoardVO = new FreeBoardEntity();
//			freeBoardVO.setUserName("홍길동");
//			freeBoardVO.setCategory("101");
//			freeBoardVO.setContent("자유게시판 첫 글");
//			freeBoardVO.setTitle("안녕");
//
//			freeBoardRepository.registBoard(freeBoardVO);

	}

}
