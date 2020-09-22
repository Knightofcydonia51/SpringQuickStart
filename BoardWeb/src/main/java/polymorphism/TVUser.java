package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {

//		1. Interface 사용시
//		TV tv = new SamsungTV();
//		tv.powerOn();
//		tv.powerOff();
//		tv.volumeUp();
//		
//		
//		TV tv2 = new LgTV();
//		tv2.powerOn();
//		tv2.volumeDown();

// 		2. Factory 패턴 사용시
//		BeanFactory factory = new BeanFactory();
//		TV tv = (TV) factory.getBean(args[0]);
//		tv.powerOn();
		
//		3. Spring 사용시
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		

	}
}
