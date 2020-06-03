package exBook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex10_16 {
public static void main(String[] args)  {
	FileInputStream fis = null;
	FileOutputStream fos = null;
	try {
		
		fis = new FileInputStream(args[0]);
		fos = new FileOutputStream(args[1]);
	
		int ch;
	
		while ((ch = fis.read()) != -1)
			fos.write((byte) ch);
		System.out.println("복사 완료");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}
