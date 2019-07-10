//package com.ryu.ultramania.repository;
//
//import com.ryu.ultramania.model.Car;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.Cache;
//import org.springframework.cache.CacheManager;
//import org.springframework.cache.annotation.Cacheable;
//import org.springframework.stereotype.Component;
//
//
//import java.util.Random;
//
//@Component
//public class NonDbRepository {
//
//
//    private final long sleepTime = 3000L;
//    private final Logger logger = LoggerFactory.getLogger(NonDbRepository.class);
//
//    @Autowired
//    private CacheManager cacheManager;
//
//    public Car getByNameWithCachManager(String name){
//        Cache cache = cacheManager.getCache("carName");
//        return randomCarColor(cache.get(name, Car.class));
//    }
//
//
//    private Car randomCarColor(Car car){
//        Random rn = new Random(System.currentTimeMillis());
//        rn.setSeed(System.currentTimeMillis());
//
//        String colors[] = {"red", "blue", "gray", "white", "purple"};
//
//        for(int i=0; i<5; i++){
//            int b = rn.nextInt(5);
//            car.setColor(colors[b]);
//        }
//
//        return car;
//    }
//
//    private void makeSlowService(){
//        logger.info("start sleep");
//
//        try{
//            Thread.sleep(sleepTime);
//        }catch (InterruptedException ire){
//            throw new IllegalStateException(ire);
//        }
//
//        logger.info("end sleep");
//    }
//
//    @Cacheable(cacheNames = "carName")
//    public Car getByName(String name){
//        makeSlowService();
//        Car myCar = new Car(name);
//        return randomCarColor(myCar);
//    }
//}
