package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/userLogin")
	public String userLogin() {
		return "/user/UserLogin";
	}
	
	@RequestMapping("/userJoin")
	public String userJoin() {
		return "/user/UserJoin";
	}
	
	@RequestMapping("/userFind")
	public String userFind() {
		return "/user/UserFind";
	}
	
	@RequestMapping("/userFindId")
	public String userFindId() {
		return "/user/UserFindId";
	}
	
	@RequestMapping("/userFindPw")
	public String userFindPw() {
		return "/user/UserFindPw";
	}
}
