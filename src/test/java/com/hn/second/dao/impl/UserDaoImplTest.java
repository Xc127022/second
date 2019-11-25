package com.hn.second.dao.impl;

import com.hn.second.ResResult;
import com.hn.second.dao.idao.IUserDao;
import com.hn.second.dao.pojo.User;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserDaoImplTest {

@Autowired
IUserDao userDao;
    @Test
    public void login() throws Exception {

        ResResult<User> rr = userDao.login("scott","tiger");
        TestCase.assertNotNull(rr.getData());
        System.out.println(rr);
        ResResult<User> rr2 = userDao.login("scott1","tiger");
        System.out.println(rr2);
    }

    @Test
    public void login1() {
    }
}