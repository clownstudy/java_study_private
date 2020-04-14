package javaEx;

public class Grade {
// 성적을 출력하는 클래스
// 성적을 입력하면 입력 받아서, 해당 학점을 출력하는 클래스
//	100~90 : A
// 89~80 : B  
// 79~70 : C  
// 69~60 : D
// 69 이하 : F
	
	public String gradeMethod1(int score) {
		// 들어온 값(score)에 따라서 학점을 리턴
		String grade="";
		
		if(score >= 101) {
			return "Error";
		}
		if(score <= 100 && score >= 90)
			grade = "A"; 
		else if(score <= 89 && score >= 80)
			grade = "B"; 
		else if(score <= 79 && score >= 70)
			grade = "C"; 
		else if(score <= 69 && score >= 60)
			grade = "D"; 
		else (score <= 59)
			grade = "F"; 
		
		return grade;		
	}	
}
