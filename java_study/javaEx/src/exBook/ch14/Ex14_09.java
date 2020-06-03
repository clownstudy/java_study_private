package exBook.ch14;

public class Ex14_09 {
	public static void main(String[] args) {
		
		Truck car1 = new Truck("$트럭1");
		Thread truck1 = new Thread(car1);
		Truck car2 = new Truck("$트럭2");
		Thread truck2 = new Thread(car2);
		Truck car3 = new Truck("$트럭3");
		Thread truck3 = new Thread(car3);
		
		truck1.start();
		truck2.start();
		truck3.start();
	}
}
