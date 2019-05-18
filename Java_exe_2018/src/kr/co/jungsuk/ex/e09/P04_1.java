package kr.co.jungsuk.ex.e09;

public class P04_1 {
	// [9-4] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
	/*
		메서드명 : printGraph
		기 능 : 주어진 배열에 담긴 값만큼 주어진 문자를 가로로 출력한 후, 값을 출력한다.
		반환타입 : 없음
		매개변수 : int[] dataArr - 출력할 그래프의 데이터
				char ch - 그래프로 출력할 문자.
	*/
	static void printGraph(int[] dataArr, char ch) {
		/*
		(1) printGraph메서드를 작성하시오.
		*/
		
		for (int idx : dataArr) {
			String tmp_s = "";
			for (int i = 0; i<idx; i++) {
				tmp_s += ch;
			}
			tmp_s += idx;
			System.out.println(tmp_s);
		}
	}
	
	public static void main(String[] args) {
		printGraph(new int[]{3,7,1,4},'*');
	}

}