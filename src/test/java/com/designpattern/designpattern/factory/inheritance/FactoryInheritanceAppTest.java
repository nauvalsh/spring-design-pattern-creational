package com.designpattern.designpattern.factory.inheritance;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.designpattern.designpattern.factory.method.SocialMedia;

@SpringBootTest(classes = FactoryInheritanceApp.class)
public class FactoryInheritanceAppTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testFactoryInheritance() {
        SocialMedia facebook = applicationContext.getBean("socialMediaFacebook", SocialMedia.class);

        System.out.println(facebook);
    }

}
