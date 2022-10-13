package com.cos.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cos.chap03.ChangePasswordService;
import com.cos.chap03.MemberRegisterService;
import com.cos.chap03.RegisterRequest;
import com.cos.chap03.config.AppCtx;

public class MainForSpring{
    private static ApplicationContext ctx = null;
    public static void main(String [] args) throws IOException{
        ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("명령어를 입력하세요 :");
            String command = reader.readLine();
            //코드 생략
            printHelp();
        }
    }
    private static void processNewCommand(String[] arg){
        if(arg.length != 5){
            printHelp();
            return;
        }
        MemberRegisterService regSvc = ctx.getBean("memberRegSvc",MemberRegisterService.class);
        RegisterRequest req = new RegisterRequest();
        req.setEmail(arg[1]);
        //코드생략
        if(!req.isPasswordEqualsToConfirmPassword()){
            System.out.println("암호와 확인이 일치하지 않습니다.\n");
            return;
        }
        try{
            regSvc.regist(req);
            System.out.println("등록했습니다.\n");
        }catch(AlreadyExistingMemberException e){
            System.out.println("이미 존재하는 이메일입니다. \n");
        }
    }
    private static void processChangeCommand(String[] arg){
        if(arg.length !=4){
            printHelp();
            return;
        }
        ChangePasswordService changePwdSvc = ctx.getBean("changePwdSvc",ChangePasswordService.class);
        try{
            changePwdSvc.changePassword(arg[1], arg[2], null);
        }
    }
}