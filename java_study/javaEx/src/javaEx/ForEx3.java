package javaEx;

public class ForEx3 {
	public static void main(String[] args) {
		for(int j=2; j<8; j++) {
			System.out.print(j+"단 출력");
			System.out.print("\t");
			System.out.print((j+1)+"단 출력");
			System.out.print("\t");
			System.out.print((j+2)+"단 출력");
			System.out.print("\n");
			System.out.print("\n");
				for(int i=1; i<=9; i++) {
					System.out.print(j+"*"+i+"="+(j*i));
					System.out.print("\t");
					System.out.print((j+1)+"*"+i+"="+(j+1)*i);
					System.out.print("\t");
					System.out.print((j+2)+"*"+i+"="+(j+2)*i);
					System.out.println();
				} 
			System.out.println();
			}
		}
	}

