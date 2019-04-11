package springmvc.study;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/hello")
public class FirstController {
    @RequestMapping(value="/firstController")
    public String handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,Model model){
        model.addAttribute("msg","这是我的第二个MVC程序");
        return "first";

    }
}
