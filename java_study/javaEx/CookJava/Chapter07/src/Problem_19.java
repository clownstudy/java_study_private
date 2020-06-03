import java.util.Scanner;

public class Problem_19 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		char ch;
		int i, k;
		int star;

		System.out.printf("숫자를 여러 개 입력 : ");
		str = s.nextLine();

		i = 0;
		ch = str.charAt(i);
		while (true) {
			star = (int) ch - 48;

			for (k = 0; k < star; k++)
				System.out.printf("*");
			System.out.printf("\n");

			if (++i > str.length() - 1)
				break;
			ch = str.charAt(i);
		}
	}
}
