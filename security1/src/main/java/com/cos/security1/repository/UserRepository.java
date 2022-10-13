package com.cos.security1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.security1.model.User;

//CRUD
//@Repository라는 어노테이션이 없어도 IoC되는 이유는 JpaRepository를 상속했기 때문에
public interface UserRepository extends JpaRepository<User,Integer>{
	//findBy규칙 -> User문법
	//select * from user where username =1?
	public User findByUsername(String username);
	
	//select * from user where email =?
	//public User findByEmail();//Jpa name 함수
	
}
