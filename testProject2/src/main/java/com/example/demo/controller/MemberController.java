package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.Member;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("member")
public class MemberController {
	
	@GetMapping("memberInfo")
	public String memberInfo(Model model) {
		
		Member mem = new Member();
		mem.setMemberName("황진수");
		mem.setMemberPhone("010-0000-0000");
		mem.setMemberAge(10);
		model.addAttribute("mem", mem);
		
		List<Member> memList = new ArrayList<>();
		memList.add(new Member("홍길동", "010-1111-1111", 10));
		memList.add(new Member("김영희", "010-2222-2222", 20));
		memList.add(new Member("박철수", "010-3333-3333", 30));
			
		model.addAttribute("memList", memList);
		
		log.info("들어왔는지 확인");
		log.debug("문제없는지 확인");
		
		return "member/memberInfo";
		/*
		 * org.thymeleaf.exceptions.TemplateInputException : An error~~~
		 * 1. 파일 위치롸 이름이 제대로 맞는지
		 * 2. Member로 객체이름을 작성할 경우
		 * 		import java.lang.reflect.Member; 주소와
		 * 		개발자가 만들어준 주소값이 나옴
		 * 		여기에서 개발자가 만들어준 주소값으로 Member객체를 필히 가져와야함
		 * */
	}
}
