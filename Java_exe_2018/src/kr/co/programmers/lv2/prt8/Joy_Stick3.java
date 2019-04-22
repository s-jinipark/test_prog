package kr.co.programmers.lv2.prt8;

public class Joy_Stick3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joy_Stick3 js = new Joy_Stick3();
		
		String s1 = "JEROEN";
		int rtn1 = js.solution( s1 );
		System.out.println("[1] > " + rtn1);

		String s2 = "JAN";
		int rtn2 = js.solution( s2 );
		System.out.println("[2] > " + rtn2);
		
		String s3 = "JAA";
		int rtn3 = js.solution( s3 );
		System.out.println("[3] > " + rtn3);
		
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
        //char test1 = 'R';
        //System.out.println(">" + ((int)'Z' - (int)test1 ) );
        
        char[] test1 = name.toCharArray();
        char[] test2 = name.toCharArray();
        for (int i=1 ; i<test1.length; i++) {
        	test2[test1.length-i]=test1[i];
        }
        
        for (int j=0; j<test1.length; j++) {
        	System.out.println(test1[j] + " / " + test2[j]);
        }
        int chk1 = 0;
        int chk2 = 0;
        int sum1 = 0;
        int sum2 = 0;
        
        for (int i=0; i<test1.length; i++) {
        	chk1 = (int)test1[i] - (int)'A';
        	chk2 = (int)'Z' - (int)test1[i] +1;  // A-> Z 추가 (+1)
        	//System.out.println(chk1 + " / " + chk2);
        	if (chk1 >= chk2) {
        		sum1 += chk2;
        	} else if (chk1 < chk2) {
        		sum1 += chk1;
        	}
        	if (i == test1.length-1 ) {
        		break;
        	} else {
        		sum1++; // 다음 문자
        	}
        }
        for (int i=0; i<test2.length; i++) {
        	chk1 = (int)test2[i] - (int)'A';
        	chk2 = (int)'Z' - (int)test2[i] +1;  // A-> Z 추가 (+1)
        	//System.out.println(chk1 + " / " + chk2);
        	if (chk1 >= chk2) {
        		sum2 += chk2;
        	} else if (chk1 < chk2) {
        		sum2 += chk1;
        	}
        	if (i == test2.length-1 ) {
        		break;
        	} else {
        		sum2++; // 다음 문자
        	}
        } 
        
        if (sum1 >= sum2) {
        	answer = sum2;
        } else {
        	answer = sum1;
        }
        //answer = sum;
        
        return answer;
    }

}
