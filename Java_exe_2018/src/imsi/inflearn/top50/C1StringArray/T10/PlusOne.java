package imsi.inflearn.top50.C1StringArray.T10;

public class PlusOne {

	
	public static void main(String[] args) {
		int[] digits = {1,2,3};
//		int[] digits = {9,9,9};
		int[] result = plusOne(digits);
		for(int i:result)
			System.out.println("val: "+i);
	}
	public static int[] plusOne(int[] digits) {

		// 뒤에서 부터 +1 
		// overflow 발생 시 앞자리에 +1
		// 맨 앞에도 overflow 발생 시 배열 크기 증가
		int o_f = 0;
		for (int i=digits.length -1 ; i>=0 ; i--) {
			System.out.println(">" + digits[i]);
			// 첫번째
			if (i==digits.length -1) {
				if (digits[i] + 1 >9) {
					digits[i] = 0;
					o_f = 1;	
				} else {
					digits[i]++;
				}
			} else { // 두 번째 부터
				if ((digits[i] + o_f) >9 ) {
					digits[i] = 0;
					o_f = 1;
				} else {
					digits[i]  += o_f;
					o_f = 0;
				}
			}

		}
		// 루핑을 다 돌았으나 o_f 가 1 일 경우
		// 배열을 늘려 주어야 함
		if (o_f > 0) {
			int[] answer = new int[digits.length+1];
			answer[0] = o_f;
			for (int i=1; i<answer.length ; i++) {
				answer[i] = digits[i-1];
			}
			return answer;
		} else {
			return digits;
		}
	    //return digits;
	}
}
