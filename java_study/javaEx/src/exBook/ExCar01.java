package exBook;

public class ExCar01 {
 public static void main(String[] args) {
	ExCar myCar1 = new ExCar();
	myCar1.color = "red";
	myCar1.speed = 0;
	
	ExCar myCar2 = new ExCar();
	myCar2.color = "blue";
	myCar2.speed = 0;
	
	ExCar myCar3 = new ExCar();
	myCar3.color = "yellow";
	myCar3.speed = 0;
	
	myCar1.upSpeed(30);
	System.out.println("자동차1의 색상은 "+myCar1.color+"이며, 현재 속도는 "+myCar1.speed+"km이다.");
	
	myCar2.upSpeed(60);
	System.out.println("자동차2의 색상은 "+myCar2.color+"이며, 현재 속도는 "+myCar2.speed+"km이다.");

	myCar3.upSpeed(0);
	System.out.println("자동차3의 색상은 "+myCar3.color+"이며, 현재 속도는 "+myCar3.speed+"km이다.");
}
}