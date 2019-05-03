package kr.co.programmers.lv2.prt36;

public class Make_Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Make_Prime_Number mpn = new Make_Prime_Number();
		
		int[] n1 = { 1,2,3,4 };
		int rtn1 = mpn.solution(  n1  );
		System.out.println("[1] > " + rtn1);


		int[] n2 = { 1,2,7,6,4 };
		int rtn2 = mpn.solution(  n2  );
		System.out.println("[2] > " + rtn2);
		
	}

	public int solution(int[] nums) {
		int answer = -1;
		int cnt = 0;
		//주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수
		for (int i=0; i<nums.length-2 ; i++) {
			for (int j=i+1 ; j<nums.length-1 ; j++) {
				
				for (int k=j+1 ; k<nums.length ; k++) {
					
					//System.out.println(">" + i + "/" + j + "/" + k);
					//System.out.println(">" + nums[i] + "/" + nums[j] + "/" + nums[k]);
					
					int tmp_sum = nums[i] + nums[j] + nums[k];
					//System.out.println("->" + tmp_sum);
					int tmp_cnt = 0;
					
					for (int l=2 ; l<tmp_sum; l++) {
						//System.out.println("->>" + tmp_sum%l);
						if (tmp_sum%l ==0 ) {
							tmp_cnt++;
						}
					}
					//System.out.println("-->" + tmp_cnt);
					if (tmp_cnt==0) {
						cnt++;
					}
					
					
				}
			}
		}
		
		answer = cnt;
		return answer;

    } 
	// 
}
