package com.cos.chap03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cos.chap03.ChangePasswordService;
import com.cos.chap03.MemberDao;
import com.cos.chap03.MemberRegisterService;

@Configuration
public class AppCtx {
    
    @Bean
    public MemberDao memberDao(){
        return new MemberDao();
    }
    
    @Bean
    public MemberRegisterService memberRegSvc(){
        return new MemberRegisterService(memberDao());
    }
    @Bean
    public ChangePasswordService changePwdSvc(){
        ChangePasswordService = new ChangePasswordService();
        pwdSvc.setMemberDao(memberDao());
        return pwdSvc;
    }
}
