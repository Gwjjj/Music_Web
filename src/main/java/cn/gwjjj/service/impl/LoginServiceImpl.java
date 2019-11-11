package cn.gwjjj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import cn.gwjjj.mapper.UserDatailsMapper;
import cn.gwjjj.mapper.UserLoginMapper;
import cn.gwjjj.model.UserDatails;
import cn.gwjjj.model.UserDatailsExample;
import cn.gwjjj.model.UserLogin;
import cn.gwjjj.model.UserLoginExample;
import cn.gwjjj.service.LoginService;
import cn.gwjjj.util.IsDigit;
import cn.gwjjj.util.LoginVal;
import cn.gwjjj.util.MD5Util;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {
	@Resource
	private UserLoginMapper userLoginMapper;
	@Resource
	private UserDatailsMapper userDatailsMapper;

	public UserLogin login(LoginVal logInVal) {
		// TODO Auto-generated method stub
		IsDigit isDigit = new IsDigit();
		UserLogin userLogin = new UserLogin();
		userLogin.setPassword(MD5Util.md5(logInVal.getPassword()));
		UserLoginExample example = new UserLoginExample();
		UserLoginExample.Criteria criteria = example.createCriteria();
		if (isDigit.isDigit(logInVal.getIdOrMail())) {
			criteria.andUserPhoneEqualTo(logInVal.getIdOrMail()).andPasswordEqualTo(userLogin.getPassword());
		} else {
			criteria.andUserMailEqualTo(logInVal.getIdOrMail()).andPasswordEqualTo(userLogin.getPassword());
		}

		List<UserLogin> logs = userLoginMapper.selectByExample(example);
		// System.out.println(logs.size());
		return (logs == null || logs.size() == 0) ? null : logs.get(0);
	}

	public Boolean UserRegister(LoginVal logInVal) {
		// TODO Auto-generated method stub
		IsDigit isDigit = new IsDigit();
		UserLogin userLogin = new UserLogin();
		userLogin.setPassword(MD5Util.md5(logInVal.getPassword()));
		UserDatails userDatails = new UserDatails();
		UserLoginExample example = new UserLoginExample();
		UserLoginExample.Criteria criteria = example.createCriteria();
		if (isDigit.isDigit(logInVal.getIdOrMail())) {
			userDatails.setUserPhone(logInVal.getIdOrMail());
			userLogin.setUserPhone(logInVal.getIdOrMail());
			criteria.andUserPhoneEqualTo(userLogin.getUserPhone());
		} else {
			userDatails.setUserMail(logInVal.getIdOrMail());
			userLogin.setUserMail(logInVal.getIdOrMail());
			criteria.andUserMailEqualTo(userLogin.getUserMail());
		}
		List<UserLogin> logs = userLoginMapper.selectByExample(example);
		System.out.println(logs.size());
		if (logs.size() == 0 || logs == null) {

			userLoginMapper.insert(userLogin);
			userDatailsMapper.insert(userDatails);
			// System.out.println("����ɹ�");
			return true;
		}
		// System.out.println("�����ʺ�");
		return false;
	}

	public UserDatails findByUserLogin(UserLogin userLogin) {
		UserDatailsExample example = new UserDatailsExample();
		UserDatailsExample.Criteria criteria = example.createCriteria();
		if (userLogin.getUserMail() != "" && userLogin.getUserMail() != null) {
			criteria.andUserMailEqualTo(userLogin.getUserMail());
		} else {
			criteria.andUserPhoneEqualTo(userLogin.getUserPhone());
		}

		List<UserDatails> logs = userDatailsMapper.selectByExample(example);
		return logs.get(0);
	}

}
