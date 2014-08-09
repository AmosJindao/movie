package org.movie.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.movie.commons.Constants;
import org.movie.commons.utils.PropertiesLoader;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author amos
 * @date Aug 4, 2014 8:49:10 PM
 */
public class BaseController {

	@ExceptionHandler
	public ModelAndView exceptionHandle(HttpServletRequest rqeuest,
			HttpServletResponse response, Exception e) {
		ModelAndView mv = new ModelAndView();
		
		if(PropertiesLoader.getPropertyValue("model").equals(Constants.MODEL_DEBUG)){
			
		}

		return mv;
	}
}
