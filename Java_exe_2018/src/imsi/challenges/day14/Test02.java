package imsi.challenges.day14;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test02 t = new Test02();
		
		int n = 6;
		int[] ti = {7, 10};
		
		long an = t.solution(n, ti);
		
		System.out.println(an);

	}
	
    public long solution(int n, int[] times) {
    	//long answer = 0;
    	long answer = Long.MAX_VALUE;
    	long left = 0;
    	long right = 0;
    	long mid = 0;
    	
    	for (int i=0; i< times.length ; i++) {
    		right = Math.max(right, times[i]);
    	}
    	right = n*right;
    	
        while (left <= right) {
            long done = 0;
            mid = (left + right) / 2;

            for (int time : times) {
                done += mid / time;
            }

            if (done < n) {
            	// 해당 시간동안 심사를 다 하지 못한 경우
                left = mid + 1;
            }
            else {
            	// 시간이 여유있거나, 딱 맞는 경우
                if (mid < answer) {
                	// 가장 타이트한 시간을 찾아야 하므로
                    answer = mid;
                }

                right = mid - 1;
            }
        }

        return answer;
    }
    // https://medium.com/@leeth0610/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%9D%B4%EB%B6%84%ED%83%90%EC%83%89-%EC%9E%85%EA%B5%AD%EC%8B%AC%EC%82%AC-3856b3975941
} 
