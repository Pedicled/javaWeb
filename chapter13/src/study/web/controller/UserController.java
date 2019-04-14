package study.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import study.web.po.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * @RequestParam("...") 修改页面请求参数的名字
     */
    @RequestMapping("/selectUser")
    public String selectUser(@RequestParam("user_id")Integer id){
//        String id = request.getParameter("id");
        System.out.println("id = "+id);
        return "success";
    }

    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }

    @RequestMapping("/registerUser")
    public String registerUser(User user){
        String username = user.getUsername();
        Integer password = user.getPassword();
        System.out.println("username = " +username);
        System.out.println("password = " +password);
        return "success";
    }
}
