package imsi.challenges.day10;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test02 t = new Test02();
						

		int[] arr = {1, 1, 1, 1, 1};
		int tgt = 3;
		
		int an = t.solution(arr, tgt);
		
		System.out.println(an);


	}
	
	static int ANSWER = 0;
	
	public int solution(int[] numbers,  int target) {
		//int answer = 0;
		
		//return answer;
		dfs(numbers, target, 0);
		return ANSWER;
    }

    public void dfs(int[] numbers, int target, int index) {
        if(index == numbers.length) {
        	int sum = 0;
        	for (int i=0 ; i<numbers.length ; i++) {
        		sum += numbers[i];
        	}
        	if (sum == target) ANSWER++;
        	
            return ;
        } else {
        	numbers[index] *= 1;
        	dfs(numbers, target, index+1);
        	
        	numbers[index] *= -1;
        	dfs(numbers, target, index+1);            
        }
    }
	
}
