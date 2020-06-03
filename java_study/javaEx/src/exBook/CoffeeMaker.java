package exBook;

public class CoffeeMaker {
	public CoffeeMaker() {}
			public CoffeeMaker(int coffee, int sugar, int cream) {
				this.coffee = coffee;
				this.sugar = sugar;
				this.cream = cream;
			}
		private int coffee=1;
		private int sugar=1;
		private int cream=1;
		// 메소드 오버 로딩 : 메소드의 인자(파라메터)가 다르다.
		public void make(int coffee) {
			this.coffee = coffee;
			System.out.print("커피: "+this.coffee);
			System.out.println("으로 완성되었습니다.");
			System.out.println(" 맛있게 드세요");}
		public void make(int coffee,int sugar) {
			this.coffee = coffee;
			this.sugar = sugar;
			System.out.print("커피: "+this.coffee);
			System.out.print("\t설탕: "+this.sugar);
			System.out.println("으로 완성되었습니다.");
			System.out.println(" 맛있게 드세요");}
		public void make(int coffee, int sugar, int cream) {
			this.coffee = coffee;
			this.sugar = sugar;
			this.cream = cream;
			System.out.print("커피: "+this.coffee);
			System.out.print("\t섩탕: "+this.sugar);
			System.out.print("\t크림: "+this.cream);
			System.out.println("으로 완성되었습니다.");
			System.out.println(" 맛있게 드세요");
			
		}

	}
