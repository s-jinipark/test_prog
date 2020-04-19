package imsi.challenges.day03;

import java.util.Arrays;
import java.util.Comparator;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test02 t = new Test02();
		
		//int[] arr = {6,10,2};
		int[] arr = {3, 30, 34, 5, 9};
		
		String an = t.solution(arr);
		
		System.out.println(an);
	}
	
	public String solution(int[] numbers) {
		String answer = "";

		String[] temp = new String[numbers.length];
		
		for (int i=0 ; i<numbers.length ; i++) {
			temp[i] = String.valueOf(numbers[i]);
		}
		
		//Arrays.sort(temp);
		Arrays.sort(temp, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2+o1).compareTo(o1+o2);
			}
		});


		StringBuffer sb = new StringBuffer();
		for (int i=0 ; i<temp.length ; i++) {
		//for (int i=temp.length-1 ; i>=0 ; i--) {
			//System.out.println(">" + temp[i] );
			sb.append(temp[i] );
		}
		answer = sb.toString();
 		return answer;
    }
	// 3, 30 -> 330 이 나와야 되는데 303 이 나옴
	// 개선 버전
}
