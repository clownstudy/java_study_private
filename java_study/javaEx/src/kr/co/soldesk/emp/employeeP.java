package kr.co.soldesk.emp;

public class employeeP {
	//멤버 변수 : 이름, 직위
	// 출근메소드, 퇴근메소드(clockout), 근무메소드(work)
// 생성자가 없을 때는 default생성자가 존재한다. 다른 생성자를 작성하면 default생성자는 사라진다.

// overloading - 이름이 같은데 인수의 갯수나 타입 등이 다를 때.	
// default 생성자 만드는 방법	. 지정된 생성자의 인수와 다른 타입, 갯수를 지정해서 적용할 수 있다.
	public employeeP() {
}

public employeeP(String name, String posit, String tel) {
	this.name = name;
	this.posit = posit;
	this.tel = tel;
}
	
	
	private String name;
	private String posit;
	private String tel;
	//setter, getter
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setPosit(String posit) {
		this.posit = posit;
	}
	
	public String getPosit() {
		return posit;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getTel() {
		return tel;
	}
	
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
