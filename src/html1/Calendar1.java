package html1;

import java.util.Calendar;

public class Calendar1 {
	/*
	 * 달력 출력 * firstDayOfWeek: 1일의 요일 월:1, 화:2, ... 토:6, 일:7 *
	 *
	 * lastDay: 마지막 날짜
	 */
	static void printCalendar(int firstDayOfWeek, int lastDay) {
		int day = 1;
		firstDayOfWeek = firstDayOfWeek % 7; // 일요일이 0이 되기 위함

		for (int i = 1; i <= lastDay + firstDayOfWeek - 1; i++) {
			if (i < firstDayOfWeek) {
				System.out.print("   ");
			}

			else {
				System.out.printf("%2d", day) ;
				System.out.print(" ");
				day++;
			}
			if (i % 7 == 0)
				System.out.println(" ");

		}
	}

	public static void main(String[] args) {
		// 2015년 7월
		int year = 2015, month = 7;

		// 2015년 7월 1일의 요일 구하기
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, 1, 0, 0);
		int 요일 = calendar.get(Calendar.DAY_OF_WEEK);

		// 2015년 7월의 마지막 날짜 구하기
		calendar.add(Calendar.MONTH, 1);
		calendar.add(Calendar.DATE, -1);
		int 마지막날 = calendar.get(Calendar.DATE);

		// 달력 출력
		printCalendar(요일, 마지막날);
	}
}
