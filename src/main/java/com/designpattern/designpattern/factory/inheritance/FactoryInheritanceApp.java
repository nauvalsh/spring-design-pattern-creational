package com.designpattern.designpattern.factory.inheritance;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.designpattern.designpattern.factory.method.FacebookSocialMedia;
import com.designpattern.designpattern.factory.method.InstagramSocialMedia;
import com.designpattern.designpattern.factory.method.SocialMedia;
import com.designpattern.designpattern.factory.method.TwitterSocialMedia;

@SpringBootApplication
public class FactoryInheritanceApp {
    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaFacebook() {
        return new FacebookSocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaInstagram() {
        return new InstagramSocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaTwitter() {
        return new TwitterSocialMedia();
    }
}
