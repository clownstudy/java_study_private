package exBook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex10_09 {
	public static void main(String[] args) { /* throws Exception */
		// 파일 오픈하는 역할
		FileInputStream fis = null;
		int ch;
		try {
			fis = new FileInputStream("c:\\temp\\data.txt");
			while((ch = fis.read()) != -1)
				System.out.print((char) ch);

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("입력 시 오류 발생");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		}
}
