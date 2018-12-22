package com.yeepay.g3.core.at.app.trade.biz;


import com.yeepay.g3.facade.at.app.response.ForgotPasswordUrlResponseDTO;
import com.yeepay.g3.facade.at.app.request.ForgotPasswordUrlRequestDTO;
import com.yeepay.g3.facade.at.app.request.LoginRequestDTO;
import com.yeepay.g3.facade.at.app.request.SendSmsRequestDTO;
import com.yeepay.g3.facade.at.app.response.LoginResponseDTO;
import com.yeepay.g3.facade.at.app.response.SendSmsResponseDTO;

/**
 * Created by yp-tc-m-7125 on 2018/10/17.
 */
public interface LoginBiz {
  // 发短信
  SendSmsResponseDTO sendSms(SendSmsRequestDTO requestDTO);
  // 登录
  LoginResponseDTO login(LoginRequestDTO requestDTO);
  // 忘记密码
  ForgotPasswordUrlResponseDTO ForgotPasswordUrl(ForgotPasswordUrlRequestDTO requestDTO);
}
