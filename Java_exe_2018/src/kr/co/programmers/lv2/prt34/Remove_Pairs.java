package kr.co.programmers.lv2.prt34;

public class Remove_Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remove_Pairs rp = new Remove_Pairs();
		
		String s1 = "baabaa";
		
		int rtn1 = rp.solution( s1  );
		System.out.println("[1] > " + rtn1);

		String s2 = "cdcd";
		
		int rtn2 = rp.solution( s2  );
		System.out.println("[2] > " + rtn2);

		
	}

	public int solution(String s) {
		int answer = 0;
		
		boolean continueGo = true;
		String tmp = "";
		boolean finFor = false;
		
		while ( continueGo ) {
			for (int i=0; i<s.length()-1 ; i++) {
				
				if (s.charAt(i) == s.charAt(i+1) ) {
					if (i>0) {	// 앞부분 처리
						tmp = s.substring(0, i);
					}
					//System.out.println("->" + tmp ) ; 
					s = tmp + s.substring(i+2); 
					//System.out.println("s->" + s ) ; 
					tmp = "";
					break;
				} 
				
				if (i == s.length()-2) // 다 돌았다.
					finFor = true;
			}
			if (s.length() == 0  ) {
				// 여기까지 오면 끝...
				answer = 1;
				continueGo = false;
			} else  { 
				if ( finFor || s.length() < 2) { 
					// For 를 다 돈 경우 -> 그냥 종료
					// 2보다 적은 경우도 -> 비교할 것도 없으니 그냥 종료
					continueGo = false;
				} 
				
			}
			
		}
		
		//System.out.println(">>" + s + " / "+ s.length());
		return answer;

    } 
	// 시간 초과
}
