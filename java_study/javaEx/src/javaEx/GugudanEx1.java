package javaEx;

public class GugudanEx1 {
	
	public static void main(String[] args) {
		// 점수를 args로 받아서 grade.java로 넘긴다.
		// 객체 생성
		GugudanEx g1 = new GugudanEx();
		// main method로 인수값 받은 것 사용.
		int num = Integer.parseInt(args[0]);
		String g2 = g1.GugudanMethod(num);
		System.out.println(g2);
	}
}
