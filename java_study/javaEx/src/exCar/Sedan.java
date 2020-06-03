package exCar;

class Sedan extends Car {
	// 상속받은 필드까지 총 3개 필드
	// 상위필드 super. 현재 클래스 필드는 this
	int seatNum;
	// 서브 클래스에서 생성자가 존재하는 경우
	// 디폴트 생성자가 아니라면 상위 클래스에 생성자가 준비되어있는 것이 안정적이다.
		Sedan(){
			System.out.print("서브 클래스 - 세단\n");;
		};
		Sedan(String str){
			System.out.println("서브클래스 생성자 호출 ==> "+str);
		}
//		Sedan(int seatNum){
//			this.seatNum = seatNum;
		
	// 메소드 총 3개, 상속받은 메소드 2개 , 현재 메소드 1개
	// 상위 메소드 호출 super.
	// 현재 메소드 호출 this.
	int getSeatNum() {
		return seatNum;
		// return speed; 할 수 있음.
	}
}

