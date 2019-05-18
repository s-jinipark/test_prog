package kr.co.jungsuk.ch09;
final class Card10 {
	String kind;
	int num;

	Card10() {
		this("SPADE", 1);
	}

	Card10(String kind, int num) {
		this.kind = kind;
		this.num  = num;
	}

	public String toString() {
		return kind + ":" + num;
	}
}

class P10_ClassEx1 {
	public static void main(String[] args) throws Exception {
		Card10 c  = new Card10("HEART", 3);       // new연산자로 객체 생성
		Card10 c2 = Card10.class.newInstance();   // Class객체를 통해서 객체 생성

		//Class cObj = c.getClass(); //[2] 생성된 객체로 부터 얻는 방법
		
		//Class cObj = Card10.class;  //[2] 클래스 리터럴(*.class)로 부터 얻는 방법
		
		//Class cObj = Class.forName("Card10");  //[2] 
		// -> 오류 남 : java.lang.ClassNotFoundException: Card10
		Class cObj = Class.forName("kr.co.jungsuk.ch09.Card10");  //[2] 
		// -> 클래스 이름으로 부터 얻는 방법
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());		
	}
}
