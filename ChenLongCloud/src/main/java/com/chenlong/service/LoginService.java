package com.chenlong.service;

public class LoginService implements LoginInterface {
	
	@Override
	public boolean isUserExist(String username) {
		
		return true;
	}
	
	
	@Override
	public boolean isPwdCorrect(String username,String password) {
		
		return true;
	}
}
