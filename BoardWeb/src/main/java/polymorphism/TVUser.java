package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {

//		1. Interface ����
//		TV tv = new SamsungTV();
//		tv.powerOn();
//		tv.powerOff();
//		tv.volumeUp();
//		
//		
//		TV tv2 = new LgTV();
//		tv2.powerOn();
//		tv2.volumeDown();

// 		2. Factory ���� ����
//		BeanFactory factory = new BeanFactory();
//		TV tv = (TV) factory.getBean(args[0]);
//		tv.powerOn();
		
//		3. Spring ����
//		3-1. Spring �����̳� ����
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
//		3-2. Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û(Lookup)�Ѵ�.
//		TV tv=(TV) factory.getBean("tv");
//		tv.powerOn();
//		tv.volumeUp();
//		tv.powerOff();
		
//		3-3. Spring �����̳ʸ� �����Ѵ�.
//		factory.close();
		
		TV tv1 = (TV)factory.getBean("tv");
		TV tv2 = (TV)factory.getBean("tv");
		tv1.powerOn();
		tv1.volumeUp();
		tv1.volumeDown();
		factory.close();

	}
}
