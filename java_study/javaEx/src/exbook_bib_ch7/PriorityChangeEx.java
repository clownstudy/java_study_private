package exbook_bib_ch7;

public class PriorityChangeEx extends SuperThreadPriority {
	public PriorityChangeEx(String threadName) {
		super(threadName);
	}
	public static void main(String[] args) {
		Thread t1 = new SuperThreadPriority("첫번째 스레드");
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		Thread t2 = new SuperThreadPriority("두번째 스레드");
		t2.setPriority(MAX_PRIORITY);
		t2.start();
	}
}
