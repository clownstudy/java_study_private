package todo;

import java.util.Calendar;

public class CalEx2 {
	// Calendar 인스턴스 생성
		Calendar cal = Calendar.getInstance();
		
		// 요일 표시 헤더
		private String[] calHeader = {"일","월","화","수","목","금","토"};
		// 날짜 데이터 배열
		private String[][] calDate = new String[6][7];

		private int width=calHeader.length; // 배열 가로 넓이, 일주일임
		private int startDay;   // 월 시작 요일
		private int lastDay;    // 월 마지막 날짜
		private int inputDate=1;  // 입력 날짜

		// 생성자 : 데이터 생성
		public CalEx2(int year, int month) throws Exception{
			
			if(month<1 || month>12){
				System.out.println("월은 1부터 12까지 입니다.");
				throw new Exception();
			}
			
			if(year<1){
				System.out.println("정확한 년도를 입력해주세요.");
				throw new Exception();
			}
			
			/*
			 * Calendar 인스턴스에 입력받은 년, 월을 세팅하고 날짜는 1일을 세팅함
			 * 입력한 년,월,일을 기준으로 요일을 알아냄
			 * 해당월의 마지막 날짜를 알아냄
			 */
			cal.set(Calendar.YEAR, year);
			cal.set(Calendar.MONTH, month-1);
			cal.set(Calendar.DATE, 1);
			
			startDay = cal.get(Calendar.DAY_OF_WEEK); // 요일을 알아내는 함수 
			lastDay = cal.getActualMaximum(Calendar.DATE); // 해당월의 마지막 날짜를 알아내는 함수
			
			// 2차 배열에 날짜 입력
			/*
			 * 출력하기 위해 2차원 배열에 날짜를 입력함
			 * 숫자를 스트링으로 바꿔서 설정함
			 * 시작요일을 바탕으로 1일 이전은 빈칸으로 놔둠
			 */
			int row = 0;
			for(int i=1; inputDate<=lastDay; i++){
				
				if(i<startDay) calDate[row][i-1]=""; //시작 요일이 오기전에는 공백을 입력함
				else{
					calDate[row][(i-1)%width]=Integer.toString(inputDate); //날짜를 입력함
					inputDate++;
					
					if(i%width==0) row++; //일주일이 지나면 줄바꿈해서 다음 배열에 입력함
				}		
			}
		}

		// 달력 출력
		public void printCal(){
			
			for(int i=0; i<width; i++){
				System.out.print(calHeader[i]+"\t"); //월,화,수, 목... 을 TAB으로 띄워서 출력함
			}
			System.out.println();
			
			// 날짜 배열 출력
			int row=0;
			for(int j=1 ; j<lastDay+startDay; j++){
				System.out.print(calDate[row][(j-1)%width]+"\t"); //2차원 배열 달력 데이터를 하나씩 출력함
				
				if((j-1)%width==width-1){ //일주일이 지나면 다음 배열을 출력함
					System.out.println();
					row++;
				}
				
			}
		}
		public static void main(String[] args) throws Exception {
			int year;
			int month;
			year = 2020;
			month = 6;
			CalEx2 cal = new CalEx2(year, month);
			cal.printCal();
		}
}
