package exBook.ch14;
class Truck extends CCar implements Runnable {
	Truck(String carName){
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