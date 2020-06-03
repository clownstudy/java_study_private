package exBook;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Ex10_14 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	FileWriter fw = null;
	try {
			new FileWriter("C:/temp/data4.txt");
	String str;
	
	while (!(str = sc.nextLine()).equals(""))
		fw.write(str+"\r\n");;
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		fw.close();
	}
	}
}

