package javaEx;

import java.math.BigDecimal;

public class InstanceEx {

	public static void main(String[] args) {
		String value = "가나다라마바사";
		boolean r = value instanceof String;
		Object v = value;
		System.out.println(r);
		System.out.println(v);
		Object object = "가나다라마";
		r = object instanceof BigDecimal;
		System.out.println(r);
	}

}
