package kr.co.soldesk.emp;

	public class PartTime extends employee {
		int timePay =8590;
		// extends 상속 
		// part(5,6...) <- 예제

		private int part;
		
		public int getPart() {
			return part;
		}
		
		public void setPart(int part) {
			this.part = part;
		}
		
		public int dayPay() {
			return part*timePay;
		}
	
}
