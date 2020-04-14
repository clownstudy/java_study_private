package javaEx;

public class forEx1 {

	public static void main(String[] args) {
		// 1~500까지 합을 계산 후 출력 
	
		// for(초기값; 조건; 증가치){실행할 문장;} // 조건이 거짓이 되면 빠져나옴.
		int result = 0; 
		for(int i=1; i<=500; i++) {
			result+=i;
		}
		System.out.println("1에서 500까지의 합:"+result);
		
		// 0부터 100까지 중 홀수만 합산 후 출력
		
		int result2 = 0;
		for(int i=1; i<=100; i+=2) {
			result2+=i;
		}
		System.out.println("1부터 100까지의 합:"+result2);
	}

}
