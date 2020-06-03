package exCar;

class Truck extends Car {
	// 상속받은 필드까지 총 3개 필드
	// 상위필드 super. 현재 클래스 필드는 this
	int capacity;
	Truck(){
		System.out.print("서브 클래스 - 트럭\n");;
	};
	// 메소드 총 3개, 상속받은 메소드 2개 , 현재 메소드 1개
	// 상위 메소드 호출 super.
	// 현재 메소드 호출 this.
	int getCapacity() {
		return capacity;
		// return speed; 할 수 있음.
		// 상위 클래스 필드를 하위 클래스에서 전달 가능.
	}
}