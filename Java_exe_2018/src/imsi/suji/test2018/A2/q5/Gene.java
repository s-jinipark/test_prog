package imsi.suji.test2018.A2.q5;

public class Gene {
	/**
	 * 단순비교 방식의 유사도 측정 기능
	 *
	 * @param inputData String 입력데이터(유전자 문자열)
	 * @return int 유사도
	 */
	public int measureSimpleComparison(String inputData) {
		int similarity = 0;
		////////////////////// 여기부터 구현 (1) ---------------->
		int size = inputData.length() -2 ; // "," 제외 & 1개 중첩 예정
		String front = inputData.substring(0, inputData.indexOf(",") ); // 앞부분
		String end = inputData.substring( inputData.indexOf(",")+1 );   // 뒷 부분
		String[][] test = new String[2][size]; // 2 행 n 열  (2차원 배열)
		
		System.out.println("> " + front + " / " + end + " // " + size);
		
		//셋팅 - 0 행 1열 부터
		for (int i=0 ; i < front.length() ; i++ ) {
			test[0][i] = front.charAt(i)+"";
		}
		
		// 1행 front 끝나는 부분 부터
		for (int i=0 ; i < end.length() ; i++ ) {
			test[1][front.length()-1+i] = end.charAt(i)+"";
		}
		
		// 인쇄 확인
		for (int i=0 ; i < test.length ; i++ ) {
			for (int j =0 ; j < test[i].length ; j++ ) {
				System.out.print(" " + test[i][j]);
			}
			System.out.println("");
		}
		
		int cur_end_1 = front.length()-1;   // 1행의 끝
		int cur_start_2 = front.length()-1; // 2행의 시작 - 중첩되서 시작
		
		int t_simular = 0;
		// 유사도 계산
		while ( cur_end_1 < test[0].length ) {
//			for (int i=0 ; i < test[0].length ; i++ ) {
//				System.out.println(test[0][i] +"/" + test[1][i] );
//				if ( ( test[0][i] != null ) && ( test[1][i] != null ) ) {
//					if ( test[0][i].equals( test[1][i] ) ) {
//						t_simular++;
//					}
//				}	
//			}
//			System.out.println("=" + t_simular);
			// 이동
			
//			for (int i=cur_end_1 ; i < test[0].length ; i++ ) {
//				test[0][i+1] = test[0][i] ;
//				test[0][i] = null;
//			}
//			cur_end_1++;
		}
		///////////////////////////// <-------------- 여기까지 구현 (1)
		return similarity;
	}

	public static String getGenom(String str, int size, int start) {
		StringBuilder tmp = new StringBuilder();

		for (int i = 0; i < start; i++) {
			tmp.append("-");
		}
		tmp.append(str);
		for (int i = start + str.length(); i < size; i++) {
			tmp.append("-");
		}
		return tmp.toString();
	}

	/**
	 * 행렬비교 방식의 유사도 측정 기능
	 *
	 * @param inputData        String 입력데이터(유전자 문자열)
	 * @param similarityMatrix int[][] 입력데이터(유사도 측정 행렬)
	 * @return int 가장 큰 유사도
	 */
	public int measureSortComparison(String inputData, int[][] similarityMatrix) {
		int maxSimilarity = 0;
		////////////////////// 여기부터 구현 (2) ---------------->

		
		///////////////////////////// <-------------- 여기까지 구현 (2)
		return maxSimilarity;
	}

	public static int getNum(char ch) {
		if (ch == 'A')
			return 0;
		else if (ch == 'C')
			return 1;
		else if (ch == 'G')
			return 2;
		else if (ch == 'T')
			return 3;
		else
			return 4;
	}
}
