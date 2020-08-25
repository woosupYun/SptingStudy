package org.zerock.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.CustomMemberEditor;
import org.zerock.domain.Member;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/arg/*")
@Log4j
public class ArgumentController {
	
	// /arg/a?name=john
	@RequestMapping("/a")
	public void method1(HttpServletRequest req) {
		log.info(req);
		log.info(req.getParameter("name"));
	}
	
	@RequestMapping("/b")
	public void method2(@RequestParam("name") String name) {
		log.info("method b");
		log.info(name);
	}
	
	@RequestMapping("/c")
	public void method3(@RequestParam String name) {
		log.info("method c");
		log.info(name);
	}
	
	@RequestMapping("/d")
	public void method4(String name) {
		log.info("method d");
		log.info(name);
	}
	
	// /e?name=jhon&age=100
	@RequestMapping("/e")
	public void method5(HttpServletRequest req) {
		log.info("method e");
		log.info(req.getParameter("name"));
		log.info(req.getParameter("age"));
	}
	
	@RequestMapping("/f")
	public void method5(String name, String age) {
		log.info("method f");
		log.info(name);
		log.info(age);
	}
	
	@RequestMapping("/g")
	public void method6(String name, int age) {
		log.info("method g");
		log.info(name);
		log.info(age);
	}
	
	@RequestMapping("/h")
	public void method7(String name, int age) {
		log.info("method h");
		
		Member member = new Member();
		member.setName(name);
		member.setAge(age);
		
		log.info(member);
	}
	
	@RequestMapping("/i")
	public void method8(Member member) {
		log.info("method i");
		
		log.info(member);
	}
	
	@RequestMapping("/j")
	public void method9(@RequestParam String[] name) {
		log.info("method j");
		log.info(name.length);
		for(String n: name) {
			log.info(n);
		}
	}
	
	@RequestMapping("/k")
	public void method10(@RequestParam("n") List<String> name) {
		log.info("method k");
		log.info(name.size());
		for(String n: name) {
			log.info(n);
		}
	}
	
	@RequestMapping("/l")
	public void method11(Member member) {
		log.info("method l");
		log.info(member);
	}
	
	@RequestMapping("/n")
	public void method12(@RequestParam("mem") Member member) {
		log.info("method n");
		log.info(member);
	}
	
	@RequestMapping("/m")
	public void method13(@RequestParam("date") Date date) {
		log.info("method m");
		log.info(date);
	}
	
	@RequestMapping("/o")
	public void method14(Model model) {
		log.info("method o");
		log.info(model);
		
		model.addAttribute("my-attr", "my-value");
		
		log.info(model);
	}
	
	@RequestMapping("/p")
	public void method15(@ModelAttribute("str") String str, Model model) {
		log.info("method p");
		log.info(model);
		
		//model.addAttribute("attr", service.get(str));
		//model.addAttribute("str", str);
		
		log.info(model);
	}
	
	@RequestMapping("/q")
	public void method16(Model model) {
		log.info("method q");
		
		model.addAttribute("str", "str-value");
		model.addAttribute("str-value");
		model.addAttribute(new Member());
		model.addAttribute(new String[] {"a","b"});
		
		List<Member> mlist = new ArrayList<Member>();
		mlist.add(new Member());
		model.addAttribute(mlist);
		
		log.info(model);
	}
	
	@RequestMapping("/r")
	public void method17(@ModelAttribute Member member, Model model) {
		log.info("method r");
		
		log.info(model);
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format, false));
		binder.registerCustomEditor(Member.class, new CustomMemberEditor());
	}
}
