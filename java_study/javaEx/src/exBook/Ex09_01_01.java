/// 다른 언어와 통신 시, 아래 len2~4 방법에 따라 값이 달라짐.

package exBook;

import java.io.UnsupportedEncodingException;

public class Ex09_01_01 {
public static void main(String[] args) {
	String str = "IT CookBook. Java";
	int len = str.length();
	int len2 = 0;
	int len3 = 0;
	int len4 = 0;
	try {
		len2=str.getBytes("EUC-KR").length;
		len3=str.getBytes("UTF-8").length;
		len4=str.getBytes().length;
	} catch (UnsupportedEncodingException e) {
		e.printStackTrace();
	}
	System.out.printf("문자열 : %s \n", str);
	System.out.printf("문자열 길이 : %d ",len);
	System.out.printf("문자열 길이2 : %d ",len2);
	System.out.printf("문자열 길이3 : %d ",len3);
	System.out.printf("문자열 길이4 : %d ",len3);
	}
}