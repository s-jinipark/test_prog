package kr.co.programmers.lv1.prt8;

public class Sum_Of_Divisors2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sum_Of_Divisors2 sod = new Sum_Of_Divisors2();
		int n1 = 12;
		int rtn1 = 0;
		rtn1 = sod.solution( n1 );
		System.out.println("[1] > " + rtn1);
		
		int n2 = 5;
		int rtn2 = 0;
		rtn2 = sod.solution( n2 );
		System.out.println("[2] > " + rtn2);
		
	}

	
	public int solution(int n) {
		int answer = 0;
		int tot = 0;

		
        for(int i=1; i<=n; i++){
            if((n%i)==0){
                System.out.println(i);
                tot +=i;
            }    
        }

		answer = tot;
		return answer;
	}
	  
}
