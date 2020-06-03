package exBook.ch14;

class Car extends Thread {
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
