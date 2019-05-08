package study.web.JDKProxy;

public class AnimalAspect {
	public void before(){
		System.out.println("Starting to eat!");
	}
	public void after(){
		System.out.println("Bye!");
	}
}
