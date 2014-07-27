package org.movie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author amos
 * @date Jul 26, 2014 11:21:33 AM
 */
@Controller
@RequestMapping("account")
public class AccountController {

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
	
	@ExceptionHandler
	@ResponseBody
	public String exceptionHandle(Throwable e){
		return e.getMessage();
	}
}
