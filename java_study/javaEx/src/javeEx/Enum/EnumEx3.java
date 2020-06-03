package javeEx.Enum;

public class EnumEx3 {
	public enum Item {
		Add(5), Del(11), Search(2), Cancel(22);
		private final int var; // 값이 없으므로 1번 할당 가능.(final이라서)
		
		Item(int v) { // 내부클래스 생성자 처럼 사용.
			var = v; // 한번 할당 중. (6줄 참고)
		}
		
		public int getVar() { // 메소드 선언
			return var;
		}
	}
	
	public static void main(String[] args) {
		for (Item n: Item.values())
			System.out.println(n+" : "+n.getVar());
	}
}
