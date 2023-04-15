package com.designpattern.designpattern.factory.method;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class FactoryMethodAppTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testSocialMedia() {
        SocialMedia facebook = applicationContext.getBean(SocialMedia.class, SocialMediaType.FACEBOOK);
        SocialMedia twitter = applicationContext.getBean(SocialMedia.class, SocialMediaType.TWITTER);
        SocialMedia instagram = applicationContext.getBean(SocialMedia.class, SocialMediaType.INSTAGRAM);

        System.out.println(facebook);
        System.out.println(twitter);
        System.out.println(instagram);
    }
}
