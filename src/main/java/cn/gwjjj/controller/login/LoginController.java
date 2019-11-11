package cn.gwjjj.controller.login;

import cn.gwjjj.model.UserDatails;
import cn.gwjjj.model.UserLogin;
import cn.gwjjj.util.LoginVal;
import cn.gwjjj.util.MGResult;
import cn.gwjjj.service.LoginService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by sapling on 2017-12-24.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	@Resource
	private LoginService loginService;

	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
	@ResponseBody
	public MGResult loginCheck(LoginVal logInVal, HttpServletRequest request) {
		MGResult result = new MGResult();
		UserLogin userLogin = loginService.login(logInVal);
		if (userLogin == null) {
			result.setData(0);
		}

		else {
			UserDatails UserDatails = loginService.findByUserLogin(userLogin);
			HttpSession se = request.getSession();
			se.setAttribute("userd", UserDatails);
			result.setData(1);
		}
		return result;
	}

	@RequestMapping("/loginToHome")
	public String loginToHome() {
		return "redirect:/control/countAll";
	}

	@RequestMapping(value = "/register")
	@ResponseBody
	public MGResult Register(LoginVal loginVal) {
		MGResult result = new MGResult();
		if (!loginService.UserRegister(loginVal)) {
			result.setStatus(0);
		} else
			result.setStatus(1);
		return result;

	}

}
