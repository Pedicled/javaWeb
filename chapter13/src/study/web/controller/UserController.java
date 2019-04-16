package study.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import study.web.po.User;
import study.web.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

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



    @RequestMapping("/toUser")
    public String selectUsers(){
        return "user";
    }
    @RequestMapping("/deleteUsers")
    public String deleteUsers(Integer[] ids){
        if(ids!=null){
            for(Integer id:ids)
                System.out.println("删除ID为："+id+"的用户");
        }
        else{
            System.out.println("ids=null");
        }
        return "success";
    }



    @RequestMapping("/toUserEdit")
    public String toUserEdit(){
        return "user_edit";
    }
    @RequestMapping("/editUsers")
    public String editUsers(UserVO userList){
        List<User> users = userList.getUsers();
        for(User user: users){
            if(user.getId()!=null)
                System.out.println("修改了id为"+user.getId()+"的用户名为："+user.getUsername());
        }
        return "success";
    }



}
