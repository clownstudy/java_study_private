package javaEx;

public class HelloEx {
// public 접근 제한자. 모든 객체에서 사용이 가능
// private 접근 제한자 중, 클래스 내부에서만 사용 가능
// Protected 상속관계에서 사용 가능
// 없는 것 (default)는 같은 패키지 안에 있으면사용 가능.
	
	// main = 메소드(static이 붙어서 정적 메소드). 한번만 만들어진다. 
	// static이 붙어서 한번만 사용된다.
	// String = 인수. args= 인수의 이름으로 사용됨. String[]이므로 배열로 생성되었다.
	// 자바는 배열에서 길이를 구분하지 않는다.
	public static void main(String[] args) {
		System.out.println("안녕하슈222");
		// 객체로 사용하기
		// 선언을 하고 생성
		// HelloEx he = new HelloEx(); // HelloEx = instance he = 레퍼런스(변수)
		// String str = he.toString();
		// System.out.println("객체 String:"+str);
		
		// Integer는 클래스. int와는 차이점이 존재한다. 
		// parseInt는 static 메소드.
		// 클래스 이름에 붙는 메소드는 다 static임. 
		int arg1 = Integer.parseInt(args[0]);
		int arg2 = Integer.parseInt(args[1]);
		// 사칙연산 ( + - * / )
		System.out.println(arg1+arg2);
		System.out.println(arg1-arg2);
		System.out.println(arg1*arg2);
		System.out.println(arg1/arg2);
		System.out.println(arg1%arg2);
	}
		
}