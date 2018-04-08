package com.xinhua.oa.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xinhua.oa.model.pojo.ProdUser;

/**
 * 系统默认进入的controller
 * @author Sun mengJie
 *
 */
@Controller
@RequestMapping("/")
public class SysController {

	/**
	 * 跳转到login页面
	 * @return
	 */
	@RequestMapping("/login")
	public String login(){
		
		return "login";
	}
	
	@RequestMapping("/signUp")
	public String signUp(){
		
		return "signUp";
	}
	
	@RequestMapping("/signUp/submit")
	@ResponseBody
	public String submit(ProdUser user){
		
		return "signUp";
	}
}
