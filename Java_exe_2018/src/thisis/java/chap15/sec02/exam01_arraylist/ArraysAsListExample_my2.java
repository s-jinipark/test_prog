package thisis.java.chap15.sec02.exam01_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample_my2 {
	public static void main(String[] args) {
		
		String[] stTest = { "테스트1" , "테스트22" , "테스트333" };
		
		List<String> list1 = Arrays.asList("홍길동", "신용권", "감자바");
		
		List<String> list11 = Arrays.asList(stTest);
		
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stTest));
		

		for(String name: list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for(int value : list2) {
			System.out.println(value);
		}
	}
}
