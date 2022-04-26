package org.study.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.study.sample.model.BoardDTO;
import org.study.sample.model.ReplyDTO;
import org.study.sample.service.BoardService;
import org.study.sample.service.MemberService;
import org.study.sample.service.ReplyService;

@Controller
public class ReplyController {

	@Autowired
	private ReplyService ReplyService;
	
	@GetMapping("/boardList")
	public String replyList(Model model) {
		
		List<ReplyDTO> list = ReplyService.replyList();
		model.addAttribute("list", list);
		
		return "board/boardList";
	}
	
	@GetMapping("/replyInsert")
	public String replyInsert() {
		
		return "board/boardInsert";
	}
	
}
