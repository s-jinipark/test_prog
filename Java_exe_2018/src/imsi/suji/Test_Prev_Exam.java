package imsi.suji;

public class Test_Prev_Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "AABBBCCCCD";
		
		// 같은 문자가 짝수번 반복되면 1/2 를 잘라내어 뒤에 붙임
		// 뒤에 붙일 때는  " org - 2 - 1 " 과 같이 중간에 삽입한다.
		
		int tot_len = test.length();
		int cur_loc = 0;
		int same_cnt = 0;
		char prev = test.charAt(0);	// 첫번째로 초기화
		boolean go = true;
		String accum = ""; // 문자열 누적
		String rtn_val = "";
		String remain = "";
		while(go) {
			boolean b_split = false;
			char tmp = test.charAt(cur_loc);
			
			System.out.println(">" + tmp);
			cur_loc++; // 현재 위치 증가				
			if ( (int)prev != (int)tmp  ) {
				// 문자열이 바뀌었을 때 작업
				System.out.println(">>" + same_cnt);
				same_cnt = 0;
				b_split = true;

			} else if ( tot_len == cur_loc) { // 마지막일 경우 작업
				same_cnt++; // 1번더 증가
				accum += tmp; // 마지막 포함시켜줌
				System.out.println("L >>" + same_cnt);
				go = false;
				b_split = true;
			}
			
			if (b_split) {
				//System.out.println("->");
				if ((accum.length())%2 == 0) {	//짝수이면
					System.out.println("->"  + accum); //
					int split_len = accum.length() / 2;
					String mid_str = accum.substring(0, split_len);
					rtn_val += mid_str;
					remain = mid_str + remain;
				} else {
					rtn_val += accum;
				}
				accum = ""; // 초기화
			}
			
			same_cnt++;
			prev = tmp;
			accum += tmp;

		}
		System.out.println("=" + rtn_val + remain);
	}
	// String test = "AABBBCCCCD"; 일 경우
	// String index out of range: 10 오류 남
}
