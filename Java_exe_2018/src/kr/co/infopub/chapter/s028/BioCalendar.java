package kr.co.infopub.chapter.s028;
// Math.sin(), s014.Math.toDegrees()
public class BioCalendar {
	// 상수, 상수값은 변경할 수 없다.
	public static final int PHYSICAL = 23;     // 상수(개발자 정의)
	public static void main(String[] args) {
		int index=PHYSICAL;                  // 상수값을 변수에 대입
		int days=1200;     
		double phyval=100*Math.sin( (days % index) * 2 * Math.PI / index );
		System.out.printf("나의 신체지수 %1$.2f입니다.\n",phyval);
	}
}
/*

028 Math 클래스를 사용하여 신체 지수 구하기

+ Math 클래스가 제공하는 메서드의 사용법 익혀 보자
+ 대부분 static 으로 객체를 생성하지 않고 Math.메서드() 형식으로 사용

*/