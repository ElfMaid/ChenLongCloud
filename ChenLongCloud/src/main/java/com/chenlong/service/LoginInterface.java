package com.chenlong.service;

public interface LoginInterface {

	
	  public abstract boolean isUserExist(String username);
	  public abstract boolean isPwdCorrect(String username,String password); 
	 
}
