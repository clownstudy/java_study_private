package javaEx;

public class WhileEx1 {
	public static void main(String[] args) {
		//While은 조건만 있음 반복문, 초기값과 증가값 필요
		// 1~10 출력하는 루틴
		
		int i = 1;
		// 조건이 false인 경우, 아예 아무것도 안나옴.
		while(i<=0) {
			System.out.println("!do "+i);
			i++; // 이게 없으면 무한루프.
		}
		//do-while 실행을 먼저 하고, 조건을 비교
		// 따라서 조건이 거짓이라도 1회는 실행한다.
		int v = 1;
		do {
			System.out.println("do "+v);
			v++; // 없으면 무한 루프.
		} while(v<=0);
		
	}
}
