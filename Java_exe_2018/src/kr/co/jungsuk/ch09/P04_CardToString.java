package kr.co.jungsuk.ch09;
class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
}

class P04_CardToString {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();

		System.out.println(c1.toString());
		System.out.println(c2.toString());
		/*
		Card 인스턴스에 toString() 을 호출하면, Object 클래스의 toString() 이 호출
		-> 오버라이딩 하지 않았기 때문
		
		*/
	}
}
