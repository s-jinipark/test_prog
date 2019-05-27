package kr.co.jungsuk.ex.e11;

import java.util.ArrayList;

public class P01_2 {
	/*
		[11-1] 다음은 정수집합 1,2,3,4와 3,4,5,6의 교집합, 차집합, 합집합을 구하는 코드이
		다. 코드를 완성하여 실행결과와 같은 결과를 출력하시오.
		[Hint] ArrayList클래스의 addAll(), removeAll(), retainAll()을 사용하라.
	*/
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList kyo = new ArrayList(); // 교집합
		ArrayList cha = new ArrayList(); // 차집합
		ArrayList hap = new ArrayList(); // 합집합
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		/*
		(1) 알맞은 코드를 넣어 완성하시오.
		*/
		kyo.addAll(list1); // list1의 모든 요소를 kyo에 저장한다.
		kyo.retainAll(list2); // list2와 kyo의 공통요소만 남기고 삭제한다.
		cha.addAll(list1);
		cha.removeAll(list2); // cha에서 list2와 공통된 요소들을 모두 삭제한다.
		hap.addAll(list1); // list1의 모든 요소를 hap에 저장한다.
		hap.removeAll(kyo); // hap에서 kyo와 공통된 모든 요소를 삭제한다.
		hap.addAll(list2); // list2의 모든 요소를 hap에 저장한다.
		
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		System.out.println("kyo="+kyo);
		System.out.println("cha="+cha);
		System.out.println("hap="+hap);
	}

}