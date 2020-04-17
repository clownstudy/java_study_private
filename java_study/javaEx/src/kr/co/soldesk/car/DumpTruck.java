package kr.co.soldesk.car;

public class DumpTruck extends Car {
// 반드시 @Override 재정의를 해줘야함.
	public DumpTruck(int wheel, int doors, String color) {
		super(wheel,doors,color);
	}
	public void dumpUp() {
		System.out.println("적재칸을 올린다.");
		
	}
	public void dumpDown() {
		System.out.println("적재칸을 내린다.");
		
	}
	
	@Override
	public void start() {
		System.out.println("시동을 건다");
	}

	@Override
	public void stop() {
		System.out.println("시동을 끈다");
		
	}

	@Override
	public void drive() {
		System.out.println("기어를 바꾼다.");
		System.out.println("안전하게 전진한다.");
	}

	@Override // 재정의
	public void reDrive() {
		System.out.println("기어를 바꾼다.");
		System.out.println("경고음이 울린다.");
		System.out.println("후방을 주시하며 후진한다.");
	}
}
