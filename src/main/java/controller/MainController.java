package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class MainController {

	@RequestMapping("board")
	public String board() {
		return "redirect:/board/boardList";
	}
	
	@RequestMapping("user")
	public String user() {
		return "redirect:/user/userLogin";
	}
}
