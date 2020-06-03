package exBook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Ex10_10 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		int ch;
		byte[] bt = new byte[1024];
		
		try {
			fis = new FileInputStream("c:/temp/data.txt");
			
			int i = 0;
			while ((ch = fis.read()) != -1) {
				bt[i] = (byte) ch;
				i++;
				}
		
			System.out.print(new String(bt));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch(IOException e) {
			System.out.println("입력 시 오류 발생 : "+e.getMessage());
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println("입력 시 오류 발생 : "+e.getMessage());
			}
		}
		}
}
