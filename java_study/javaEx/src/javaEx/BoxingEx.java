package javaEx;

public class BoxingEx {

	public static void main(String[] args) {
		// boolean, byte, short, int, char
		// long
		// float, double
		// 같은 스펠링에 대문자로 시작하는 클래스
		// Boolean, Byte, Sort, Integer, Character
		// Long, Float, Double
		int a = 20;
		Integer aa = a; // boxing
		int c = aa; // unboxing
		Integer cc = new Integer(20);
		System.out.println(a);
		System.out.println(aa);
		System.out.println(c);
		System.out.println(cc);
		// casting - 앞에 있는 타입에 맞춰서 잘라버린다는 얘기.
		byte b = (byte) 1000;
		// -24
		System.out.println(b);
		
		// 논리연산자
		boolean r1 = true && true;
		// true
		System.out.println(r1);
		// 자바는 맨 앞에서부터 연산을 해보고, 뒤에꺼 안해봐도 되면 그냥 넘김. 따라서 아래는 or이고 true기 때문에 뒤에를 안봐도 되서...
		boolean r2 = true || false;
		boolean r3 = false || true;
		System.out.println(r2);
		
		System.out.println(!r3);
	}



}
