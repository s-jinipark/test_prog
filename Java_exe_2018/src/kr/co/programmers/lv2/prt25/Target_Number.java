package kr.co.programmers.lv2.prt25;

public class Target_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Target_Number ln = new Target_Number();
		
		int[]  n1 = { 1, 1, 1, 1, 1 };
		int t1 = 3;
		int rtn1 = ln.solution( n1 , t1 );
		System.out.println("[1] > " + rtn1);
		

		
	}

	public int solution(int[] numbers, int target) {
        //int answer = 0;
		
		dfs(target, numbers, 0);
        return answer;
    }
    // 
	static int answer = 0;
	// dfs 처리함수
    public void dfs(int target, int[] numbers, int k) {
        if(k == numbers.length) {
            int sum = 0;
            for(int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            if(sum == target) {
                answer++;
            }
            return;
        } else {
            numbers[k] *= 1;
            dfs(target, numbers, k + 1);
            
            numbers[k] *= -1;
            dfs(target, numbers, k + 1);
        }
    }
}
