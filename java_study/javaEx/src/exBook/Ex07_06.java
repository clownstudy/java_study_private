package exBook;
import java.util.Scanner;

public class Ex07_06 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int menu;
	
	do {
		System.out.printf("\n주문할거임?\n");
		System.out.printf("<1> 라떼 <2> 카푸 <3> 아메 <4> 안시킴 => ", args);
		
		menu = s.nextInt();
		switch (menu) {
		case 1:
				System.out.println("1"); break;
		case 2:
			System.out.println("2"); break;
		case 3:
			System.out.println("3"); break;
		case 4:
			System.out.println("4"); break;
		default:
			System.out.println("잘못시킴");
		}
	} while (menu !=4);
	}
}

