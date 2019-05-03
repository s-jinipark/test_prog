package kr.co.programmers.lv2.prt27;

public class Next_Big_Number2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Next_Big_Number2 nbn = new Next_Big_Number2();
		
		int n1 = 78;
		int rtn1 = nbn.solution( n1  );
		System.out.println("[1] > " + rtn1);

		int n2 = 15;
		int rtn2 = nbn.solution( n2  );
		System.out.println("[2] > " + rtn2);

	}

	public int solution(int n) {
		int answer = 0;
		
		String tmp_org_bi = rtnBinary(n);
		int tmp_org_cnt = rtnCnt1(tmp_org_bi);
		
		
		int tmp = n+1;
				
		while (true) {
		
			String tmp_new_bi = rtnBinary(tmp);
			int tmp_new_cnt = rtnCnt1(tmp_new_bi);
			
			if (tmp_org_cnt == tmp_new_cnt) {
				break;
			}
			tmp++;
		}
		answer = tmp;
	    return answer;
    } 
	// -> 시간 초과
    
	// 2진수 변경 함수
	public static String rtnBinary(int n) {
		int tmp_i = 0;
		String tmp_s = "";
		while (n/2 >0) {
			tmp_i = n%2;
			n = n/2;
			//System.out.println(">" + tmp_i + " /  " + n);
			tmp_s = tmp_i + tmp_s;
		}
		// 마지막
		tmp_s = n + tmp_s;
		//System.out.println(">>" + tmp_s ) ;
		return tmp_s;
	}

	// 1 의 갯수 리턴
	public static int rtnCnt1(String s) {
	
		//int tmp_i = 0;
		char[] tmp_c = s.toCharArray();
		int cnt = 0;
		for (int i=0; i< tmp_c.length ; i++) {
			if (tmp_c[i] == '1' ) cnt++;
		}
		
		return cnt;
	}
}
