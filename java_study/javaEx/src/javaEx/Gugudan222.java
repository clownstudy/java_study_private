package javaEx;

public class Gugudan222 {
	public static void main(String[] args) {
		int dan = Integer.parseInt(args[0]);
		if(dan >=1 && dan <= 9) {
//			for(int i=1; i<=9; i++) {
//			
//			System.out.println(dan+"*"+i+"="+(dan*i));
//			}
			for(int j=1; j<10; j++) {
				System.out.println("***"+(dan+j-1)+"단 출력");
				for(int i=1; i<=9; i++) {
					for(int k=1; k<=3; k++) {
						System.out.println(j+" "+i+" "+k);
					} System.out.println(j*(i));
					System.out.println("-----------");
				} System.out.println("********");
			}
		}
	}
}
