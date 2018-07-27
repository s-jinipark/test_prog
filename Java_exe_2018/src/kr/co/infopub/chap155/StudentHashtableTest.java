package kr.co.infopub.chap155;
import java.util.*;
public class StudentHashtableTest {

	public static void main(String[] args) {
		Hashtable<String,Student> table=new Hashtable<>();
		table.put("1",new Student("Jee",1,"Seoul"));//0
		table.clear();//모두 제거
		table.put("2",new Student("Gong",2,"Seoul"));//1
		table.put("3",new Student("Song",3,"Seoul"));//2
		table.put("4",new Student("Lee",4,"Koyang"));//3
		table.put("4",new Student("Lee",4,"Koyang"));//3과 중복x
		System.out.println(table.size());
		System.out.println(table.containsKey("4"));
		table.remove("3"); 
		Student stu=table.get("2");//key
		System.out.println(stu.getId()+"  "+stu.getName()+"  "+stu.getAddr());
		//모든 elements 출력하기
		//Set set=table.keySet();//Map을 참고
		Enumeration<String> enums=table.keys();
		while(enums.hasMoreElements()){
			String key=enums.nextElement() ;//핵심
			Student stus=table.get(key);
			System.out.println(stus.getId()+"  "+stus.getName()+"  "+stus.getAddr());
		}
	}
	/*
	Iterator, Enumeration은 둘다 모두 자바에서 제공하는 컬렉션에 대해 
	각 컬렉션의 항목들을 순차적으로 접근하는데 사용한다.

    차이점은 Enumeration의 경우 자바의 초기버젼에서 개발되었습니다. 
    자바는 jdk1.2, 즉 자바2에서 많은 변화가 생겼는데, 
    그중에 하나가 컬렉션 클래스(Vector, List, Map, Set...)들을 
    컬렉션프레임웍 이라는것으로 관리하는것이다.

    이때, 컬렉션프레임웍에서는 Iterator라고 해서, Enumeration의 기능을 확장해서, 
    Collection인터페이스를 상속받은 모든 컬렉션(List, Set, Vector.)에서 Enumeration을 사용가능하게 하였다.

    정리하면, Enumeration는 자바초기버젼에서 제공되는것으로 Hashtable, Vector 에서 사용가능하다. 
    Iterator는 jdk1.2에서 제공되는 것으로 
    Collection인터페이스를 구현상속한 모든 컬렉션 클래스에서 사용가능하다. 
	*/
}
