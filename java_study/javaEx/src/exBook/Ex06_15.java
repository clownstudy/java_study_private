package exBook;

public class Ex06_15 {
public static void main(String[] args) {
	int i, k;
	
	for(i=1;i<=9;i++) {
		for (k=2;k<=9;k++) {
			System.out.printf("%3dx%d=%2d", k,i,k*i);
		}
		System.out.printf("\n");
	}
}
}
