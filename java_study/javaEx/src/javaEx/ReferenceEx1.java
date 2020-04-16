package javaEx;

public class ReferenceEx1 {
	public static void main(String[] args) {
	// 값을 비교하는 것이 아니라 레퍼런스를 비교하는 것.
		boolean r = new Integer("1") == new Integer("1");
		// false
		System.out.println("[1] "+r);
		r = new Integer("1").equals(new Integer("1"));
		// true
		System.out.println("[2] "+r);
		// compareTo : 비교의 결과가 값으로 출력.
		// 같으면 0
		int v = new Integer("1").compareTo(new Integer("1"));
		System.out.println("[3] "+v);
		// 오른쪽이 더 크면 -1
		v = new Integer("1").compareTo(new Integer("2"));
		System.out.println("[4] "+v);
		// 좌측이 더 크면 1
		v = new Integer("3").compareTo(new Integer("1"));
		System.out.println("[5] "+v);
		
}
}
