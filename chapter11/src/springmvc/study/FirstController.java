package springmvc.study;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

public class FirstController implements org.springframework.web.servlet.mvc.Controller{
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg","这是我的第一个MVC程序");
        mav.setViewName("/WEB-INF/jsp/first.jsp");
        return mav;
    }
}
