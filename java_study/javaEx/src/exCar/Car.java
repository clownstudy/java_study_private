package exCar;

public class Car {
	Car(){System.out.print("슈퍼클래스 생성자 호출(파라미터 없음)\n");}
	Car(String str){
//		System.out.println("슈퍼 클래스 생성자 호출 ==>" + str);
		
	}
	String color;
	int speed;
	void upSpeed(int value) {
		speed = speed + value;
	}		
	void downSpeed(int value) {
		speed = speed - value;
	}
}