package com.ryu.ultramania;

import com.ryu.ultramania.model.ServiceCategoryEntity;
import com.ryu.ultramania.repository.ServiceCategoryRepository;
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


	@Autowired
	ServiceCategoryRepository serviceCategoryRepository;


	public void run(String... args) throws Exception {

//		ServiceCategoryEntity serviceCategoryEntity = new ServiceCategoryEntity();
//
//		serviceCategoryEntity = serviceCategoryRepository.findByCategoryCode("A0001");

//		System.out.println(serviceCategoryEntity.getCategoryCode());



	}

}
