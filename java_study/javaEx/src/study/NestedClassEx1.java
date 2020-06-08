package study;

public class NestedClassEx1 {
	    private int x = 100;
	    
	    public void display() {
	        System.out.println("x : " + x);
//	        System.out.println("y : " + y); // compile error.
	        
	        Inner in = new Inner(); // 원형 : Exam03.Inner in = this.new Inner();
	        System.out.println("y : " + in.y);
	    }
	    
	    class Inner {
	        private int y = 200;
	    }
	    
}

