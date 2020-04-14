package javaEx;

public class GradeEx {

	public static void main(String[] args) {
		// 점수를 args로 받아서 grade.java로 넘긴다.
		// 객체 생성
		Grade g1 = new Grade();
		// main method로 인수값 받은 것 사용.
		int score = Integer.parseInt(args[0]);
		String grade = g1.gradeMethod1(score);
		System.out.println("당신의 학점은: "+grade);
		
	}
}
