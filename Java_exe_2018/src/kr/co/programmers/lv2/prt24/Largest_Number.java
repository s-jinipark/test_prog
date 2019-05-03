package kr.co.programmers.lv2.prt24;

public class Largest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Largest_Number ln = new Largest_Number();
		
		int[]  n1 = { 6, 10, 2 };
		
		String rtn1 = ln.solution( n1 );
		System.out.println("[1] > " + rtn1);
		
		int[]  n2 = { 3, 30, 34, 5, 9 };
		
		String rtn2 = ln.solution( n2 );
		System.out.println("[2] > " + rtn2);
		
	}

	public String solution(int[] numbers) {
		String answer = "";
		
		for (int i= 0; i<numbers.length-1 ; i++) {
			for (int j= i+1 ; j < numbers.length ; j++) { 
				
				String tmp_s1 = numbers[i] + "" ;
				String tmp_s2 = numbers[j] + "" ;
				
				char tmp_c1 = tmp_s1.charAt(0); // 첫번째
				char tmp_c2 = tmp_s2.charAt(0); // 첫번째
				
				int tmp_s = 0;
				
				if (tmp_c1 > tmp_c2) {
					tmp_s = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = tmp_s ;
				}  else if (tmp_c1 == tmp_c2) {
					int tmp1 = Integer.valueOf(numbers[i] + "" + numbers[j]);
					int tmp2 = Integer.valueOf(numbers[j] + "" + numbers[i]);
					if ( tmp2 < tmp1  ) {
						tmp_s = numbers[i];
						numbers[i] = numbers[j];
						numbers[j] = tmp_s ;
					}
				}

			}
		}
		StringBuffer sb = new StringBuffer();
		for (int i =numbers.length-1 ; i>=0 ; i--) {
			//System.out.println(">" + numbers[i]);
			//answer += numbers[i];
			sb.append(numbers[i]);
			
		}
		answer = sb.toString();
        return answer;
    }
    // 시간 초과
}
