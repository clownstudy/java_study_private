package javaEx;

public class ArithmeticEx2 {

	public static void main(String[] args) {
		// 클래스 생성 (메모리에 생성)
		ArithmeticEx1 ath1 = new ArithmeticEx1();
		// 이름, data에 숫자 2개 넣기 
			ath1.str = "김태웅";
			ath1.data1 = 1024;
			ath1.data2 = 16;
			int temp;
			
		// 출력할 때 메소드 실행한 결과 출력.
			temp = ath1.add();
			System.out.println(ath1.str);
			System.out.println(temp);
			temp = ath1.sub();
			System.out.println(temp);
			temp = ath1.mul();
			System.out.println(temp);
			temp = ath1.div();
			System.out.println(temp);
			
	}

}
