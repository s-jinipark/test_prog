package kr.co.infopub.chap168;
import java.util.*;
public class  CardVectorBox{	
	private final static int numOfCards;
	static {
		numOfCards=Card.deck.length*Card.stic.length;//40
	}
	private Vector<Card> vCard;
	public CardVectorBox() {	
		make();
	}
	private void make(){
		init();
		fulling();
	}
	private void init(){
		vCard=new Vector<>(5,5);
		vCard.clear();
	}
	public void fulling(){
		int count=0;
		while(true){
			Card cd=new Card();// 임의의 카드를 만든다.
			if(!vCard.contains(cd)){// 같은것이 없다면
				vCard.addElement(cd);//add
				count++;
			}
			if(count==numOfCards){//40
				break;
			}
		}
	}
	public Vector<Card> getAllCards(){
		return vCard;
	}
	public void shuffles(){
		Collections.shuffle(vCard); 
	}
}
