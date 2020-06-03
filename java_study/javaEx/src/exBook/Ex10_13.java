package exBook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex10_13 {
public static void main(String[] args) throws Exception {
	
	FileOutputStream fos = null;
	try {
		fos = new FileOutputStream("C:/temp/data3.txt");
		int ch;
		while ((ch = System.in.read()) != 13)
			fos.write((byte) ch);
	} catch (FileNotFoundException e) { // 이게 왜 있는거지.. 출력인데;
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
	fos.close();
}
}
}