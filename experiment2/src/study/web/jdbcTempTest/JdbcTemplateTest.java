package study.web.jdbcTempTest;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateTest {
	@Test
	public void testCreate(){
		/*
		 * 建student表
		 */
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("study/web/jdbcTempTest/applicationContext.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
		String str = "CREATE TABLE student("
				+ "stuno INT AUTO_INCREMENT,"
				+ "stuname char(8),"
				+ "birthday char(20),"
				+ "gender char(4),"
				+ "score DOUBLE,"
				+ "PRIMARY KEY(stuno)"
				+ ")";
		jdbcTemplate.execute(str);
		System.out.println("student表已创建");
	}
	
	@Test
	public void testAddStudent(){
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("study/web/jdbcTempTest/applicationContext.xml");
		StudentDao studentDao = (StudentDao) applicationContext.getBean("studentDao");
		Student student = new Student();
		student.setStuname("john");
		student.setBirthday("19991130");
		student.setGender("男");
		student.setScore(230.0);
		int num = studentDao.addStudent(student);
		if(num>0)
			System.out.println("成功插入1条数据");
		else
			System.out.println("失败");
	}
	
	@Test
	public void testUpdateSudent(){
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("study/web/jdbcTempTest/applicationContext.xml");
		StudentDao studentDao = (StudentDao) applicationContext.getBean("studentDao");
		
		int num = studentDao.updateStudent();
		if(num>0)
			System.out.println("成功修改了1条数据");
		else
			System.out.println("失败");
	}
	
	@Test
	public void testFindStudent(){
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("study/web/jdbcTempTest/applicationContext.xml");
		StudentDao studentDao = (StudentDao) applicationContext.getBean("studentDao");
		
		List<Student> list = studentDao.findStudent();
		for(Student stu:list)
			System.out.println(stu);
	}
	
	@Test
	public void testDeleteTXStudent(){
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("study/web/jdbcTempTest/applicationContext.xml");
		StudentDao studentDao = (StudentDao) applicationContext.getBean("studentDao");
		int num = studentDao.deleteStudent();
		if(num>0)
			System.out.println("成功修改了"+num+"条数据");
		else
			System.out.println("失败");
	}
}
