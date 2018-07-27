package kr.co.infopub.chap166.test;

import kr.co.infopub.chap166.Card;
import kr.co.infopub.chap166.CardArrayBox;

public class CardArrayBoxMain
{
	public static void main(String[] args) 
	{
		CardArrayBox box =new CardArrayBox();
		Card[] cards=box.getAllCards();
		for(int i=0;i<cards.length;i++){
			System.out.print(cards[i]);
			if((i+1)%10==0){
				System.out.println();
			}
		}
	}
}
