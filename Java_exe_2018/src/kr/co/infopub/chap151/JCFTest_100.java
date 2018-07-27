package kr.co.infopub.chap151;
import java.util.*;
public class JCFTest_100 {
//JAVA COLLECTION FRAMEWORK
	public static void main(String[] args) {
		Set set=new HashSet();
		set.add("lee");//1
		set.add("lee");//1 중복안됨
		set.add(new Integer(23));//3  primitive 안됨 java2
								 // 박싱/언박싱을 이용하여 기본타입 입력(Java 5)
		System.out.println(set);
		
		Set set2 = new HashSet();
		set2.add("first");
		set2.add("second");
		set2.add("second");		
		set2.add(12); // java8 .. 됨 !!!
		System.out.println(set2);
		
		System.out.println("--------------------");
		
		List list=new ArrayList();
		list.add("lee");//0
		list.add("lee");//1 중복됨
		list.set(0,"cho");//index 위치에 덮음
		list.add("park");//
		list.add("park");//중복됨		
		System.out.println(list);
		
		Vector v=new Vector(5);
		v.addElement("lee");
		v.add("lee");
		v.set(1,"cho");
		v.setElementAt("kim",0); 
		System.out.println(v);
		
		System.out.println("--------------------");
		
		Map map=new HashMap(); 
		//Hashtable map=new Hashtable();
		map.put("1", new Integer(3));//primitive 안됨 java2
		map.put("2","cho");
		map.put("2","cho");//key중복 안됨
		System.out.println(map);
		
		Map map2=new HashMap(); 
		map2.put("1", 33);// java8 .. 됨 !!!
		map2.put("2","cho");
		map2.put("2","cho2");//key중복 안됨 -> 덮어씀
		System.out.println(map2);
		
		// Set 계열은 인터페이스. 인터페이스를 구현한 HashSet 의 객체를 생성
		// Set 계열은 순서가 없고 중복할 수 없는 집합
		// List 계열은 꼬리를 물고 일렬로 나열한 것과 같으며, 순서가 있고 중복할 수 있다
		// Map 계열은 사전 찾기와 비슷한 방법으로 단어(key) 를 이용하여 뜻(value) 를 찾을 수 있다
	}
}
