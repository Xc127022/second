package com.hn.second.service.impl;

import com.hn.second.ResResult;
import com.hn.second.dao.pojo.User;
import com.hn.second.service.iservice.IUserService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceImplTest {
    @Autowired
    private IUserService userService;

    @Test
    public void login() {
        ResResult<User> rr = userService.login("scott","tiger");
        TestCase.assertNotNull(rr.getData());
        System.out.println(rr);
        ResResult<User> rr2 = userService.login("scott1","tiger");
        System.out.println(rr2);


    }
}