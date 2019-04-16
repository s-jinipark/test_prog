package kr.co.programmers.lv1.prt3;

public class Kth_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kth_Number kn = new Kth_Number();
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { 
				{2, 5, 3 }, // 2번째부터 5번째까지 자른 후 정렬, 세 번째 숫자
				{4, 4, 1 }, // 4번째부터 4번째까지 자른 후 정렬, 첫 번째 숫자
				{1, 7, 3 } }; // 1번째부터 7번째까지 자른 후 정렬, 세 번째 숫자
		
		int[] answer1 = kn.solution(array, commands);
	}

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        
        
        
        return answer;
    }
    
}
