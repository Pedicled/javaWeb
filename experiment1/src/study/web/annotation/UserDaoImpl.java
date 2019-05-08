package study.web.annotation;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao{
	public void test(){
		System.out.println("UserDao...");
	}
}
