package Basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UnitMain03 {
	public static void main(String[] args) {
//		String xmlLocation = "classpath:applicationContext.xml";
		@SuppressWarnings("resource")
		ApplicationContext context 
//			= new ClassPathXmlApplicationContext(xmlLocation);
			= new FileSystemXmlApplicationContext("C:\\Users\\BIT\\eclipse-workspace\\maven-web\\src\\main\\resources\\applicationContext.xml");
		
		// Bean 불러오지 않아도 만들어져 있는 것들을 불러온다.
		Unit obj = (Unit)context.getBean("unit01");
		obj.prnMsg();
	}
}
