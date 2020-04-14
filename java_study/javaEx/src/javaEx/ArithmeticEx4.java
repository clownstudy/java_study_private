package javaEx;

public class ArithmeticEx4 {
	public static void main(String[] args) {
		// data type 기본형
		// 정수형 : byte, short, int, long / char
		// 실수형 : float, double
		
		byte a = 100; //1byte= +는 2^7-1, -는 2^7까지. byte는 +,- 둘 다 잡고 있기 때문에 127까지 가능.
		short b = -500; //2byte
		char c = 'a'; // 2byte 다른데서는 문자지만, 자바에서는 정수형.
		int d = 65555; // 4byte
		// 정수형은 기본적으로 int로 인식하기 때문에 넘어가는 경우 l을 써줘야한다.
		long e = 4564523645l; // 8byte
		
		// 실수형은 기본적으로 double로 인식하기 때문에 f를 써줘야한다.
		float f = 292.4f; // 4byte
		double g = -1203213.23322; //8byte 
		
	}
}
