package kr.co.infopub.chap156.test100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++ ) {
			list.add((int)(Math.random()*100+1));
			// 1부터 100까지의 정수중 10개를 랜덤으로 입력
		}
		
		System.out.println("정렬전: "); 
		for(Object o : list){ 
			Integer i = (Integer)o; 
			System.out.print(i + " "); 
		}
		
		System.out.println("\r\n");
		System.out.println("오름차순 정렬: "); 

		Collections.sort(list); //Collictions.sort 메소드를 이용해 오름차순 정렬
		
		for(Object o : list){ 
			Integer i = (Integer)o; 
			System.out.print(i + " "); 
		}
		
		Collections.sort(list,new Comp());

		System.out.println("\r\n");

		System.out.println("내림차순 정렬: ");
		for(Object o : list){ 
			Integer i = (Integer)o; 
			System.out.print(i + " "); 
		} 
	}

}
