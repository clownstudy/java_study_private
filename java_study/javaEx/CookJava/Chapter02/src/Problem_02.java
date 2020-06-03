import java.util.Scanner;

public class Problem_02 {
	public static void main(String[] args) {

		int a, b;
		int result;
		int k;

		Scanner s = new Scanner(System.in);
		System.out.print("Ã¹¹øÂ° °è»êÇÒ °ªÀ» ÀÔ·ÂÇÏ¼¼¿ä ==>");
		a = s.nextInt();
		System.out.print("<1>µ¡¼À <2>»¬¼À <3>°ö¼À <4>³ª´°¼À ==> ");
		k = s.nextInt();
		System.out.print("µÎ¹øÂ° °è»êÇÒ °ªÀ» ÀÔ·ÂÇÏ¼¼¿ä ==>");
		b = s.nextInt();

		if (k == 1) {
			result = a + b;
			System.out.println(a + "+" + b + "=" + result);
		}
		if (k == 2) {
			result = a - b;
			System.out.println(a + "-" + b + "=" + result);
		}
		if (k == 3) {
			result = a * b;
			System.out.println(a + "*" + b + "=" + result);
		}
		if (k == 4) {
			result = a / b;
			System.out.println(a + "/" + b + "=" + result);
		}
		s.close();
	}
}
