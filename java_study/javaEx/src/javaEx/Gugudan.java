package javaEx;

public class Gugudan {
	public static void main(String[] args) {
		int dan = Integer.parseInt(args[0]);
		if(dan >=1 && dan <= 9) {
			System.out.println("***"+dan + "출력");
//			for(int i=1; i<=9; i++) {
//			
//			System.out.println(dan+"*"+i+"="+(dan*i));
//			}
			for(int j=1; j<10; j++) {
				System.out.println("***"+"단 출력");
				for(int i=1; i<=9; i+=3) {
					System.out.println(j+"*"+i+"="+(dan*i));
					System.out.println(j+"*"+(i+1)+"="+(dan*(i+1)));
					System.out.println(j+"*"+(i+2)+"="+(dan*(i+2)));
				 System.out.println("-----------");
				} System.out.println("********");
			}
		}
	}
}
