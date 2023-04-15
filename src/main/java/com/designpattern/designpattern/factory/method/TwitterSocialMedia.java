package com.designpattern.designpattern.factory.method;

import lombok.Getter;

public class TwitterSocialMedia implements SocialMedia {
    @Getter
    private final String name = "TWITTER";

    @Getter
    private final String link = "https://www.twitter.com/";

    @Getter
    private final SocialMediaType socialMediaType = SocialMediaType.TWITTER;
}
