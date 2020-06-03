package exBook;

public class CoffeeOrder {
	public static void main(String[] args) {
		//1. 연한커피만 주문
		//2. 보통 커피만 주문
		//3. 진한 커피만 주문
		//1-1. 연한커피, 설탕만 주문
		//2-2. 보통 커피, 설탕만 주문
		//3-3. 진한 커피, 설탕만 주문
		//1-1-1. 연한커피, 설탕, 크림만 주문
		//2-2-2. 보통 커피, 설탕, 크림만 주문
		//3-3-3. 진한 커피, 설탕, 크림만 주문
		
		CoffeeMaker cm = new CoffeeMaker(2,2,2);
		cm.make(1);
		cm.make(2);
		cm.make(3);
		cm.make(1,1);
		cm.make(2,2);
		cm.make(3,3);
		cm.make(1,1,1);
		cm.make(2,2,2);
		cm.make(3,3,3);
	}
}
