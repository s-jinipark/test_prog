package kr.co.programmers.lv2.prt40;

import java.util.Stack;

public class Steel_Stick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Steel_Stick ss = new Steel_Stick();
		
		String s1 = "()(((()())(())()))(())";
		int rtn1 = ss.solution( s1  );
		System.out.println("[1] > " + rtn1);
			
		
	}

	public int solution(String arrangement) {
        int answer = 0;
        
        /*
                  가장 처음 해야 할 것은, 레이저인 '()'를 괄호를 사용하지 않는 것으로 표현해줘야 한다. 
                  스택에 ( 또는 )를 넣어야 하는데 레이저가 () 모양이면 예외 처리를 하는데 상당히 힘들 것이다. 
                  
                  나는 replace 함수를 사용하여 () 를 1 로 바꿨다.

                  후에 String을 읽어갈 것인데, 3가지 규칙을 정했다.

        1. '(' 가 나오면 스택에 Push() 해준다.

        2. '1'이 나오면 스택의 사이즈 만큼 정답에 더해준다.

        3. ')'가 나오면 pop()을 해서 짝을 맞춰주고 1을 더해준다.
        */
        
        //String temp = arrangement.replaceAll("()", "1");
        String temp = arrangement.replace("()", "1"); // replaceAll 은 이상함
        System.out.println(temp);
        
        Stack<Character> a = new Stack<Character>();
        
        for (int i=0; i < temp.length() ; i++) {
        	char temp_c = temp.charAt(i);
        	if (temp_c == '(') {
        		a.push(temp_c);
        	} else if (temp_c == '1') {
        		answer += a.size();
        	} else if (temp_c == ')') {
    		   answer += 1;  // 주의
               a.pop();
        	} 
        }
        
        return answer;
    }
    
}
