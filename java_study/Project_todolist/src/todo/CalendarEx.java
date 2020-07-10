package todo;

import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
	Calendar cal = Calendar.getInstance(); // 새 객체 생성. 현재 시간 받아옴
	// 하단은 now()를 기준으로 함.
	// 연월일 출력
	System.out.println(cal.get(Calendar.DAY_OF_MONTH)); // 이번 달에서 몇일째인지
	System.out.println(cal.get(Calendar.WEEK_OF_YEAR)); // 1년 기준 몇주째인지
	System.out.println(cal.get(Calendar.DAY_OF_YEAR)); // 1년중 몇일째인지
	System.out.println(cal.get(Calendar.AM_PM)); // 오전이면 0, 오후면 1 
	System.out.println("주+일 : "+cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // 현재 월에서 몇주차인지 계산. 1~7일은 1, 8~14는 2로 출력
	int month = (cal.get(Calendar.MONTH));
	int year = cal.get(Calendar.YEAR);
	int day = cal.get(Calendar.DATE);
	cal.set(year,month,day);
	int date = cal.get(Calendar.DAY_OF_WEEK);
	int startDay = 1;
	System.out.println("현재 년도 : "+cal.get(Calendar.YEAR)); // 현재 년도 출력
	System.out.println("현재 월 : "+(cal.get(Calendar.MONTH)+1)); // 현재 월 출력
	System.out.println("현재 일 : "+cal.get(Calendar.DATE)); // 현재 일 출력 Calendar.DATE == Calendar.DAY_OF_MONTH
	System.out.println("주 : "+cal.get(Calendar.WEEK_OF_MONTH)); // 이번 달에서 몇주째인지
	System.out.println("요일 : "+cal.get(Calendar.DAY_OF_WEEK)); // 일요일 0 , 토요일이 6임.
	//24시간 기준으로 시간을 구한다. 

	System.out.println("Calendar.HOUR_OF_DAY...."+ cal.get(Calendar.HOUR_OF_DAY)); 



	//12시간 기준으로 시간을 구한다

	System.out.println("Calendar.HOUR...."+ cal.get(Calendar.HOUR)); 



	// 날짜를구함

	System.out.println("Calendar.DAY_OF_MONTH..."+cal.get(Calendar.DAY_OF_MONTH)); 

	System.out.println("Calendar.DATE..."+ cal.get(Calendar.DATE)); 





	//오늘이 이번주의 몇번째 날인지 구함. 일요일이 1, 월요일은 2..

	System.out.println("Calendar.DAY_OF_WEEK..."+ cal.get(Calendar.DAY_OF_WEEK)); 



	//이번주의 요일이 이번달의 몇번째 요일인지 구함

	System.out.println("Calendar.DAY_OF_WEEK_IN_MONTH..."+cal.get(Calendar.DAY_OF_WEEK_IN_MONTH ));



	//1년중에 오늘이 몇번째 날인지 구함

	System.out.println("Calendar.DAY_OF_YEAR..."+ cal.get(Calendar.DAY_OF_YEAR)); 



	//월의 몇번째 주인지구함

	System.out.println("Calendar.WEEK_OF_MONTH..."+ cal.get(Calendar.WEEK_OF_MONTH)); 



	 //년도를 구함

	System.out.println("Calendar.YEAR...."+ cal.get(Calendar.YEAR)); 



	//월 구함, 1월이 0임, 2월:1, 3월:2.....

	System.out.println("Calendar.MONTH...."+ cal.get(Calendar.MONTH)); 



	
	
	}
}
