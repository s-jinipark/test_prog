package imsi.suji.test2018.A2.q3;

import java.util.ArrayList;
import java.util.List;

public class Sequence {
	/**
	 * 연속수 목록 검색 기능
	 *
	 * @param inputData List 입력데이터(숫자열 목록)
	 * @return List 연속수 목록
	 */
	public List<String> getSequenceList(List<String> inputData) {
		List<String> sequenceList = new ArrayList<>();
		//////////////////////// 여기부터 구현 (1) ---------------->

		for (String s : inputData) {
			//System.out.println(">" + s);
			// 1 ~ 9 순서 ?
			int prev = 0;
			boolean isSeq = true;
			for (int i = 0 ; i < s.length() ; i++ ) {
				char tmp = s.charAt(i);
				if ( i > 0 ) {
					if (Integer.parseInt(tmp+"") != prev+1) {
						isSeq = false;
						break;
					} 
				}
				prev = Integer.parseInt(tmp+"");
			}
			if (isSeq) {
				sequenceList.add(s);
			}
		}
		///////////////////////////// <-------------- 여기까지 구현 (1)
		return sequenceList;
	}

	/**
	 * 가장 큰 수 생성 기능
	 *
	 * @param sequenceList List 연속수 목록
	 * @return int 가장 큰 수
	 */
	public int getMaxNum(List<String> sequenceList) {
		int maxNum = 0;
		List<Integer> num = new ArrayList<Integer>();
		StringBuilder str = new StringBuilder();
		int max = 0;
		int min = 0;
		//////////////////////// 여기부터 구현 (2) ---------------->
		// min 에는 가장 큰값을 넣어둠
		min = Integer.MAX_VALUE;
		
		// [1] 가장 큰 수 검색
		for (String s : sequenceList) {

			//System.out.println(">" + s);
			int tmp = Integer.parseInt(s);
			if (max < tmp) {
				max = tmp;
			}
			// [2] 가장 작은 수 검색
			if (min > tmp) {
				min = tmp;
			}
			
		}
		
		//System.out.println("=>" + min + " / " + max);
		
		int comp1 = Integer.parseInt( min + "" + max );
		int comp2 = Integer.parseInt( max + "" + min );
		
		if ( comp1 > comp2 ) {
			maxNum = comp1;
		} else {
			maxNum = comp2;
		}
		
		///////////////////////////// <-------------- 여기까지 구현 (2)
		return maxNum;
	}
}
