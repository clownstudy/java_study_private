package exbook_bib_ch7;

public class SuperThreadPriority extends Thread {
	public SuperThreadPriority(String threadName) {
		super(threadName);
	}
	public void run() {
		System.out.printf("스레드 이름 : %s %n", Thread.currentThread().getName());
	}
}
