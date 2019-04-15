package kr.co.programmers.lv1.prt2;

import java.util.ArrayList;

public class Person_Give_Up_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person_Give_Up_Math pgum = new Person_Give_Up_Math();
		int[] answers1 = { 1,2,3,4,5 };
		int[] answers2 = { 1,3,2,4,2 };
		
		int[] answers3 = { 1,3,2,4,2 ,2,2,2,2 };
		
		int[] answer1 = pgum.solution(answers1);
		int[] answer2 = pgum.solution(answers2);
		
		int[] answer3 = pgum.solution(answers3);
		
		//System.out.println(answer1.toString());
	}

	
	public int[] solution(int[] answers)  {
        //int[] answer = {};
        //System.out.println(answers.length);
        int[] p1 = { 1, 2, 3, 4, 5 }; // 5 반복
        int[] p2 = { 2, 1, 2, 3, 2, 4, 2, 5 }; // 8 반복
        int[] p3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 }; // 10 반복
        int top_cnt = 0;

        int[] ans = {0, 0, 0}; 
        
        for(int i = 0; i<answers.length; i++) {
        	//System.out.println(i + " // " + i%5);
        	if (i >= 5) {
        		if ( answers[i] == p1[i%5] ) ans[0]++;
        	} else {
        		if ( answers[i] == p1[i] ) ans[0]++;
        	}
        	
        	if (i >= 8) {
        		if ( answers[i] == p2[i%8] ) ans[1]++;
        	} else {
        		if ( answers[i] == p2[i] ) ans[1]++;
        	}
        	
        	if (i >= 10) {
        		if ( answers[i] == p3[i%10] ) ans[2]++;
        	} else {
        		if ( answers[i] == p3[i] ) ans[2]++;
        	}
        }
        
        System.out.println(">" + ans[0] + " / " + ans[1] + " / " + ans[2] );
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int j = 0; j<ans.length; j++) {
        	if (ans[j] > top_cnt) {
        		top_cnt = ans[j];
        		if ( al.size() > 0 ) {
        			al.removeAll(al); // 기존 삭제
        		}
        		al.add(j+1); // 번호 입력
        	} else if (ans[j] == top_cnt){
        		al.add(j+1); // 번호 입력
        	} 
        }
        
        System.out.println(al.toString());
        int[] answer = new int[al.size()];
        for (int k=0; k<al.size(); k++ ) {
        	answer[k] = al.get(k);
        }
        return answer;
	}
}
