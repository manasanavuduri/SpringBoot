package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
@RequestMapping("home")	

public String home(String Myname,HttpSession session) {
	//HttpSession session =req.getSession();
//	String name=req.getParameter("name");
	System.out.println("Hi Everyone :) -"+Myname);
	session.setAttribute("name", Myname);
	return "home";
}
}
