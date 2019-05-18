package kr.co.jungsuk.ex.e05;

public class P04_1 {
	// [5-4] 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
				};
		
		int total = 0;
		float average = 0;
		
		//작성
		int cnt = 0;
		float average2 = 0;
		float cnt2 = 0;
		for (int i =0; i< arr.length ; i++) {
			for (int j=0 ; j<arr[i].length ; j++ ) {
				total += arr[i][j];
				cnt++;
			}
		}
		average = total/cnt;
		//[2]
		cnt2 = cnt;
		average2 = total/cnt2;
		System.out.println("total =" + total);
		System.out.println("average =" + average);
		System.out.println("average2 =" + average2);
	}

}
