package javaEx;

public class GradeEx1 {
	public static void main(String[] args) {
		int result=1;
		// result = result + 2
		System.out.println(result+=2);
		System.out.println(result);
		
		
		// ++result : +1하고 출력, result++ : 출력하고 +1
		// 즉, 앞에 붙으면 우선 순위가 top이어서 +1하고 다른 것 실행.
		// 뒤에 붙으면 다른걸 다 실행하고 +1
		System.out.println(++result);
		System.out.println(result++);
		System.out.println(result);
		System.out.println(--result);
		System.out.println(result);
		System.out.println(result--);
		System.out.println(result);
		
		String str = "A";
		// 자바는 숫자와 문자열 더하기 가능.
		// 먼저 작성된 것으로 타입이 결정됨.
		// 3A
		System.out.println((1+2+str));
		// A12
		System.out.println(str+1+2);
	}
}
