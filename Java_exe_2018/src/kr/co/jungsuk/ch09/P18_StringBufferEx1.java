package kr.co.jungsuk.ch09;
class P18_StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer sb  = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");

		System.out.println("sb == sb2 ? " + (sb == sb2));
		System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));
		
		// StringBuffer의 내용을 String으로 변환한다.
		String s  = sb.toString();	// String s = new String(sb);와 같다.
		String s2 = sb2.toString();

		System.out.println("s.equals(s2) ? " + s.equals(s2));
	}
}

/*
	String 클래스에서는 equals 메서드를 오버라이딩해서 문자열의 내용을 비교하도록 구현되어 있지만,
	StringBuffer 클래스는 equals 메서드를 오버라이딩하지 않아서 
	  -> equals 메소드를 사용해도 등가비교연산자(==) 로 비교한  것과 같은 결과를 얻는다
	  
*/