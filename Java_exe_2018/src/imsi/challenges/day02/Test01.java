package imsi.challenges.day02;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test01 t = new Test01();
		
		//int[] arr = {2,6,8,14};
		int[] arr = {1,2,3};
		
		int an = t.solution(arr);
		
		System.out.println(an);
	}
	
	public int solution(int[] arr) {
		int answer = 0;
		// max 를 찾자
		int max = 0 ; 
		for (int i =0 ; i < arr.length ; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(">" + max);
		
		// 종료 조건
		int condition = 0;
		answer = max;
		
		while (condition <= arr.length) { // 모든 수가 조건에 맞을 때 까지 
			//condition = 0;
			int cnt =1;
			for (int i =0 ; i<arr.length ; i++) {
				int tmp = arr[i];
				int j =1;
				while ( tmp <= answer ) {
					if (tmp == answer) {
						condition++;
						break;
					}
					j++;
					tmp = arr[i] * j;
				}
				
			}
			if (condition == arr.length ) break;
			System.out.println(">>" + condition);
			// condition 이 만족하지 않을 경우
			cnt++;
			answer = max * cnt;
			condition = 0;
		}
		
 		return answer;
    }
	// 무한 루프
}
