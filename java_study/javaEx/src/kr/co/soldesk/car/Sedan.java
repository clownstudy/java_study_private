package kr.co.soldesk.car;

public class Sedan extends Car {
	// 추상메소드는 반드시 하위클래스에서 구현해야함.
	// 오버라이드 상위클래스의 메소드를 구현하는 행위
	public Sedan(int wheel, int doors, String color) {
		super(wheel,doors,color);
	}

	@Override
	public void start() {
		System.out.println("시동을 걸다");
	}

	@Override
	public void stop() {
		System.out.println("시동을 끄다");

	}

	@Override
	public void drive() {
		System.out.println("기어를 바꾼다.");
		System.out.println("전진");

	}

	@Override
	public void reDrive() {
		System.out.println("기어를 바꾼다.");
		System.out.println("경고음이 울린다.");
		System.out.println("후진");

	}

}
