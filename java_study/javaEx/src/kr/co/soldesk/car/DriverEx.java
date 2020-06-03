package kr.co.soldesk.car;

public class DriverEx {

		public static void main(String[] args) {
			Sedan s1 = new Sedan(4,4,"보라");
			Sedan s2 = new Sedan(4,4,"하늘색");
			DumpTruck d1 = new DumpTruck(12,2,"갈색");
			DumpTruck d2 = new DumpTruck(4,4,"검은색");
			
			  s1.start();
		      s2.start();
		      d1.start();
		      s1.drive();
		      s2.drive();
		      d1.drive();
		      s1.stop();
		      d1.dumpUp();

			
			
			// 다형성
			// 객체지향 프로그래밍 5가지 특징
			// 상속, 다형성, 캡슐화, 정보은닉, 추상화
			
			Car c[]= {
					new Sedan(4,4,"빨강"),
					new Sedan(4,5,"파랑"),
					new Sedan(4,4,"빨강"),
					new DumpTruck(12,2,"검정"),
					new DumpTruck(12,2,"하양")
					};
			for(Car i: c) {
				i.start();
				i.drive();
				i.stop();
			}
			
	}

}
