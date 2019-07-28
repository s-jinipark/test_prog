package thisis.java.chap15.sec02.exam01_arraylist;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java"); // 0
		list.add("JDBC"); // 1
		list.add("Servlet/JSP"); // 2
		list.add(2, "Database"); // 2 자리로 삽입
		list.add("iBATIS");
		// [2]
		list.add("iBATIS");
		
		int size = list.size(); // 저장된 총 객체 수 얻기
		System.out.println("총 객체수: " + size);		
		System.out.println();
		
		String skill = list.get(2); // 2번 인덱스 객체 얻기
		System.out.println("2: " + skill);
		System.out.println();

		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
				
		list.remove(2); // 2번 삭제 (Database)
		list.remove(2); // 당겨져서 새로 2번 된 (Servlet/JSP) 삭제 
		                // ***** (주의)
		
		list.remove("iBATIS"); // [2] 중복 값이 있을 경우 하나만 remove
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}
}

