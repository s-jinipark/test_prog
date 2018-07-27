package kr.co.infopub.chap006;

import java.util.Calendar;
import java.util.Date;
/**
 * Created on 2013. 8. 15.<br>
 * 칼렌다 클래스를 이용한 날짜 구하기<br>
 * java.util.Date,java.util.Calendar, int를 입력받아 <br>
 * 날짜 전후를 구함<br>
 * @author honnynoop
 */
public class CalendarAfAndBf2 {

	/**
	 * 년월일을 정수로 입력받고 전후 일자를 입력받아 원하는 날짜를 구한다.
	 * @param year 년도
	 * @param month 월
	 * @param day 일
	 * @param diff 양수면 후 , 음수면 전 날짜를 구한다.
	 * @return 전후 일자를 입력받아 원하는 날짜를 구한다. 
	 */
	public Date dateAfOrBf(int year,int month,int day, int diff){
		Calendar cal=Calendar.getInstance();
		cal.set(year,month-1,day);  //0~11까지 존재하기 때문에 -1
		cal.add(Calendar.DAY_OF_MONTH, diff);
		return new Date(cal.getTimeInMillis());
	}
	/**
	 * Date 입력받고 전후 일자를 입력받아 원하는 날짜를 구한다.
	 * @param Date d 년월일 
	 * @param diff 양수면 후 , 음수면 전 날짜를 구한다.
	 * @return 전후 일자를 입력받아 원하는 날짜를 구한다.
	 */
	public Calendar dateAfOrBf(Date d, int diff){
		Calendar cal=Calendar.getInstance();
		cal.setTimeInMillis(d.getTime()); 
		cal.add(Calendar.DAY_OF_MONTH, diff);
		return cal;
	}
	/**
	 * Calendar 입력받고 전후 일자를 입력받아 원하는 날짜를 구한다.
	 * @param d Calendar 년월일 
	 * @param diff 양수면 후 , 음수면 전 날짜를 구한다.
	 * @return 전후 일자를 입력받아 원하는 날짜를 구한다.
	 */
	public Calendar dateAfOrBf(Calendar d, int diff){
		Calendar cal=Calendar.getInstance();
		cal.setTimeInMillis(d.getTime().getTime());  
		cal.add(Calendar.DAY_OF_MONTH, diff);
		return cal;
	}
	
}
