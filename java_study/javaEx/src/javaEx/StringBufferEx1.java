package javaEx;

public class StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer sf = new StringBuffer("abcdefg");
		
		sf.append("hijk");
		System.out.println(sf);
		sf.insert(7, "111");
		System.out.println(sf);
		sf.delete(0, 7);
		System.out.println(sf);
		sf.delete(6, sf.length());
		System.out.println(sf);
		
		
		StringBuilder sb = new StringBuilder("자바공부 시작했어요");
		sb.append(" Hello World!");
		System.out.println(sb);
		sb.insert(5, "지금 ");
		System.out.println(sb);
		int a = sb.indexOf("시작");
		System.out.println(a);
		
		char c = sb.charAt(0);
		System.out.println(c);
		char d = sb.charAt(1);
		System.out.println(d);
		
	}

}
