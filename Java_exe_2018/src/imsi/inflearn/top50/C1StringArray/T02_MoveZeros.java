package imsi.inflearn.top50.C1StringArray;
/*
 * Time Complexity: O(n)
 * ����Ÿ  int[] nums = {0,3, 2, 0, 8, 5};
 * �� for������ ��� ��ȸ�ؾߵǴϱ�
 * Space Complexity : O(1). 
 * �־��� �������� int currentIndex = 0;
 * ����� �ϳ��� ��������ϱ�
 */
public class T02_MoveZeros {

	public static void main(String args[]) {
		// 1
		int[] nums = { 0, 3, 2, 0, 8, 5 };
//		// 2
//		int currentIndex = 0;
//		// 3
//		for (int i = 0; i < nums.length; i++) {
//			// 4
//			if (nums[i] != 0) {
//				nums[currentIndex] = nums[i];
//				currentIndex++;
//			}
//		}
//		// 5
//		while (currentIndex < nums.length) {
//			nums[currentIndex] = 0;
//			currentIndex++;
//		}
//		// 6
//		for (int i = 0; i < nums.length; i++) {
//			System.out.print(nums[i] + ",");
//		}
		
		int[] num_tmp = new int[nums.length];
		
		// 0 ���� ����
		for (int i=0; i< num_tmp.length ; i++) {
			num_tmp[i] = 0;
		}
		
		// 0 ��  �ƴ� ��� ������� ����
		int cnt = 0;
		for (int i=0; i< nums.length ; i++) {
			num_tmp[i] = 0;
			if (nums[i] != 0) {
				// ����
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