package org.movie.controller.account;

import org.movie.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author amos
 * @date Jul 26, 2014 11:21:33 AM
 */
@Controller("account")
@RequestMapping("account")
public class AccountController extends BaseController{

	@RequestMapping(value = "login.do")
	@ResponseBody
	public String login() {
		String result = "hello World!";
		return result;
	}

	@RequestMapping(value = "reg.do")
	@ResponseBody
	public String register() {
		String result = "";
		
		if (result.equals(""))
			throw new RuntimeException("exception Test;");
		
		return result;
	}
}
