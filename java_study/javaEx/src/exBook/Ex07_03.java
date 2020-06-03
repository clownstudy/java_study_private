package exBook;

import java.util.Scanner;

public class Ex07_03 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int a,b;
	
	while (true) {
		System.out.printf("더할 첫번째 수 입력 : ");
		a = s.nextInt();
		System.out.printf("더할 두번째 수 입력 : ");
		b = s.nextInt();
		// if(a+b >= 999) break; // 중간에 조건으로 끊어주기.
		System.out.printf("%d + %d = %d \n", a,b,a+b);
	}
}
}
