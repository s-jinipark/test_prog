package kr.co.infopub.chap154;
import java.util.*;
public class MapIterTest1_101 {

	public static void main(String[] args) {
		HashMap list=new HashMap();
		//list.put("0","lee");//0
		//list.clear();//모두 제거
		//System.out.println(list.size());//size()
		list.put("a","cho");//1
		list.put("d","min");//4		
		list.put("b","kim");//2
		list.put("c","chung");//3
		list.put("c","jung");//3과 동일 에러 //[2] -> 덮어씀
		//System.out.println(list.size());//size()
		//System.out.println(list.containsKey("3"));
		//System.out.println("--------------------");
		//list.remove("2");//2제거 key를 이용
		System.out.println(list.size());
		System.out.println("--------------------");
		//print(list);//Set 만들기
		
		Set set = list.keySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			String key = (String)itr.next();
			System.out.println(">" + key + " : " + list.get(key));
		}
		// 정렬됨
	}
	public static void print(Map sets){
		Set set=sets.keySet();//key값을 Set으로
		Iterator iter=set.iterator();
		while(iter.hasNext()){
			String key=(String)iter.next();
			System.out.println(key+"  "+sets.get(key));//value
		}
	}//
	// Map 계열은 사전 찾기와 비슷한 방법으로 단어(key) 를 이용하여 뜻(value) 를 찾을 수 있다
}
