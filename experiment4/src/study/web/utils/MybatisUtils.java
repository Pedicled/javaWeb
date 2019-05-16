package study.web.utils;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtils {
	
	private static SqlSessionFactory ssf = null;
	static{
		try{
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			ssf = new SqlSessionFactoryBuilder().build(reader);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSession(){
		return ssf.openSession();
	}
	
}
