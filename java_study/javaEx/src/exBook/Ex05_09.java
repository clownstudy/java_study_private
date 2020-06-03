package exBook;

import java.util.Scanner;

public class Ex05_09 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
			
			int a;
	System.out.printf("1~4중 선택 : ");
	a = s.nextInt();
	
	switch (a) {
	case 1:
		System.out.printf("1");
		break;
	case 2:
		System.out.printf("2");
		break;
	case 3:
		System.out.printf("3");
		break;
	case 4:
		System.out.printf("4");
		break;
	default:
		System.out.printf("다른걸 선택함");		
	}
}
}
