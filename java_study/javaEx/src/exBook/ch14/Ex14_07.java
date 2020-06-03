package exBook.ch14;

public class Ex14_07 {
	public static void main(String[] args) {
		class Car { // 단일 프로세스, 단일 스레드.
			String carName;
			
			Car(String carName){
				this.carName = carName;
			}
			
			public void run() {
				for (int i=0;i<3;i++) {
					try {
						Thread.sleep(10); // 0.01초 쉬어라. static이 붙어있는 메소드임.
						System.out.println(carName+" 달린다!");
					} catch (Exception e) {
					}
				}
			}
		}
		
		Car car1 = new Car("$자동차1");
		Car car2 = new Car("@자동차2");
		Car car3 = new Car("*자동차3");

		car1.run();
		car2.run();
		car3.run();
		
	}
}
