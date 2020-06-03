package genericsEx;

import java.util.ArrayList;

public class GenerEx1 {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		// collection = 자료구조
		// generics = 해당되는 자료구조(컬렉션)에 들어갈 타입을 설정하는 것.
		a1.add(0, "hey");
		a1.add(1," ");
		a1.add(3, "key");
		System.out.println(a1);
	}
}
