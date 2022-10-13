package com.cos.chap03.assembler;

import com.cos.chap03.ChangePasswordService;
import com.cos.chap03.MemberDao;
import com.cos.chap03.MemberRegisterService;

public class Assembler {

	private MemberDao memberDao;
	private MemberRegisterService regSvc;
	private ChangePasswordService pwdSvc;
	
	public Assembler() {
		memberDao = new MemberDao();
	}
}
