package javeEx.Enum;

public class EnumEx1 {
	public enum Lesson {
		JAVA, XML, EJB
	}

	public static void main(String[] args) {
		Lesson le = Lesson.JAVA;
		
		System.out.println("Lesson : "+le);
		System.out.println("XML : "+Lesson.XML);
	}
}
