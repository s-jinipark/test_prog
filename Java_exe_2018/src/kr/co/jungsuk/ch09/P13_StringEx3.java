package kr.co.jungsuk.ch09;
class P13_StringEx3 {
	public static void main(String[] args) {
		// 길이가 0인 char배열을 생성한다.
		char[] cArr = new char[0];   // char[] cArr = {};와 같다.
		String s = new String(cArr); // String s = new String("");와 같다.

		System.out.println("cArr.length="+cArr.length);
		System.out.println("@@@"+s+"@@@");
	}
}

/*
	빈 문자열(empty string)
	길이가 0인 배열 존재할 수 있을까? Yes
	String s = ""; 과 같은 문장이 있을 때
	 -> String 인스턴스는 내부에 new char[0] 과 같이
	         길이가 0 인 char 형 배열을 저장하고 있는 것이다
	         
	그러나  String s = ""; 과 같은 표현이 가능하다고 해서
	char c = ''; 와 같은 표현도 가능한 것은 아니다    
	 -> char 형 변수에는 반드시 하나의 문자를 지정해야 한다
	 
*/