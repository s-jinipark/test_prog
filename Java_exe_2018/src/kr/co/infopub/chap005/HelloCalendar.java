package kr.co.infopub.chap005;

public class HelloCalendar {
	//윤년인가? non static
	public boolean isLeapYear(int year){
		boolean yearTF=false;
		if( ((year % 4==0) && (year %100 !=0))
				|| year%400==0 ){
			yearTF = true;
		}
		return yearTF;
	}
	//윤년인가? static
	public static  boolean isLeapSY(int year){
		boolean yearTF=false;
		if( ((year % 4==0) && (year %100 !=0))
				|| year%400==0 ){
			yearTF = true;
		}
		return yearTF;
	}
	
	public static void main(String[] args) {
		HelloCalendar cal=new HelloCalendar();
		//non static -객체 생성후 호출
		System.out.println(cal.isLeapYear(2020));
		//static -객체 생성 없이 호출
		System.out.println(isLeapSY(2020));
	}

}
