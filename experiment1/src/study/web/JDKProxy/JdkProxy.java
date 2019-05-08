package study.web.JDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
public class JdkProxy implements InvocationHandler{
	private Animal animal;
	public Object createProxy(Animal animal){
		this.animal = animal;
		ClassLoader cl = JdkProxy.class.getClassLoader();
		Class[] clazz = animal.getClass().getInterfaces();
		return Proxy.newProxyInstance(cl, clazz, this);
	}
	
	public Object invoke(Object proxy,Method method,Object[] args) throws Throwable{
		AnimalAspect aa = new AnimalAspect();
		aa.before();
		Object obj = method.invoke(animal, args);
		aa.after();
		return obj;
	}
}
