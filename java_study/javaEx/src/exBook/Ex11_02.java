package exBook;
class Car02 {
	String color;
	int speed;
	
	void upSpeed(int value) {
		speed = speed + value;
	}
	void downSpeed(int value) {
		speed = speed - value;
	}
	
	String getColor() {
		return color;
	}
	
	int getSpeed() {
		return speed;
	}
}
public class Ex11_02 {
	public static void main(String[] args) {
		Car02 myCar1 = new Car02();
		myCar1.color = "red";
		myCar1.speed = 0;
		
		myCar1.upSpeed(30);
		System.out.println("자동차1의 색상은 "+myCar1.color+"이며, 현재속도는 "+myCar1.speed+"km이다.");
		System.out.println("자동차1의 색상은 "+myCar1.getColor()+"이며, 현재속도는 "+myCar1.getSpeed()+"km이다.");
		
	}
}
