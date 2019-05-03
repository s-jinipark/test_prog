package kr.co.programmers.lv2.prt29;

public class Landing_Game2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Landing_Game2 lg = new Landing_Game2();
		
		int[][] land1 = {
				{1,2,3,5},{5,6,7,8},{4,3,2,1}
				};
		int rtn1 = lg.solution( land1  );
		System.out.println("[1] > " + rtn1);


		
	}

	public int solution(int[][] land) {
		int answer = 0;
		int size = land.length;
		// 열은 4로 고정
		for (int i = 0; i < size - 1; i++) {
			land[i + 1][0] += Math.max(land[i][1], Math.max(land[i][2], land[i][3]));
			land[i + 1][1] += Math.max(land[i][0], Math.max(land[i][2], land[i][3]));
			land[i + 1][2] += Math.max(land[i][0], Math.max(land[i][1], land[i][3]));
			land[i + 1][3] += Math.max(land[i][0], Math.max(land[i][1], land[i][2]));
        }
		
		answer = Math.max(land[size-1][0], Math.max(land[size-1][1], Math.max(land[size-1][2], land[size-1][3])));
	       
		return answer;

    } 
	// 
}
