package exBook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex10_15 {
public static void main(String[] args){
	
	FileInputStream fis = null;
	FileOutputStream fos = null;
	try {
			fis = new FileInputStream("c:/windows/win.ini");
			fos = new FileOutputStream(("c:/temp/data5.txt"));
	int ch;
	
	while ((ch = fis.read()) != -1)
		fos.write((byte) ch);
	System.out.println("복사 완료");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
		catch  (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			fos.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}