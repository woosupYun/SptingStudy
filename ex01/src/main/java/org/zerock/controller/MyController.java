package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;

@Controller
//@RequestMapping(value = "/my/*")
@Log4j
public class MyController {
	@RequestMapping(value="")
	public void myHandler1() {
		log.info("test1...");
	}

	@RequestMapping(value="/a")
	public void myHandler2() {
		log.info("test2...");
	}

	@RequestMapping(value="/b")
	public void myHandler3() {
		log.info("test3...");
	}
	
	@RequestMapping(value="/c", method = RequestMethod.GET)
	public void myHandler4() {
		log.info("test4...GET");
	}
	
	@RequestMapping(value="/c", method = RequestMethod.POST)
	public void myHandler5() {
		log.info("test5...POST");
	}
	
	@PostMapping("/d")
	public void myHandler6() {
		log.info("test6...POST");
	}
	
	@GetMapping("/d")
	public void myHandler7() {
		log.info("test6...GET");
	}
}
