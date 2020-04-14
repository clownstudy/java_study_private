package javaEx;

public class GugudanEx {
	public String GugudanMethod(int num) {
		
		if(num <= 9 && num >= 1) {
			for(int i=1; i<=9; i++) {
				System.out.println(num+" * " + i + " = " + num*i);
			}
		} else { System.out.println("입력값오류입니다. 입력값 :"+(num)) ;}
		return null;
	} 
}
	

