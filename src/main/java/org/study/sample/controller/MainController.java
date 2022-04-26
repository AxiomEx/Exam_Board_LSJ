package org.study.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class MainController {

	@GetMapping("/")
	// '/' 라는 주소로 접속하면 index.jsp로 연결
	public String index() {
		return "index";
	}
	
//	@GetMapping("/")
//	
//	public String index() {
//		return "member/memberInsert";
//	}
	
//	@GetMapping("/a")
//	public String a() {
//		return "test";
//	}
	
//	@GetMapping("/test")
//	public String test() {
//		return "test";
//	}
//	
//	@PostMapping("/formPostEx")
//	public String formPostEx(@RequestParam("user_id")String user_id, @RequestParam("user_pw")String user_pw) {
//		System.out.println("formPostEx() 메서드 작동");
//		System.out.println("user_id 값 : " + user_id);
//		System.out.println("user_pw 값 : " + user_pw);
//		
//		return "redirect:/";
//	}
	
}
