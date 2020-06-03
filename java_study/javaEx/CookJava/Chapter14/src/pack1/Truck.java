package pack1;

import pack2.Car;

public class Truck extends Car {
	Truck() {
		System.out.println("패키지1의 Truck 생성자입니다.");
	}

	public static void main(String[] args) {
		Truck truck1 = new Truck();
		System.out.println(Car.CAR_NAME);
		System.out.println(pack2.Car.CAR_NAME);
	}
}

/*
// 기본예제 14-13

package pack1;

public class Truck extends pack2.Car {
	Truck() {
		System.out.println("패키지1의 Truck 생성자입니다.");
	}

	public static void main(String[] args) {
		Truck truck1 = new Truck();
		System.out.println(Car.CAR_NAME);
		System.out.println(pack2.Car.CAR_NAME);
	}
}
*/