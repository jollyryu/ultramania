//package com.ryu.ultramania;
//
//import com.ryu.ultramania.repository.NonDbRepository;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
//import org.springframework.cache.annotation.EnableCaching;
//
//import javax.cache.Cache;
//import javax.cache.CacheManager;
//import javax.cache.Caching;
//import javax.cache.configuration.MutableConfiguration;
//import javax.cache.expiry.CreatedExpiryPolicy;
//import javax.cache.expiry.Duration;
//import javax.cache.spi.CachingProvider;
//
//
//@SpringBootApplication(exclude = WebMvcAutoConfiguration.class)
//public class EhcachingApp implements CommandLineRunner{
//
//    private static final Logger logger = LoggerFactory.getLogger(SpringCachingApp.class);
//
//
//    @Autowired
//    NonDbRepository carRepository;
//
//
//
//    public static void main(String ar[]){
//        SpringApplication.run(EhcachingApp.class, ar);
//    }
//
//    @Override
//    public void run(String... args) throws Exception{
//
//        logger.info("no1 : " + carRepository.getByName("스팅어"));
//        logger.info("no1 : " + carRepository.getByName("스팅어"));
//        logger.info("no1 : " + carRepository.getByName("스팅어"));
//    }
//
//}
