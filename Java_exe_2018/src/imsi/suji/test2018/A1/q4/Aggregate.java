package imsi.suji.test2018.A1.q4;

public class Aggregate {
	/**
	 * 부분 배열의 개수를 구하는 기능
	 *
	 * @param arraySize int 배열 크기
	 * @return int 부분 배열의 개수
	 */
	public int getNumberOfSubArrays(int arraySize) {
		int numberOfSubArrays = 0;
		//////////////////////// 여기부터 구현 (1) ---------------->
		for (int i = 0; i < arraySize; i++) {
			numberOfSubArrays += getSubNum(i, arraySize);
		}

//		for (int i = 1; i <= arraySize; i++) {
//			numberOfSubArrays += getNumberSum(arraySize, i);
//		}

		///////////////////////////// <-------------- 여기까지 구현 (1)
		return numberOfSubArrays;
	}

	private int getSubNum(int i, int arraySize) {
		// TODO Auto-generated method stub
		int tmp = 0;
		for (int j = 0; j < arraySize - i; j++) {
			for (int k = 0; k < arraySize - i; k++) {
				tmp++;
			}
		}
		// System.out.println(">" + tmp);
		return tmp;
	}
	/*
	 * getSubNum() -> print 갯수는 OK >16 >9 >4 >1
	 */

	private int getNumberSum(int arraySize, int initialNumber) {
		int maxX = 0;
		for (int i = initialNumber; i <= arraySize; i++) {
			if (i <= arraySize) {
				maxX++;
			} else {
				break;
			}
		}
		return (maxX * maxX);
	}
	/*
	 * getNumberSum() - > 시작 위치가 뒤로 하나씩 이동 - > 중첩 loop 사용하지 않고 , 마지막에 제곱해줌
	 */

	/**
	 * 최대값을 찾는 기능
	 *
	 * @param inputData int[][] 입력데이터(NxN배열)
	 * @return int 최대값
	 */
	public int getMaximumValue(int[][] inputData) {
		int maximumValue = Integer.MIN_VALUE;
		//boolean bFirst = false; // ?
		// int arraySize = inputData.length;

		//////////////////////// 여기부터 구현 (2) ---------------->
//		for (int i = 1; i <= inputData.length; i++) {
//		//for (int i = 1; i <= 1; i++) {	
//			int tMaximumValue = getMaxValue(inputData, i);
//
//			if (bFirst) { // ?? true 로 해주는 곳이 없음(이부분은 이상)
//				bFirst = false;
//				maximumValue = tMaximumValue;
//			} else {
//				if (maximumValue < tMaximumValue) {
//					maximumValue = tMaximumValue;
//				}
//			}
//		}
		// test 용
		//int tMaximumValue = getMaxValue(inputData, 2);
		//System.out.println("==>" + tMaximumValue);
		///////////////////////////// <-------------- 여기까지 구현 (2)
		
		// 여기서 다시
		for (int i = 1; i <= inputData.length; i++) {	
			int tMaximumValue = getMaxValue_2(inputData, i);

			if (maximumValue < tMaximumValue) {
				maximumValue = tMaximumValue;

			}
		}
		
		
		
		return maximumValue;
	}

	
	private int getMaxValue_2(int[][] inputData, int endValue) {
	
		int maximumValue = 0; // rtn 값
		int inputSize = inputData.length; // 배열 size
		int cur_x_st = 0;
		int cur_x_end = endValue;
		int cur_y_st = 0;
		int cur_y_end = endValue;
		int tmp_max = 0; // ? Integer.MIN_VALUE;
		
		while (cur_x_end <= inputSize) { // N x N 배열의 사이즈를 넘지 않아야 ...
			tmp_max = 0;
			for (int i=cur_x_st; i< cur_x_end ; i++) {
				for (int j=cur_y_st; j< cur_y_end ; j++) {
					tmp_max += inputData[i][j];
				}
			}
			cur_y_st++;
			cur_y_end++; // 일단 열이 증가하도록
			
			if (cur_y_end > inputSize) { // 열이 증가하다가 배열의 사이즈 보더 커지면
				
				cur_x_st++;
				cur_x_end++;
				cur_y_st = 0;
				cur_y_end = endValue;
			}
			
			if (maximumValue < tmp_max) {
				maximumValue = tmp_max;
			}
			
		}
		
		return maximumValue;
	}
	
	// 기존 Best Answer
	private int getMaxValue(int[][] inputData, int endValue) {
		// TODO Auto-generated method stub
		int maximumValue = 0;
		int maxLength = inputData.length; //배열의 크기
		int orgCurrentXEnd = endValue;    //1,2,3,4 값 - 순차적

		int currentXEnd = endValue; // orgCurrentXEnd 와 차이는??
		int currentYEnd = endValue;
		int currentXStart = 0;
		int currentYStart = 0;

		while (maxLength >= currentXEnd) {
			int sum = 0;
			for (int i = currentXStart; i < currentXEnd; i++) {
				for (int j = currentYStart; j < currentYEnd; j++) {
					sum = sum + inputData[j][i];
					System.out.println(">" + j + "/" + i + " = " + inputData[j][i]);
				}
			}
			currentXStart++;
			currentXEnd++;
			
			System.out.println("=>" + sum);
			
			// currentYStart++;
			// currentYEnd++;

			if (maximumValue < sum) {
				maximumValue = sum;
			}
		}
		currentYStart++;
		currentYEnd++;

		currentXEnd = orgCurrentXEnd;
		currentXStart = 0;
		while (maxLength >= currentYEnd) {
			int sum = 0;
			for (int i = currentXStart; i < currentXEnd; i++) {
				for (int j = currentYStart; j < currentYEnd; j++) {
					sum = sum + inputData[j][i];
					System.out.println(">>" + j + "/" + i + " = " + inputData[j][i]);
				}
			}
			currentXStart++;
			currentXEnd++;

			currentYStart++;
			currentYEnd++;
			
			System.out.println("==>" + sum);
			
			if (maximumValue < sum) {
				maximumValue = sum;
			}
		}
		return maximumValue;
	}
}
