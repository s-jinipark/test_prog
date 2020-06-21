package kr.co.programmers.lv2.prt24;

import java.util.Arrays;
import java.util.Comparator;

public class Largest_Number3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Largest_Number3 ln = new Largest_Number3();
		
		int[]  n1 = { 6, 10, 2 };
		
		String rtn1 = ln.solution( n1 );
		System.out.println("[1] > " + rtn1);
		// 6210
		int[]  n2 = { 3, 30, 34, 5, 9 };
		
		String rtn2 = ln.solution( n2 );
		System.out.println("[2] > " + rtn2);
		// 9534330
		
	}

	public String solution(int[] numbers) {
		String answer = "";
		
		// 다시 만들어 봄
		// String 배열로 변환
		String[] arr = new String[numbers.length];
		for (int i=0 ; i< numbers.length ; i++) {
			arr[i] = String.valueOf(numbers[i]);
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				//return o1.compareTo(o2);
				//  2개를 더하여 더 큰 쪽이 우선순위가 있도록 정렬
				return (o2+o1).compareTo(o1+o2);
			}
		});
		
		// 문자열 만들기
		for (int i=0 ; i< arr.length ; i++) {
			answer += arr[i];
		}
        return answer;
    }

}
