package com.sns.service;

import com.sns.config.Constant;
import com.sns.config.GoogleOauth;
import lombok.RequiredArgsConstructor;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OAuthService{
  private final GoogleOauth googleOauth;
  private final HttpServletResponse response;

  public void request(Constant.SocialLoginType socialLoginType) throws IOException{
    String redirectURL;

    switch(socialLoginType){
      case GOOGLE:{
        redirectURL = googleOauth.getOauthRedirectURL();
      }break;
      default:{
        throw new IllegalArgumentException("알 수 없는 소셜 로그인 형식입니다.");
      }
    }
    response.sendRedirect(redirectURL);
  }  
}