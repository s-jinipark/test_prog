package imsi.inflearn.top50.C3QueueStack.T01;

import java.util.Stack;

public class BaseballGame {

	
	public static void main(String[] args) {
		String[] strs = {"5","-2","4","C","D","9","+","+"};
		System.out.println(calPoints(strs));
	}

	public static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        // baseball ? 계산기 아닌가 ?
        int x = 0;
        int y = 0;
        //for (int i=0 ; i< ops.length ; i++) {
        for (String op : ops ) {
        	switch (op) {
	        	case "C" : // 마지막 거 빼버림
	        		stack.pop();
	        		break;
	        	case "D" : // 더블
	        		x = stack.pop();
	        		y = x * 2 ;
	        		stack.add(x);
	        		stack.add(y);
	        		System.out.println(">" + y);
	        		break;
	        		// 굳이 꺼낼 필요 없이 peek() 로 ...
	        	case "+" : // 순서대로 꺼낸 뒤 계산 -> 다시 순서대로 add
	        		x = stack.pop();
	        		y = stack.pop();
	        		stack.add(y); // y 부터 넣는다
	        		stack.add(x);
	        		stack.add(x+y);
	        		break;
	        	default : 
	        		stack.add(Integer.valueOf(op));
        	}
        }
        
        // 마지막 계산
        while (!stack.isEmpty()) {
        	sum += stack.pop();
        }
        return sum;
    }
}
