package sign.in.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import sign.in.po.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登陆拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        //获取请求的URL
        String url = httpServletRequest.getRequestURI();
        //只true:/login，剩下的全部拦截
        if(url.indexOf("/login")>=0) {
            return true;
        }
        //获取session
        {
            HttpSession session = httpServletRequest.getSession();
            //getUser_SESSION(可登陆的user)
            User user = (User) session.getAttribute("USER_SESSION");
            //判断user中是否有用户数据
            if (user != null) {
                return true;
            }
            //否则给出提示信息，并转发到登陆页面
            httpServletRequest.setAttribute("msg", "请先登录！");
            httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(httpServletRequest, httpServletResponse);
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
