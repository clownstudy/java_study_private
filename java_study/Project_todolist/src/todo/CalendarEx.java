package todo;

import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
	Calendar cal = Calendar.getInstance(); // 새 객체 생성. 현재 시간 받아옴
	// 하단은 now()를 기준으로 함.
	// 연월일 출력
//	System.out.println(cal.get(Calendar.DAY_OF_MONTH)); // 이번 달에서 몇일째인지
//	System.out.println(cal.get(Calendar.WEEK_OF_YEAR)); // 1년 기준 몇주째인지
//	System.out.println(cal.get(Calendar.DAY_OF_YEAR)); // 1년중 몇일째인지
//	System.out.println(cal.get(Calendar.AM_PM)); // 오전이면 0, 오후면 1 
//	System.out.println("주+일 : "+cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // 현재 월에서 몇주차인지 계산. 1~7일은 1, 8~14는 2로 출력
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
	for(int i=1; i<8;i++) {
		int ds = cal.get(Calendar.DAY_OF_WEEK);
		int i2 = i;
		if(i2-ds<1) {
			i2=0;
		} else {
			i2= i2-ds;
		}
		System.out.print(i2+" ");
		System.out.println(ds);
	}
	}

}
