package kr.co.soldesk.emp;

public class employee {
	//멤버 변수 : 이름, 직위
	// 출근메소드, 퇴근메소드(clockout), 근무메소드(work)
	public String name;
	public String posit;
	public void clockIn() {
		System.out.println(name+"님이(가) 출근하셨습니다.");
	}
	public void clockOut() {
		System.out.println(name+"님이(가) 퇴근하셨습니다.");
	}
	public void work() {
		System.out.println(posit+" "+name+"님이(가) 퇴근하셨습니다.");
	}

	
}
