package egovframework.co.kr.board.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import egovframework.co.kr.board.service.BoardService;

@Controller
public class BoardController {
	
	@Resource(name="boardService")
	private BoardService boardService;
	
	@RequestMapping(value ="/main.do" , method = RequestMethod.GET )
	public String listPage(Model model) {
		model.addAttribute("list", boardService.boardList());
		return "/board/list";
	}
}
