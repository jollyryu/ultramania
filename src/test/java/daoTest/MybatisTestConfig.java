package daoTest;

import com.ryu.ultramania.config.MybatisConfig;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MybatisConfig.class, loader = AnnotationConfigContextLoader.class)
@Rollback
public class MybatisTestConfig {
}
