package kr.co.infopub.chap005;

public class HelloCalendar100 {

	//005 자바 프로그래밍을 위한 기본 용어와 약속 
	// 윤년과 윤년이 아닌 해를 구별
	//윤년 chk
	public boolean isLeapYear(int year) {
		boolean yearTF=false;
		if( ((year % 4==0) && (year %100 !=0))
				|| year%400==0 ){
			yearTF = true;
		}
		return yearTF;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HelloCalendar100 h100 = new HelloCalendar100();
		for (int i=2017; i<2030; i++) {
			System.out.println(i + "\t" + h100.isLeapYear(i));
		}
	}

}
/*
명명법(Notation)
--------------------
파스칼(Pascal)		클래스, 인터페이스, 생성자
카멜(Camel)			메서드, 멤버 필드, AWT 등과 같은 화면 관련
헝가리안(Hungarian)	AWT 등과 같은 화면 관련
전체 대문자			상수
전체 소문자			패키지

식별자
    일반문자 : 모든 곳
    $, _ : 모든 곳
    특수문자 ($, _ 제외) : 불가
    숫자 : 두번째부터 가능(숫자로 시작할 수 없다)
*/