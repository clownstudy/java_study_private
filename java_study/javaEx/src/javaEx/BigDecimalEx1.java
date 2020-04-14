package javaEx;

import java.math.BigDecimal;

public class BigDecimalEx1 {

	public static void main(String[] args) {
		BigDecimal v1 = new BigDecimal("0.7");
		BigDecimal v2 = new BigDecimal("0.1");
		BigDecimal result = v1.add(v2);
		// BigDecimal : 0.8
		System.out.println("BigDecimal : "+result);
	}

}
