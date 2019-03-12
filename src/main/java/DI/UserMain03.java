package DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserMain03 {
	public static void main(String[] args) {
		// 스프링 생성자 DI
		@SuppressWarnings("resource")
		ApplicationContext ctx
			= new GenericXmlApplicationContext("classpath:diAppCtx01.xml");
		
		MyCalculator my = ctx.getBean("myCalculator", MyCalculator.class);
		my.setFirstNum(3);
		my.setSecondNum(7);
		
		my.add();
		my.sub();
		my.mul();
		my.div();
			
	}
}
