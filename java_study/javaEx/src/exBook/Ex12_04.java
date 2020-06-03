package exBook;
class Car1 {
	private String color;
	int speed;
}

class Sedan1 extends Car{
	void setSpeed(int speed) {
		this.speed = speed;
	}
}
public class Ex12_04 {
	public static void main(String[] args) {
		Sedan1 sedan1 = new Sedan1();
		
		sedan1.setSpeed(300);
		System.out.println("승용차 속도 ==> "+sedan1.speed);
	}
}
