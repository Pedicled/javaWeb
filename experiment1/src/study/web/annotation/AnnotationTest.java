package study.web.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
	public static void main(String[] args){
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("study/web/annotation/applicationContext.xml");
		UserController userController = (UserController) applicationContext.getBean("userController");
		userController.test();
	}
}
