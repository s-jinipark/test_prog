package kr.co.programmers.lv2.prt8;

public class Joy_Stick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joy_Stick js = new Joy_Stick();
		
		String s1 = "JEROEN";
		int rtn1 = js.solution( s1 );
		System.out.println("[1] > " + rtn1);

		String s2 = "JAN";
		int rtn2 = js.solution( s2 );
		System.out.println("[2] > " + rtn2);
	}

	public int solution(String name) {
        int answer = 0;
        /*
		▲ - 다음 알파벳
		▼ - 이전 알파벳 (A에서 아래쪽으로 이동하면 Z로)
		◀ - 커서를 왼쪽으로 이동 (첫 번째 위치에서 왼쪽으로 이동하면 마지막 문자에 커서)
		▶ - 커서를 오른쪽으로 이동
        */
        // A : 65, Z : 90 
        char test1 = 'R';
        System.out.println(">" + ((int)'Z' - (int)test1 ) );
        
        char[] test = name.toCharArray();
        int chk1 = 0;
        int chk2 = 0;
        int sum = 0;
        
        for (int i=0; i<test.length; i++) {
        	chk1 = (int)test[i] - (int)'A';
        	chk2 = (int)'Z' - (int)test[i] +1;  // A-> Z 추가 (+1)
        	System.out.println(chk1 + " / " + chk2);
        	if (chk1 >= chk2) {
        		sum += chk2;
        	} else if (chk1 < chk2) {
        		sum += chk1;
        	}
        	if (i == test.length-1 ) {
        		break;
        	} else {
        		sum++; // 다음 문자
        	}
        }
        
        answer = sum;
        
        return answer;
    }

}
