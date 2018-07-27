package kr.co.infopub.chap159;
import java.util.*;
public class BoxingUnBoxingMain {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>(5,5);
		v.add(1);//boxing //Java5
		v.add(5);    
		v.add(4);
		v.add(8);    
		v.add(3);
		prints(v);
	}
	public static void prints(Vector<Integer> vi){
		int num=vi.size();
		int sum=0;
		for(int j=0;j<num;j++){
		  sum+=vi.get(j);
	   }//for
	   System.out.println("합   : "+sum);
	}//prints
	
	// Java 5 에서 사용하는 방식
	// 자바 컬렉션 프레임워크(JCF) 선언 시 <> (angle brackets, 꺽쇠 괄호) 를 이용
	// "Vector<Integer>" -> 파라미터화된 Vector 라 함
	// "<Integer>" -> 파라미터화된 타입 , 꺽쇠 괄호 안에서 선언한 타입으로만 입출력하도록 제한
	
	// 꺽쇠 괄호 안에 들어갈수 있는 타입에 대한 제한 사항을 통틀어 
	// 지네릭스(Generics, 파라미터화된 타입의 총칭) 라고 한다
}
