package study.web.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import study.web.pojo.*;
import study.web.utils.MybatisUtils;

public class OrdersProductsTest {
	private static SqlSession ss = MybatisUtils.getSession();
	
	@Test
	public void findOrderPro(){
		List<OrderPro> op = ss.selectList("study.web.mapping.OrderProMapper.findOrderPro",1);
		System.out.println(op);
		ss.close();
		
	}
}
