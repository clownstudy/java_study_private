package kr.co.soldesk.emp;

public class company {

	public static void main(String[] args) {
		// 홍길동, 사원
		// 나과장, 대리
		// 김사원, 과장

		employee e1 = new employee();
		e1.name = "홍길동";
		e1.posit = "사원";

		employee e2 = new employee();
		e2.name = "나과장";
		e2.posit = "대리";

		employee e3 = new employee();
		e3.name = "김사원";
		e3.posit = "과장";

//		for(int i=1; i<4; i++) {
//			String i2 = i;
//			('e'+i2).clockIn();
//		}
		e1.clockIn();
		e1.clockOut();
		e1.work();
		
		employeeP ep1 = new employeeP();
		ep1.setName("김태웅");
		ep1.setPosit("대리");
		ep1.setTel("01000000000");
		ep1.clockIn();
		ep1.clockOut();
		ep1.work();
		System.out.println(ep1.getName());
		
		employeeP ep2 = new employeeP("봉준호","감독","01029405910");
		ep2.clockIn();
		ep2.clockOut();
		ep2.work();
	}

}
