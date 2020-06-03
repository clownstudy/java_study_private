package exbook_bib_ch7;

public class ATM implements Runnable {
	private long depositeMoney = 10000;
	public void run() {
		synchronized (this) {// 임계영역 시작
			for (int i=0; i<10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ie) {
					ie.printStackTrace();
				}
				if (getDepositeMoney() <= 0)
					break;
				withDraw(1000);
			}
		}// 임계영역 끝
	}
	public void withDraw(long howMuch) {
		if(getDepositeMoney() >0 ) {
		depositeMoney-=howMuch;
		System.out.print(Thread.currentThread().getName()+",");
		System.out.printf("잔액 : %,d 원  %n", getDepositeMoney());
		} else {
			System.out.print(Thread.currentThread().getName()+" , ");
			System.out.println("잔액이 부족합니다.");
		}

	}
	public long getDepositeMoney() {
		return depositeMoney;
	}
}
