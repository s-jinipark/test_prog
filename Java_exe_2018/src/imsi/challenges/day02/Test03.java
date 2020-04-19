package imsi.challenges.day02;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test03 t = new Test03();
		
		//int[] arr = {2,6,8,14};
		//int[] arr = {1,2,3};
		// 2개로 테스트 해본다
		int[] arr = {4,18};
		
		int an = t.solution(arr);
		
		System.out.println(an);
	}
	
	public int solution(int[] arr) {
		int answer = 0;
		int a = arr[0];
		int b = arr[1];
		int temp;
		
		// b 가 더 큰 값이 되도록...
        if( b<a ) {
            temp = a;
            a = b;
            b = temp;
        }
        
        int Lcm = 0; // 최소공배수 (Least Common Multiple)
        int Gcd = 0; // 최대공약수 (Greatest Common Divisor)
        // 두 수 a 와 b 를 정의한다. 후에 a 와 b 중 큰 수를 고르기 위해  b 이 더 큰 값을 가지게 만든다. 
        // 빠른 계산을 위해 a 의 b 의 약수일 경우를 미리 설정하고, 
        // 후에 for문을 거치면서 동시에 나눠지는 경우를 찾고, 최대공약수와 최소공배수를 .. 넣어준다.
        if(b%a==0) { // 나누어 떨어진다면
        	Gcd = a;
        	Lcm = b;
        } else {
            for(int i=1; i<a; i++) {
                if(a%i==0 && b%i==0) {
                	Gcd = i;
                	Lcm = (a*b)/i;
                }
            }
        }
        answer = Lcm;
 		return answer;
    }


}
