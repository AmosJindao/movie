package org.movie.controller.movie;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.movie.bean.Movie;
import org.movie.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author amos
 * @date Jul 27, 2014 6:54:35 PM
 */
@Controller("movie")
@RequestMapping("movie")
public class MovieController extends BaseController {
	
	private static Logger log = LoggerFactory.getLogger(MovieController.class);
	
	@RequestMapping("movieList.do")
	@ResponseBody
	public Map<String, Object> moviePage(@RequestBody Movie movie){
		log.info("tests info");
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", true);
		map.put("id", movie.getId());
		map.put("name", movie.getMovieName());
		
		return map;
	}
	
	@RequestMapping("movieDetail.do")
	@ResponseBody
	public ModelAndView movieDetail(HttpServletRequest request,HttpServletResponse response){
		log.info("tests info");
		
		ModelAndView mv = new ModelAndView("movie/movie");
		
//		System.out.println("contextPath:"+request.getContextPath());
		
		mv.addObject("name", "movieDetail");
		
		return mv;
	}
}
