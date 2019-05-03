package kr.co.programmers.lv2.prt34;

import java.util.Stack;

public class Remove_Pairs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remove_Pairs2 rp = new Remove_Pairs2();
		
		String s1 = "baabaa";
		
		int rtn1 = rp.solution( s1  );
		System.out.println("[1] > " + rtn1);

		String s2 = "cdcd";
		
		int rtn2 = rp.solution( s2  );
		System.out.println("[2] > " + rtn2);

		
	}

	public int solution(String s) {
		int answer = 0;
		
        Stack<Character> referenceStack = new Stack<Character>();
        
        Stack<Character> movingStack = new Stack<Character>();
        
		// 적재 
		for (int i=0; i<s.length(); i++) {
			referenceStack.push( s.charAt(i) );
		}
		
        while (true) {
            //이동하게 될 stack이 비어있다면 referenceStack char를 하나 이동시킵니다.
            if(movingStack.isEmpty()) {
                movingStack.push(referenceStack.pop());
            }
            //첫 stack의 가장 맨위의 char와 이동시킨 stack의 맨위의 char와 값이 같다면 두 개를 같이 stack에서 빼줍니다.
            if(referenceStack.peek() == movingStack.peek()) {
                referenceStack.pop();
                movingStack.pop();
            } 
            //다르다면 그냥 이동시킵니다.
            else {
                movingStack.push(referenceStack.pop());
            }        
            
            // 이 로직은 referenceStack이 비었을 때 종료하게 됩니다.
            // 만약 다 짝이 맞는다면 두개의 stack 모두 비어있는 상황이 될 것이고,
            // 짝이 맞지 않다면 movingStack은 비지 않게 됩니다.
            if(referenceStack.isEmpty() && movingStack.isEmpty()) {
                answer = 1;
                break;
            } 
            else if(referenceStack.isEmpty() && !movingStack.isEmpty()) {
                break;
            }
        }
        return answer;
	}     
	// 런타임 에러 ?? -> 1, 9, 11
}
