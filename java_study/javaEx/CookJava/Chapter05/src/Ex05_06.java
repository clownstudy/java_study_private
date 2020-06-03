import java.util.Scanner;

public class Ex05_06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;

		System.out.printf("정수를 입력하세요 : ");
		a = s.nextInt();

		if (a % 2 == 0) {
			System.out.printf("짝수를 입력했군요..\n");
		} else {
			System.out.printf("홀수를 입력했군요..\n");
		}

		s.close();
	}
}
