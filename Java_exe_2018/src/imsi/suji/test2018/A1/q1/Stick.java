package imsi.suji.test2018.A1.q1;

public class Stick {
	/**
	 * N개의 삼각형을 만들기 위한 막대 개수를 구하는 기능
	 *
	 * @param inputData int 입력데이터(삼각형 개수)
	 * @return int 막대 개수
	 */
	public int getNumberOfStickForTriangle(int inputData) {
		int numberOfStickForTriangle = 0;
		//////////////////////// 여기부터 구현 (1) ---------------->
		numberOfStickForTriangle = 3 + (inputData-1) *2;
		///////////////////////////// <-------------- 여기까지 구현 (1)
		return numberOfStickForTriangle;
	}

	/**
	 * N층의 피라미드를 만들기 위한 막대 개수를 구하는 기능
	 *
	 * @param numberOfLayers int 입력데이터(피라미드 층수)
	 * @return int 막대 개수
	 */
	public int getNumberOfStickForPyramid(int numberOfLayers) {
		int numberOfStickForPyramid = 0;
		//////////////////////// 여기부터 구현 (2) ---------------->
		int sum1 = 0;
		int sum2 = 0;
		//[1] 계산
		for (int i=numberOfLayers ; i>=1 ; i--) {
			sum1 += 3+(2*i-2)*2;
			sum2 += i;
		}
		sum2 = sum2 - numberOfLayers; // N-1 부터 계산해야 하므로

		//[2] 계산
		numberOfStickForPyramid = sum1 - sum2;
		
		///////////////////////////// <-------------- 여기까지 구현 (2)
		return numberOfStickForPyramid;
	}
}
