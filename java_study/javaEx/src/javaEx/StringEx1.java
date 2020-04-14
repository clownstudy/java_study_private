package javaEx;

public class StringEx1 {
	public static void main(String[] args) {
		// String끼리 비교할 땐 반드시 equals를 사용해야하는 이유.
		
		String s1 = "안녕한가?";
		String s2 = "안녕한가?";
		boolean r; // true or false
		// r=(s1==s2); // 레퍼런스 변수 값을 비교. s1과 s2가 같으면 r에 값이 들어감.
		r=s1.equals(s2);
		System.out.println("s1과 s2는 같나?"+"="+r);
		System.out.println("s1 "+s1.toString());
		System.out.println("s2 "+s2.toString());
		
		String st1 = new String("안녕한가?");
		String st2 = new String("안녕한가?");
//		r=(st1==st2);// 그냥 이렇게 하면 false나옴.
		r=(st1.equals(st2));// 내용이 같은지 비교
		System.out.println("st1과 st2는 같나?"+"="+r);
		System.out.println("st1 "+st1.toString());
		System.out.println("st2 "+st2.toString());
	}
}
