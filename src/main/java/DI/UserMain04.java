package DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserMain04 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx 
			= new GenericXmlApplicationContext("diAppCtx02.xml");
		
		MyCalculator my = ctx.getBean("myCalculator", MyCalculator.class);
		my.add();
		my.sub();
		my.mul();
		my.add();
	}
}
