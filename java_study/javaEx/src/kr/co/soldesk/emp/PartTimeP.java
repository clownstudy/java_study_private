package kr.co.soldesk.emp;

	public class PartTimeP extends employeeP {
		private int part; // protected 면 상속받은 애들 쓸 수 있음. private은 본인만.
		private int timePay=8590;
		public PartTimeP() {
			
		}
		public PartTimeP(String name, String posit, String tel, int part) {
//			super.name = name; // 상위 클래스가 private이기 때문에 에러남.
//			super.posit = posit;
//			super.tel = tel;
			super(name,posit,tel);
			this.part = part;
		}
		/*
		 생성자는 클래스를 인스턴스화 하는 도구.
		 	초기값을 넣어서 원하는 초기값 세팅 가능할 수 있음.
		 	overloading을 통해 여러가지 형태로 만들 수 있음.
		 	인자(파라메터) 수를 변경하거나 타입을 변경해서 처리할 수 있음.
		 	클래스 내부에(멤버변수, 필드)있는 전역변수를 사용하거나 호출할 경우 this, this()--생성자.
		 상속 : 지금 새로 정의하려는 클래스가 기존에 있는 클래스에 추가 필드, 메소드만 있으면 되는 경우, 약간의 수정이 있는 경우
		 	상속을 받으면 상위클래스(부클래스)에 있는 모든 필드와 메소드를 상속 받는 것임. 키워드(extends)
		 상위클래스를 표현하는 방법 : 부클래스, 상위클래스, superClass
		 	상위클래스에 있는 필드나 메소드를 사용하려면 super.
		 	상위클래스에 있는 생성자를 사용하려면 super()
		 */
		public int getPart() {
			return part;
		}
		
		public void setPart(int part) {
			this.part = part;
		}
		
		public int dayPay() {
			return part*timePay;
		}

}