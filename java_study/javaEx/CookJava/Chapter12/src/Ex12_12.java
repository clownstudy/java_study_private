public class Ex12_12 {
	interface Tank {
		void work();
	}

	public static void main(String[] args) {
		Tank l = new Tank() {
			public void work() {
				System.out.println("≈ ≈©∞° æ’¿∏∑Œ ±º∑Ø∞©¥œ¥Ÿ.");
			}
		};
		
		Tank tank1 = l;
		
		tank1.work();
	}
}
