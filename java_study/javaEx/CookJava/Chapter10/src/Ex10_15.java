import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex10_15 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("c:/Windows/win.ini");
		FileOutputStream fos = new FileOutputStream("c:/temp/data5.txt");
		int ch;

		while ((ch = fis.read()) != -1)
			fos.write((byte) ch);

		System.out.println("복사 완료");
		fis.close();
		fos.close();
	}
}