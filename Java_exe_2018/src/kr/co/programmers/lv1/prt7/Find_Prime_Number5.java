package kr.co.programmers.lv1.prt7;

public class Find_Prime_Number5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Find_Prime_Number5 fpn = new Find_Prime_Number5();
		int n1 = 10;
		int rtn1 = 0;
		rtn1 = fpn.solution( n1 );
		System.out.println("[1] > " + rtn1);
		
		int n2 = 5;
		int rtn2 = 0;
		rtn2 = fpn.solution( n2 );
		System.out.println("[2] > " + rtn2);
		
	}
	
	public int solution(int n) {
		int answer = 0;
        
		int not_prime = 0;
        int numOfPrime;

		int n2 = (int)(Math.sqrt((double)n));

        for(int i=2; i<=n; i++){
            for(int j=2; j<=n2; j++){
                if(i%j == 0 && i!=j) {
                    not_prime++;
                    break;
                }
            }
        }
        
        numOfPrime = n - not_prime - 1;
        System.out.println("소수의 개수 : " + numOfPrime);
        
		answer = numOfPrime;
		return answer;
	}
	// => 값은 맞음. 시간 초과
}
