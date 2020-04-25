package imsi.inflearn.top50.C1StringArray.T03;

import java.util.*;

public class TwoSum2 {

	public static void main(String[] args) {
		//int[] nums = {2,7,11,15};
        //int target =9;

		int[] nums = {3, 2, 4};
        int target =6;
        
        TwoSum2 a = new TwoSum2();
        int[]  result = a.solve(nums, target);
        for(int i : result)
        	System.out.println(i);
	}
	
	public int[] solve(int[] nums, int target) {

		int[] result = new int[2];
//START--------------------------------------------------		
		// 배열 전체 탐색
//		for (int i=0; i<nums.length -1 ; i++) {
//			for (int j=i+1 ; j<nums.length ; j++) {
//				if (nums[i]+nums[j] == target) {
//					result[0] = i;
//					result[1] = j;
//					return result; // 끝냄
//				}
//			}
//		}
		
		// [2]
		// 값을 key 로, 인덱스를 value 로 해시맵을 만들어 준다
		// 속도 측면의 개선
//		Map<Integer, Integer> map = new HashMap<>();
//		for (int i=0 ; i<nums.length ; i++) {
//			map.put(nums[i], i); // 적재
//		}
//		
//		for (int i=0; i<nums.length ; i++) {
//			int comp = target - nums[i];
//			if ( map.containsKey(comp) 
//					&& map.get(comp) != i // 이거 없으면 0 나옴
//					) {
//				result[0] = i;
//				result[1] = map.get(comp);
//				break; // 정지
//			}
//		}
		

		// [3]
		// 해쉬 맵을 초기화하는 과정과 동시에 조건에 맞는 값을 찾도록 구현
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i=0; i<nums.length ; i++) {
			int comp = target - nums[i];
			if ( map.containsKey(comp) ) {
				result[0] = i;
				result[1] = map.get(comp);
				return result;

			}
			map.put(nums[i], i);
		}
		// 참조 : https://johnmarc.tistory.com/80
//END  --------------------------------------------------
		return result;
		
	}
}
