package imsi.inflearn.top50.C1StringArray.T04;

import java.util.Stack;


public class DailyTemperature4 {

	public static void main(String[] args) {
		int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};
		int[] res = dailyTemperatures(nums);

		System.out.println("====result===");
		for(int i : res) {
			System.out.print(i+" ");
		}
	}
	public static int[] dailyTemperatures(int[] temperatures) {
		//1
		Stack<Integer> stack = new Stack<>();
		int[] ret = new int[temperatures.length];
		
		//2 온도 배열 만큼 loop
		for (int i=0 ; i<temperatures.length; i++) {
			// 배열을 돌다가 스택을 check , 큰 값이 있을 경우 스택에서 꺼낸다
			while (!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]) {
				// resulet[0] = 1-0
				int index = stack.pop();
				ret[index] = i - index;
			}
			// 아닐 경우 스택에 집어 넣는다
			stack.push(i);
		}

	    return ret;
	}
	
}
