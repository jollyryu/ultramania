package daoTest;

import com.ryu.ultramania.model.UserEntity;
import com.ryu.ultramania.repository.UserRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoTest extends MybatisTestConfig{
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testList(){
        System.out.println(userRepository.getUserInfoAll());
    }

    @Test
    public void createUser(){
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId("1111");
        userEntity.setUserEmail("test@daum.net");
        userEntity.setUserName("홍길동");
        userEntity.setUserPassword("3333");
        userRepository.adduserInfo(userEntity);

        System.out.println(userRepository.getUserInfoAll());
    }
}
