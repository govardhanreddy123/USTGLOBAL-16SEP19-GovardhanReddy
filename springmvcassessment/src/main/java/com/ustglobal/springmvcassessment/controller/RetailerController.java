package com.ustglobal.springmvcassessment.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.springmvcassessment.beans.Retailer;
import com.ustglobal.springmvcassessment.repo.RetailerService;

@Controller
public class RetailerController {
	
	@Autowired
	private RetailerService service;
	
	@GetMapping("/createprofile")
	public String createProfilePage() {

		return "createprofile";

	}//end of createProfilePage

	@PostMapping("/createprofile")
	public String createProfile(Retailer bean,ModelMap map) {

		int check = service.createProfile(bean);
		if(check > 0) {

			map.addAttribute("msg", "You are Registered and  ID is "+check);
		}else {

			map.addAttribute("msg", "Email is repeated");
		}

		return "login"; 

	}//end of createProfile
	
	@GetMapping("/login")
	public String loginPage() {

		return "login";
	}//end of login page
	@PostMapping("/login")
	public String login(int id ,String password,HttpServletRequest request) {
		Retailer bean = service.login(id, password);
		if(bean==null) {
			request.setAttribute("msg", "Invalid Credentials");
			return "login";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}
	}//end of login()
	
	@GetMapping("/home")
	public String home( ModelMap map,@SessionAttribute( name = "bean",required = false) Retailer bean) {

		if(bean==null) {
			map.addAttribute("msg", "login first!!!!");
			return "login";
		}else {
			return "home";
		}
	}//end of home

	@PostMapping("/home")
	public String home() {

		return "home";
	}//end of home()
	
	
	@GetMapping("/search")
	public String search(@RequestParam("id") int id,ModelMap map) {

		Retailer bean = service.search(id);
		if(bean==null) {
			map.addAttribute("msg", "Data not Found");
		}else {
			map.addAttribute("bean", bean);
		}
		return "home";

	}//end of search()

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}//end of logout
	
	@GetMapping("/updatepassword")
	public String updatePassword(HttpServletRequest request) {

		HttpSession session = request.getSession(false);
		if(session!=null) {
			return "updatepassword";
		}else {
			return "login";
		}

	}

	@PostMapping("/updatepassword")
	public String updatePassword(String  password,String confirmpassword,@SessionAttribute(name="bean")Retailer bean,ModelMap map) {

		if(password.equals(confirmpassword)) {
			service.updatePassword(bean.getId(), password);
			map.addAttribute("msg","password changed");
		}else {
			map.addAttribute("msg","password  Not changed"); 
		}
		return "home";
	}



}
