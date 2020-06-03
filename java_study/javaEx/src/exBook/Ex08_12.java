package exBook;

import java.util.Scanner;

public class Ex08_12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] stack = new char[5];
		int top = 0;
		
		char carName = 'A';
		int select = 9;
		
		while (select != 3) {
			System.out.printf("<1> 넣기 <2> 빼기 <3> 끝 : ");
			select = s.nextInt();
			
			switch(select) {
			case 1:
				if(top >=5) {
					System.out.printf("터널이 꽉차서 차가 못들어감 \n");
					
				} else {
					stack[top] = carName++;
					System.out.printf(" %c 자동차가 터널에 들어감 \n", stack[top]);
					top++;
				}
				break;
			case 2:
				if(top <= 0) {
					System.out.printf("자동차 없음\n");
				} else {
					top--;
					System.out.printf(" %c 자동차가 터널에서 빠짐 \n", stack[top]);
					stack[top] = ' ';
				}
				break;
				
			case 3:
				System.out.printf("현재 터널에 %d대가 있음 \n", stack[top]);
				System.out.printf("프로그램 종료\n");
				break;
			default:
				System.out.println("다시 입력해봐요. 잘보고.");
			}
		}
	}

}
