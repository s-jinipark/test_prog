package kr.co.infopub.chap156.test100;

import java.util.Comparator;

public class Comp implements Comparator<Integer> {
	// Comparator 인터페이스를 구현
	public int compare(Integer o1, Integer o2){ //compara 메소드를 오버라이드 
		/*-- 역순정렬
		if(o1>o2) return -1;
		else if(o1<o2)return 1;
		else return 0;
		*/
		return o1 > o2 ? -1 : (o1 == o2 ? 0 : 1); //위의 if 문을 조건삼항 연산자로 대체
	}
	/* equals를 구현하지 않으면 Object의 equals를 사용합니다. 
	equals를 구현했을때 퍼포먼스가 향상된다는 말도 있습니다. */
}
