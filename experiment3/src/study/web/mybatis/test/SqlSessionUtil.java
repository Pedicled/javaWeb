package study.web.mybatis.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtil {
	private SqlSessionFactory ssf = null;
	public SqlSessionUtil(){
		try{
			Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
			ssf = new SqlSessionFactoryBuilder().build(reader);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	public SqlSession getSqlSession(){
		return ssf.openSession();
	}
}
