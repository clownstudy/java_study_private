package exBook;

public class Ex10_01 {
	public static void main(String[] args) {
		int[] aa = new int[3];
		try {
			aa[3] = 100;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 첨자가 배열크비보다 큼");
		}
}
}
