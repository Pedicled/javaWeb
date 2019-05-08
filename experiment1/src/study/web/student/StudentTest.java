package study.web.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import study.web.student.Student;

public class StudentTest {
	
	public static void main(String[] main){
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("study/web/student/applicationContext.xml");
		Student student = (Student) applicationContext.getBean("student");
		student.test();
	}
}
