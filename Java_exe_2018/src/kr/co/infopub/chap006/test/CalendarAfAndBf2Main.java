package kr.co.infopub.chap006.test;

import java.util.Calendar;
import java.util.Date;

import kr.co.infopub.chap006.CalendarAfAndBf2;

public class CalendarAfAndBf2Main {

	public static void main(String[] args) {
		CalendarAfAndBf2 cal2=new CalendarAfAndBf2();
		//¿À´Ã
		System.out.println(new Date());
		//5ÀÏÀü
		Calendar cal=cal2.dateAfOrBf(new Date(), -5);
		//Date -> long
		System.out.println(new Date(cal.getTime().getTime()));
		
		
	}
}
