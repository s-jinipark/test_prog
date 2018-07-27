package kr.co.infopub.chap152;
import java.util.*;
public class SetIterTest1_101 {

	public static void main(String[] args) {
		HashSet list=new HashSet();
		
		//list.add("lee");//0
		//list.clear();//모두 제거
		
		for (int i=0; i<100; i++) {
			list.add("park" + i);
		}

		System.out.println(list.size());//size()
		//System.out.println(list.contains("chung"));
		//list.remove("kim");//2제거
		System.out.println(list.size());
		System.out.println("--------------------");
		print(list);
		//System.out.println("--------------------");
		//System.out.println(list);
		//print(list.toArray());
	}
	public static void print(Set set){
		Iterator iter=set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next() );
		}
	}//
	public static void print(Object [] obj){
		int count=obj.length;
		for(int i=0;i<count;i++){
			System.out.println(obj[i]);
		}
	}//
	// Set 계열은 순서가 없고 중복할 수 없는 집합
}
