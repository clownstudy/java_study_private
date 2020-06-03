package exBook;

public class Ex10_02 {
public static void main(String[] args) {
	int[] aa = new int[3];
	try {
		aa[3] = 100;
		aa[2] = 100/0;
		
	} catch (ArrayIndexOutOfBoundsException e) {
	System.out.println("배열 첨자가 배열크비보다 큼");
	} catch (ArithmeticException e) {
		System.out.println("0으로 나누는 등의 오류"+e.getMessage());
	} finally {
		System.out.println("이부분은 무조건 실행");
	}
	
}
}
