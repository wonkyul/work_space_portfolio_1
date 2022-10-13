package com.cos.chap03;

public class ChangePasswordService {
	private MemberDao memberDao;
	
	public void changePassword(String email, String oldPwd, String mewPwd) {
		Member member = memberDao.selectByEmail(email);
		if(member == null)
			throw new MemberNotFoundException();
		member.changePassword(oldPwd, mewPwd);
		memberDao.update(member);
		
	}
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
}
