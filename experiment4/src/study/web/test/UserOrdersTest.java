package study.web.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import study.web.pojo.*;

import study.web.utils.MybatisUtils;

public class UserOrdersTest {
	private SqlSession ss = MybatisUtils.getSession();
	@Test
	public void findUserWithOrders(){
		User user = ss.selectOne("study.web.mapping.UserMapper.findUserWithOrders",3);
		System.out.println(user);
		ss.close();
	}
}
