package spring.DI;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		Foo f = context.getBean("foo1",Foo.class);
		/*f.doFoo();*/

	}

}
