package com.example.demo;

import com.example.demo.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {DemoApplication.class})
public class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void getUser(){
        Assert.assertEquals(userService.getUser(),"Tom");
    }

}
