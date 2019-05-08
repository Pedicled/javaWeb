package study.web.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

@Controller("userController")
public class UserController {
	@Resource(name="userService")
	private UserService userService;
	public void test(){
		this.userService.test();
		System.out.println("userController...");
	}
}
