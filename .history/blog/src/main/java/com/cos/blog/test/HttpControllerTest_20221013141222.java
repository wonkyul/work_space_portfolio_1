package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//사용자가 요청 -> 음답(HTML파일)
//@Controller

//사용자가 요청 -> 응답(Data)
@RestController
public class HttpControllerTest {

    private static final String TAG = "HttpControllerTest";
    
    //localhost:8000/blog/http/lombok
    @GetMapping("/http/lombok")
    public String lombokTest(){
        Member m = Member.builder().username("saar").password("1234").email("sarr@nate.com").build();
        System.out.println(TAG+"getter:" +m.getUsername());
        m.setUsername("cos");
        System.out.println(TAG+"setter:" +m.getUsername());
        return "lombok test 완료";
    }
    
}
