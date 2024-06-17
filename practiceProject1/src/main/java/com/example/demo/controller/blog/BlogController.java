package com.example.demo.controller.blog;
// Controller 폴더 밑에 blog라는 폴더 만들어줘서 블로그 관련 컨트롤러 작성

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("blog")
public class BlogController {
	@GetMapping("index") // blog/index
	public String blogMainMethod() {
		return "blog/blog-index";
	}
	
	
	// blog-board GetMapping 연결
	@GetMapping("board") // blog/board
	public String blogBoardMethod() {
		return "blog/blog-board";
	}
	
	
	
}
