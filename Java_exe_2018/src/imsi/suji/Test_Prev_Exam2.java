package imsi.suji;

public class Test_Prev_Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String test = "AABBBCCCCD";
		String test = "AAAABBCDDEF";
		
		// 같은 문자가 짝수번 반복되면 1/2 를 잘라내어 뒤에 붙임
		// 뒤에 붙일 때는  " org - 2 - 1 " 과 같이 중간에 삽입한다.
			
		char prev = test.charAt(0);	// 첫번째 문자로 초기화
		
		String accum = ""; // 문자열 누적
		String rtn_val = "";
		String remain = "";
		
		for (int i =0 ; i< test.length() ; i++) {
			char curr = test.charAt(i);
			System.out.println(prev +" / "+ curr);
			if (prev != curr) {
				// 이전과 다르면
				System.out.println(">" + accum);
				if (accum.length() %2 == 0 ) { // 짝수?
					
					String mid_val = accum.substring(0, accum.length()/2);
					System.out.println(">>" + mid_val);
					rtn_val += mid_val;
					remain = mid_val + remain; //끼워 넣기
				} else {
					rtn_val += accum;
				}
				
				accum = "";
			} 
			
			accum += curr; 
			prev = curr ; // 계속 갱신
			
			if (i==test.length()-1) { // 마지막처리 필요
				System.out.println("L>" + accum);
				rtn_val += accum; // 마지막은 어차피 똑같음
			}
		
		}
		System.out.println("=" + rtn_val + remain);
	}

}
