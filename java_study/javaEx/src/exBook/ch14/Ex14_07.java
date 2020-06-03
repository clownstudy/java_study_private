package exBook.ch14;

public class Ex14_07 {
	public static void main(String[] args) {
		class Car { // ���� ���μ���, ���� ������.
			String carName;
			
			Car(String carName){
				this.carName = carName;
			}
			
			public void run() {
				for (int i=0;i<3;i++) {
					try {
						Thread.sleep(10); // 0.01�� �����. static�� �پ��ִ� �޼ҵ���.
						System.out.println(carName+" �޸���!");
					} catch (Exception e) {
					}
				}
			}
		}
		
		Car car1 = new Car("$�ڵ���1");
		Car car2 = new Car("@�ڵ���2");
		Car car3 = new Car("*�ڵ���3");

		car1.run();
		car2.run();
		car3.run();
		
	}
}
