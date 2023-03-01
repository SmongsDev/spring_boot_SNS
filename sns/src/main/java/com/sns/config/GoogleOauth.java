package com.sns.config;

import com.sns.src.account.social.SocialOauth;
import java.lang.Override;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GoogleOauth implements SocialOauth{
  @Override
  public String getOauthRedirectURL(){
    return "";
  }
}