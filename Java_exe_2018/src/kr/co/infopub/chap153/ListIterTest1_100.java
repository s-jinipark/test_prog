package kr.co.infopub.chap153;
import java.util.*;
public class ListIterTest1_100 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("lee");//0
		list.clear();//모두 제거
		list.add("cho");//1
		list.add("kim");//2
		list.add("chung");//3
		list.add("min");//4
		list.add("chung");//3과 동일
		System.out.println(list.size());//size() //[2] -> 중복포함됨
		System.out.println(list.contains("chung"));
		System.out.println("--------------------");
		list.remove("kim");//2제거
		list.remove(3);//cung제거
		System.out.println(list.size());
		System.out.println(list.indexOf("min"));
		System.out.println("--------------------");
		print(list);
		print(list.toArray());
		System.out.println("--------------------");
		List sublist=list.subList(0,2);//0~2-1까지
		print(sublist);
		printGet(list);
	}
	public static void print(List set){
		Iterator iter=set.iterator();
		while(iter.hasNext()){
			String str=(String)iter.next();
			System.out.println(str);
		}
	}//
	public static void print(Object [] obj){
		int count=obj.length;
		for(int i=0;i<count;i++){
			System.out.println(obj[i]);
		}
	}//
	public static void printGet(List set){
		int count=set.size();
		for(int i=0;i<count;i++){
			System.out.println(set.get(i));
			//String str=(String)set.get(i)
		}
	}//
	// List 계열은 꼬리를 물고 일렬로 나열한 것과 같으며, 순서가 있고 중복할 수 있다
	
}
