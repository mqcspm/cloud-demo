package com.meng.provider;
import java.util.Date;


import com.meng.provider.entity.User;
import com.meng.provider.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insertTest(){
        User user = new User();
        user.setUsername("test");
        user.setPasswork("test");
        user.setGmtCreate(new Date());
        user.setGmtModify(new Date());
        userMapper.insertUser(user);
    }


}
