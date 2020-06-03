import java.io.PrintWriter;

public class Problem_27 {

	public static void main(String[] args) throws Exception {
		int i, k;

		PrintWriter pw = new PrintWriter("C:/temp/gugu.txt");
		String str = "";

		for (i = 2; i <= 9; i++)
			str += " #Á¦" + i + "´Ü#";

		pw.println(str);
		pw.println();
		str = "";

		for (i = 1; i <= 9; i++) {
			for (k = 2; k <= 9; k++) {
				str += String.format("%2dX%2d=%2d", k, i, k * i);
			}
			pw.println(str);
			str = "";
		}
		pw.close();
	}
}