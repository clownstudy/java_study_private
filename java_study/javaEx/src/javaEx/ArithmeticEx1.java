package javaEx;

public class ArithmeticEx1 {
// 클래스 전체 사용하는 변수는 멤버 변수 또는 필드 또는 속성이라고도 한다.
// 클래스 내부에 있는 메소드(기능)은 멤버메소드 라고 한다. 
public String str;
public int data1;
public int data2;

// 현재 멤버 변수를 3개 선언함. str, data1, data2

// add, sub, mul, div 라는 메소드를 각각 선언.
// 메소드는 접근 제한자, 반환값, 이름, 인수 형태로 들어간다.
// 

	public int add() {
		// 메소드 내에 인수인 da1과 da2는 지역변수이다.
		return data1+data2;
	}
	public int sub() {
		return data1-data2;
	}
	public int mul() {
		return data1*data2;
	}
	public int div() {
		return data1/data2;
	}

}
