package imsi.inflearn.top50.C1StringArray.T04;

import java.util.*;
import java.util.Stack;


public class DailyTemperature2 {

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

		int[] ret = new int[temperatures.length];
		
		for (int i=0 ; i<temperatures.length-1; i++) {
			int cnt = 1;
			ret[i] = 0; // ÃÊ±âÈ­
			for (int j=i+1; j<temperatures.length ; j++) {
				if (temperatures[i] < temperatures[j]) {
					ret[i]=cnt;
					break;
				} else {
					cnt++;
				}
			}
		}

	    return ret;
	}
	
	
    public int[] dailyTemperatures_Map(int[] temperatures) {
        final int m = temperatures.length;
        final Map<Integer, Integer> next = new HashMap<>();
        final Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < m; i++) {
            while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
                next.put(stack.peek(), i - stack.pop());
            }
            stack.push(i);
        }
        final int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            ans[i] = next.getOrDefault(i, 0);
        }
        return ans;
    }
	
	public static int[] dailyTemperatures_back(int[] T) {
		LinkedList<Integer> stack = new LinkedList<>();
        int[] ans = new int[T.length];
        stack.push(T.length-1);
        for(int i = T.length -2;i>=0;i--){
            while(!stack.isEmpty() && T[i] >= T[stack.peek()]) 
                stack.pop();
            if(!stack.isEmpty())
                ans[i] = stack.peek() - i;
            stack.push(i);
        }
        return ans;
    }
}
