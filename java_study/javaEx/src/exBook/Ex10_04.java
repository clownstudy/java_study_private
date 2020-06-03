package exBook;

public class Ex10_04 {
	public static void main(String[] args) {
		int a= 100, b = 0;
		int result;
		try {
			if (b == 0)
				throw new ArithmeticException("0으로 나누면 안됩니당~");
			result = a/b;
		} catch (ArithmeticException e) {
			System.out.println("수치 예외 사항 발생 : "+e.getMessage());
		} catch (Exception e) {
			System.out.print("발생 오류==>");
			System.out.println(e.getMessage());
		}
	}
}