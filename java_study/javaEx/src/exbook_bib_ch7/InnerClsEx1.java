package exbook_bib_ch7;

public class InnerClsEx1 {
	public static void main(String[] args) {
		Outer o = new Outer();
		// inner class 생성
		Outer.Inner i = o.new Inner();
	
			System.out.println(o.getOa());
			System.out.println(i.getIa());
	}
}
