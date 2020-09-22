package polymorphism;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
	@Autowired
	private Speaker speaker;

	public void powerOn() {
		System.out.println("LGTV--���� Ŵ");
	}

	public void powerOff() {
		System.out.println("LGTV--���� ��");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}
}
