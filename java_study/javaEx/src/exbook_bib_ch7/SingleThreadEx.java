package exbook_bib_ch7;

public class SingleThreadEx extends Thread {
	private int[] temp;
	public SingleThreadEx(String threadname) {
		super(threadname);
		temp = new int[10];
		for(int start=0;start<temp.length;start++)
			temp[start] = start;
		}

	public void run() {
		for(int start : temp) {
			try{
				Thread.sleep(1000);
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.printf("스레드 이름 : %s,",currentThread(),getName()); // 현재 실행중 스레드의 이름 가져오기
			System.out.printf("temp Value : %d %n,",start);
		}
	}
	   public static void main(String[] args) { 
		      SingleThreadEx st = new SingleThreadEx("첫번째"); 
		      st.start();  //메소드를 가거나 아니면 스레드이면 run을 찾음.
	   } 
} 
