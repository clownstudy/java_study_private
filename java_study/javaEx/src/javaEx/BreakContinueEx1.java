package javaEx;

public class BreakContinueEx1 {
	public static void main(String[] args) {
		// 반복문에서 가장 가까운 반복문을 벗어나거나(break)
		// 해당 반복문의 조건으로 이동(continue)
		for (int i=0; i<11; i++) {
			if(i==6)break;
			System.out.println("i="+i);
		}
		
		for(int i=1; i<11; i++) {
			if(i%2==0) continue;
			System.out.println("i="+i);
		}
		System.out.println("**************************************************");
		
		/*
		1 2 3 4 5
		6 7 8 9 10
		1112131415
		----------
		--------25
		// System.out.printf("%3d"+c);
		*/
		int c=0;
		// label1:
		for(int i=1;i<6;i++) {
			for(int j=1;j<6;j++) {
				c++;
				if(c%3==0) break;// continue label1;
				System.out.printf("%3d",c);
			}
			System.out.println();
	}
		System.out.println("------------카운터를 이용한 예제 --------------");
		String stringValue = "가나다라마";
		for (int i = 0; i < stringValue.length(); i++) {
			System.out.println("[1] "+stringValue.charAt(i));
		}
		
		// 확장형 for문
		System.out.println("------ 배열을 이용한 예제 ------");
		char[] chars = stringValue.toCharArray();
		for (char charValue : chars) {
			System.out.println("[2] "+charValue);
		}
		
		int ii[]= {1,2,3,4,5,6,7,8,9};
		for (int i=0; i<ii.length; i++) {
			System.out.println("[3] "+ii[i]);
		}
		for(int i : ii) {
			System.out.println("[4] "+i);
		}

		//String s[]= {"강아지", "고양이", "원숭이","말"};
		String s[][]= {{"강아지", "고양이", "원숭이","말"},{"소","개"}};
		for (String[] ss : s) {
			System.out.println("[5] "+ss);
		}
		
	}
}

