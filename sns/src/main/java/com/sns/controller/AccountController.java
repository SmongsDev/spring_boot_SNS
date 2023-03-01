package com.sns.controller;

import org.springframework.web.bind.annotation.GetMapping;


public class AccountController{
  @NoAuth
  @GetMapping("/auth/{socialLoginType}") //GOOGLE이 들어올 것이다.
  public void socialLoginRedirect(@PathVariable(name="socialLoginType") String SocialLoginPath) throws IOException {
    SocialLoginType socialLoginType= SocialLoginType.valueOf(SocialLoginPath.toUpperCase());
    oAuthService.request(socialLoginType);
  }
}