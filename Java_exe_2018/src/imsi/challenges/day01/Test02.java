package imsi.challenges.day01;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test02 t = new Test02();
		
		//String st = "1924";
		//int in	= 2;	// n 개 제거

		String st = "1231234";
		int in	= 3;	
		
		String an = t.solution(st, in);
		
		System.out.println(an);
	}
	
	public String solution(String number, int k) {
		
		int idx = 0;
	    char max;
		StringBuilder answer = new StringBuilder();
	
		if(number.charAt(0) == '0') return "0";  // 맨 앞자리 '0' 이면 리턴
		
		for(int i = 0; i < number.length() - k; i++) {
			max = '0';
			// 0 에서 시작하면 (전체 길이 - 제외 길이) 까지
			for(int j = idx; j <= k + i; j++) {
				// idx 부터  k + i 까지
				// i 가 증가할 수록  k+i 이므로 뒤로 물러남
				// max 값이 나오면  idx 를 증가시킴(다음 자리로 셋팅)
				// -> 순서는 유지한 상태로 가장 큰 수 찾는 것이므로
	        	if(max < number.charAt(j)) {
	        		max = number.charAt(j); 
	        		idx = j + 1; 
	        	}
			}			
			answer.append(max);
		}
	    return answer.toString();
    }
	
}
