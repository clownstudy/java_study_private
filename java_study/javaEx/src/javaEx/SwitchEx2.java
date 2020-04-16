package javaEx;

public class SwitchEx2 {
	public static void main(String[] args) {
		//100~500, 나머지는 잘못된 입력입니다. 로 출력
		int v = Integer.parseInt(args[0]);
		switch(v) {
		case 100 :
			System.out.println("입력값은 "+v+"입니다.");
			break;
		case 200 :
			System.out.println("입력값은 "+v+"입니다.");
			break;
		case 300 :
			System.out.println("입력값은 "+v+"입니다.");
			break;
		case 400 :
			System.out.println("입력값은 "+v+"입니다.");
			break;
		case 500 :
			System.out.println("입력값은 "+v+"입니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
	}
}
