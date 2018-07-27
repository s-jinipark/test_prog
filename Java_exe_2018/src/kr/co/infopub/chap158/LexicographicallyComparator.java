package kr.co.infopub.chap158;
import java.util.Comparator;
public class LexicographicallyComparator 
   implements Comparator<Student>{
	//싱글톤 디자인 패턴을 이용하자.
	private static LexicographicallyComparator lc
			=new LexicographicallyComparator();
	private  LexicographicallyComparator(){} 
	public static LexicographicallyComparator getInstance(){
		return lc;
	}
	//Comparator때문에 구현 할 메서드
	public int compare(Student o1, Student o2) {
   		String sc1 = o1.getName();
   		String sc2 = o2.getName();
   		return sc1.compareTo(sc2);
	}
	//toString은 구현 안하면 Object toString사용
}
