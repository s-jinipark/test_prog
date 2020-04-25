package imsi.inflearn.top50.C1StringArray.T02;
/*
 * Time Complexity: O(n)
 * 데이타  int[] nums = {0,3, 2, 0, 8, 5};
 * 를 for문으로 모두 순회해야되니까
 * Space Complexity : O(1). 
 * 주어진 문제에서 int currentIndex = 0;
 * 상수는 하나만 사용했으니까
 */
public class MoveZeros2 {

	public static void main(String args[]) {

		int[] nums = { 0, 3, 2, 0, 8, 5 };

		int[] num_tmp = new int[nums.length];
		
		// 값이 0 이 안니 값을 먼저 배열에 담는다
		// index 를 기억한다
		// 해당 index 이후 로 0 인 값을 넣는다 (배열.length 까지)
		
		// 0 으로 셋팅되어 있음
		// 0 아닌 값 -> 순서대로 셋팅

		int cnt = 0;
		for (int i=0; i< nums.length ; i++) {

			if (nums[i] != 0) {
				// 셋팅
				num_tmp[cnt] = nums[i];
				cnt ++;
			}
		}
		
		// print
		for (int i=0; i< num_tmp.length ; i++) {
			System.out.print(num_tmp[i] + " ");
		}
		
	}
}
