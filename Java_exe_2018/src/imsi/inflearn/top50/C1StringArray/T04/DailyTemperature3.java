package imsi.inflearn.top50.C1StringArray.T04;

import java.util.*;
import java.util.Stack;


public class DailyTemperature3 {

	public static void main(String[] args) {
		int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};
		int[] res = dailyTemperatures(nums);
//		int[] res = dailyTemperatures_back(nums);
		System.out.println("====result===");
		for(int i : res) {
			System.out.print(i+" ");
		}
	}
	public static int[] dailyTemperatures(int[] temperatures) {
		//1
		Stack<Integer> stack = new Stack<>();
		int[] ret = new int[temperatures.length];
		
		//2
		for (int i=0 ; i<temperatures.length; i++) {
			while (!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]) {
				
				int index = stack.pop();
				ret[index] = i - index;
			}
			stack.push(i);
		}

	    return ret;
	}
	
}
