package exbook_bib_ch7;

public class SingleRunnableEx implements Runnable{
	   private int[] temp; 
	   public SingleRunnableEx(String threadname){ 
	      super(); 
	      temp = new int[10]; 
	      for(int start=0;start<temp.length;start++){ 
	         temp[start] = start; 
	      } 
	   } 
	   public void run(){ 
	      for(int start : temp){ 
	         try{ 
	            Thread.sleep(500); 
	         }catch(InterruptedException ie){ 
	            ie.printStackTrace(); 
	         } 
	         System.out.printf("스레드 이름 : %s ,",
	               Thread.currentThread().getName()); //현재 실행중인 스레드의 이름을 가져옴 
	         System.out.printf("temp value : %d %n",start); 
	      } 
	   } 
	public static void main(String[] args) { 
	      SingleThreadEx srt = new SingleThreadEx("첫번째"); 
	      Thread t = new Thread(srt,"첫번째");
	      srt.start();  //메소드를 가거나 아니면 스레드이면 run을 찾음.
	   } 
	} 

