package com.myown.web;

import javax.servlet.http.HttpServletRequest;
import com.controller.Controller;
import com.controller.RequestMapping;

@Controller("indexController")
public class IndexController {
	@RequestMapping("index.do")
	public String index_page(HttpServletRequest request) throws Exception {
		
		return "main/index";
	}
}