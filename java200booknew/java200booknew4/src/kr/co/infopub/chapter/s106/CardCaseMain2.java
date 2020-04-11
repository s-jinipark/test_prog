package kr.co.infopub.chapter.s106;
public class CardCaseMain2 {
	public static void main(String[] args) {
		CardCase2 cc=new CardCase2();
		cc.make();     // 서로 다른 카드 20장 만들기
		cc.print();
		System.out.println("--------------------------");
		cc.shuffle();   // 카드 섞기
		cc.print();
		System.out.println("--------------------------");
		cc.shuffle();   // 카드 섞기
		cc.print();
	}
}
