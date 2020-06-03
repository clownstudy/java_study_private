package exBook;

import java.util.Scanner;

public class Ex05_10 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int year;
	
	System.out.printf("출생연도");
	year = s.nextInt();
	
	switch(year%12) {
	case 0 : System.out.printf("원숭이\n"); break;
	case 1 : System.out.printf("닭\n"); break;
	case 2 : System.out.printf("개\n"); break;
	case 3 : System.out.printf("돼지\n"); break;
	case 4 : System.out.printf("쥐\n"); break;
	case 5 : System.out.printf("소\n"); break;
	case 6 : System.out.printf("호랑이\n"); break;
	case 7 : System.out.printf("토끼\n"); break;
	case 8 : System.out.printf("용\n"); break;
	case 9 : System.out.printf("뱀\n"); break;
	case 10 : System.out.printf("말\n"); break;
	case 11 : System.out.printf("양\n"); break;
}
}
}
