package com.cos.security1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.security1.config.auth.PrincipalDetails;
import com.cos.security1.model.User;
import com.cos.security1.repository.UserRepository;

@Controller//view를 리턴하겠다.
public class IndexController {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bcryptPasswordEncoder;
	
	@GetMapping("/test/login")
	public @ResponseBody String loginTeString(Authentication authentication) {
		System.out.println("/test/login====================");
		PrincipalDetails principalDetails = (PrincipalDetails)authentication.getPrincipal();
		System.out.println("authentication: " + principalDetails.getUser());
		return "세션 정보 확인하기";
	}
	
	//localhost:8080/
	//localhost:8080
	@GetMapping({"","/"})
	public String index() {
		//머스테치 기본폴더 src/main/resources/
		//뷰리졸버 설정 : temlplates(prefix),.mustache(surffix)
		return "index"; //src/main/resources/templates/index.mustache
	}
	
	@GetMapping("/user")
	public @ResponseBody String user() {
		return "user";
	}
	@GetMapping("/admin")
	public @ResponseBody String admin() {
		return "admin";
	}
	@GetMapping("/manager")
	public @ResponseBody String manager() {
		return "manager";
	}

	/*
	 * @GetMapping("/user") public @ResponseBody String user() { return "user"; }
	 */
	@GetMapping("/loginForm") // 스프링 시큐리티 해당주소를 낚아 채버리네요!!- SecurityConfig 파일 생성 후 작동 안함
	public String loginForm() {
		return "loginForm";
	}
	
	@GetMapping("/joinForm")
	public String joinForm() {
		return "joinForm";
	}	
	@PostMapping("/join")
	public  String join(User user) {
		System.out.println(user);
		user.setRole("ROLE_USER");
		String rawPassword = user.getPassword();
		String encPassword = bcryptPasswordEncoder.encode(rawPassword);
		user.setPassword(encPassword);
		userRepository.save(user);//회원가입 잘 됨 : 1234 => 시큐리티로 로그인을 할 수 없음. 이유는 패스워드가 암호화가 안되어있습니다.
		
		return "redirect:/loginForm";
	}
	@Secured("ROLE_ADMIN") 
	@GetMapping("/info")
	public @ResponseBody String info() {
		return "개인정보";
	}
	@PreAuthorize("hasRole('ROLE_MANAGER')or hasRole('ROLE_ADMIN')") 
	@GetMapping("/data")
	public @ResponseBody String date() {
		return "데이터정보";
	}
}
