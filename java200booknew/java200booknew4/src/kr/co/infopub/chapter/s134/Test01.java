package kr.co.infopub.chapter.s134;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {21, 4, 19, 31, 16};
		//버블 정렬
		for (int i=0 ; i<arr.length-1 ; i++) {
			for (int j=i; j< arr.length ; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		for (int i=0; i<arr.length ; i++) {
			System.out.println(">" + arr[i]);
		}
	}

}
