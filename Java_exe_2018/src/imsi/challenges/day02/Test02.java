package imsi.challenges.day02;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test02 t = new Test02();
		
		int[] arr = {2,6,8,14};
		//int[] arr = {1,2,3};
		
		int an = t.solution(arr);
		
		System.out.println(an);
	}
	
	public int solution(int[] arr) {
		int answer = 0;
		// @1 - 연속된 최소공배수를 구하기 위해서 비교하기 위한 최소한 하나의 값이 필요하므로 
		// 그 값을 배열의 첫 번째 요소로 정한다.
		int lcm = arr[0]; // @1
		
		// @2 - 배열의 2번째 요소부터 @1 에서 구한 lcm과 비교하며 최소공배수를 구해나간다.
		for(int i=1; i<arr.length; i++) { // @2
			lcm = getLcm(lcm, arr[i]);
		}
		answer = lcm;
 		return answer;
    }

	// @4 - 최소공배수를 구하는 메소드
	public int getLcm(int a, int b) { // @4
		if(a<=0 || b<=0) return -1;
		return a * b / getGcd(a, b);
	}
	
	// @3 - 최대공약수를 구하는 메소드
	public int getGcd(int a, int b) { // @3
		int tmp;
		while(b != 0) {
			tmp = b;
			b = a % b;
			a = tmp;
		}
		
		return a;
	}
	// {A, B, C} 가 있다고 가정하자.
	// A와 B의 최소공배수를 D라고 가정하자
	// A, B, C의 최소공배수는 D, C 의 최소공배수라고 보면 된다.
}
