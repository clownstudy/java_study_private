package kr.co.soldesk.emp;

public class Company2 {
	public static void main(String[] args) {
		PartTimeP p = new PartTimeP("알바생","알바","010-2938-5920",12);
		
		System.out.println(p.getName());
		p.clockIn();
		p.clockOut();
		System.out.println(p.dayPay());
	}
}
