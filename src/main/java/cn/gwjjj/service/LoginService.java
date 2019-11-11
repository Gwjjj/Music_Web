package cn.gwjjj.service;

import cn.gwjjj.model.UserDatails;
import cn.gwjjj.model.UserLogin;
import cn.gwjjj.util.LoginVal;

public interface LoginService {
	UserLogin login(LoginVal logInVal);

	Boolean UserRegister(LoginVal logInVal);
	
	UserDatails findByUserLogin(UserLogin userLogin);
}
