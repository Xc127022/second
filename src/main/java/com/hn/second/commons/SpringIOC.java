package com.hn.second.commons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIOC {

    public static ApplicationContext getCtx(){
        return new ClassPathXmlApplicationContext("applicationCContext.xml");

    }
}
