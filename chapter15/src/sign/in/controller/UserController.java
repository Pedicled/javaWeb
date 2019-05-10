package sign.in.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sign.in.po.User;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    /**
     * 跳转到用户登陆界面
     * @return "login.jsp"
     */
   // @GetMapping("/login")   //404
    @RequestMapping(value="/login",method=RequestMethod.GET)
    public String toLogin(){
        return "login";
    }

    /**
     * 用户登陆
     * @param user
     * @param model
     * @param session 添加用户对象到session
     * @return
     */
   // @PostMapping("/login")    //404
    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String login(User user,Model model,HttpSession session){
        String username = user.getUsername();
        String password = user.getPassword();
        //模拟判断请求数据与数据库数据是否匹配
        if(username!=null&&username.equals("xiaoxue")&&password!=null&&password.equals("123456")){
            //将用户对象添加到session
            session.setAttribute("USER_SESSION",user);
            //重定向到主页面的跳转方法
            return "redirect:main";
        }
        model.addAttribute("msg","用户名或密码错误，请重新登录！");
        return "login";
    }

    /**
     * 跳转主页面
     * @return
     */
    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    /**
     * 退出登陆
     * @return
     */
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        //清除session
        session.invalidate();
        //重定向到登陆页面的跳转方法
        return "redirect:login";
    }
}
