package study.web.JDKProxy;

public class Test {
	public static void main(String[] args){
		JdkProxy jp = new JdkProxy();
		Animal animal = new Dog();
		Animal dog = (Animal) jp.createProxy(animal);
		dog.eat();
	}
}
