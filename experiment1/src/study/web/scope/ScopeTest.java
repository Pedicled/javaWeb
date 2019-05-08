package study.web.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
	public static void main(String[] args){
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("study/web/scope/applicationContext.xml");
		System.out.println("--singleton--");
		System.out.println(applicationContext.getBean("scope.singleton"));
		System.out.println(applicationContext.getBean("scope.singleton"));
		System.out.println(applicationContext.getBean("scope.singleton"));
		System.out.println("--prototype--");
		System.out.println(applicationContext.getBean("scope.prototype"));
		System.out.println(applicationContext.getBean("scope.prototype"));
		System.out.println(applicationContext.getBean("scope.prototype"));
	}
}
