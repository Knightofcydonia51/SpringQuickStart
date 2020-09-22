package polymorphism;

public class LgTV implements TV {

	public void powerOn() {
		System.out.println("LGTV--전원 킴");
	}

	public void powerOff() {
		System.out.println("LGTV--전원 끔");
	}

	public void volumeUp() {
		System.out.println("LGTV--소리 올림");
	}

	public void volumeDown() {
		System.out.println("LGTV--소리 줄임");
	}
}
