package com.anas.hci;

import com.anas.hci.model.entity.User;
import com.anas.hci.model.querybean.GroupModuleInfoBean;
import com.anas.hci.repository.GroupModuleRepository;
import com.anas.hci.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.constraints.AssertTrue;
import java.util.List;

import static org.junit.Assert.assertTrue;


@RunWith(SpringRunner.class)
@SpringBootTest
public class RepositoryTest {
@Autowired
private UserRepository userRepository;

@Autowired
private GroupModuleRepository groupModuleRepository;


    @Test
    public void testUserRepository(){
        User user = new User();
        user.setUsername("user2");
        user.setGroupId(2);
        int i=userRepository.insert(user);
        assertTrue(i !=0);
     }

     @Test
    public void testGroupRepository(){
         List<GroupModuleInfoBean> list= groupModuleRepository.queryGroupModuleByUserId(1);
         assertTrue(list.size()>0);
     }
}
