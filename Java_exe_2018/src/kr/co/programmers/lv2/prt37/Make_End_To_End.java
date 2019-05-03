package kr.co.programmers.lv2.prt37;

import java.util.HashSet;

public class Make_End_To_End {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Make_End_To_End me2e = new Make_End_To_End();
		
		int n1 = 3;
		String[] w1 = {
		"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"		
		};
		int[] rtn1 = me2e.solution(  n1 , w1 );
		System.out.println("[1] > " + rtn1[0] + "/ " + rtn1[1] );
		

		int n2 = 5;
		String[] w2 = {
			"hello", "observe", "effect", "take", "either", "recognize", "encourage", 
			"ensure", "establish", "hang", "gather", "refer", "reference", "estimate", 
			"executive"	
		};
		int[] rtn2 = me2e.solution(  n2 , w2 );
		System.out.println("[2] > " + rtn2[0] + "/ " + rtn2[1] );

		int n3 = 2;
		String[] w3 = {
			"hello", "one", "even", "never", "now", "world", "draw"
		};
		int[] rtn3 = me2e.solution(  n3 , w3 );
		System.out.println("[3] > " + rtn3[0] + "/ " + rtn3[1] );
		
	}

	public int[] solution(int n, String[] words) {
		int[] answer = {0, 0};
		
		// 말했던 목록을 가지고 있어야 함
		HashSet<String> hs1 = new HashSet<>();
		// 끝말여부 확인
		char priv = ' ';
		int tmp_cnt1 = 0; // 몇번째 사람인지
		int tmp_cnt2 = 0; // 몇번 한바퀴 돌았는지
		boolean game_stop = false;
		
		for (int i=0; i< words.length ; i++) {
		
			// 몇번째 사람인지 먼저
			//System.out.println("-->" + i%n);
			tmp_cnt1 =  i%n;
			if (tmp_cnt1 ==0) {
				tmp_cnt2++; // 0 이 될때마다 횟수 추가 
				// i=0 부터 1회.. 시작..
			}
			
			if (  hs1.contains(words[i]) ) {
				
				game_stop = true;
				break;
			} else {
				hs1.add( words[i] );
				//System.out.println("->" + hs1);

				char tmp_c = words[i].charAt(0);
				//System.out.println("=>" + priv + "//" + tmp_c);
				if (i>0 && (priv != tmp_c) ) {
					game_stop = true;
					break;
				} else {
					priv = words[i].charAt(words[i].length()-1);
				}	
			}
			
		}
		
		//System.out.println(">" + tmp_cnt1 + "/" + tmp_cnt2 );
		if ( game_stop ) {
			answer[0] = tmp_cnt1 + 1;// 0부터 시작했으니 감안
			answer[1] = tmp_cnt2 ; 
		}
		return answer;

    } 
	// 
}
