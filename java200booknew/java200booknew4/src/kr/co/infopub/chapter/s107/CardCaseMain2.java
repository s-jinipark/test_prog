package kr.co.infopub.chapter.s107;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardCaseMain2 {
	
	//public static final String[] SUIT={"¢¼","¡ß","¢¾","¢À"};
	public static final String[] SUIT={"a","b","c","d"};	
	public static final String[] VALU={"1","2","3","4","5","6","7","8","9"};    
	
	public static List<String> cards=new ArrayList<String>();
	
	public static void main(String[] args) {
		
		CardCaseMain2 ccm = new CardCaseMain2();
		ccm.make();
		ccm.print();
		System.out.println("----------------------------------------");
		ccm.sort();
		ccm.print();
	}
	
	public void make() {
		while (cards.size() < 20) {
			int suit = (int)(Math.random()*SUIT.length);
			int valu = (int)(Math.random()*VALU.length);
			String temp = SUIT[suit] + VALU[valu];
			if ( cards.contains(temp) ) {
				continue;
			} else {
				cards.add(SUIT[suit] + VALU[valu]);
			}
		}
	}
	
	public void print() {
		for(int i=0; i< cards.size() ; i++) {
			System.out.print(">" + cards.get(i) + "  ");
			
			if((i+1)%10==0){
				System.out.println();
			}
			
		}
	}

	public void sort() {
		Collections.sort(cards);
	}
}
