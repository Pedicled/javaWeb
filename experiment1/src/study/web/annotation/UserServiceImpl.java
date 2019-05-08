package study.web.annotation;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource(name="userDao")
	private UserDao userDao;
	public void test(){
		this.userDao.test();
		System.out.println("UserService...");
	}
}
