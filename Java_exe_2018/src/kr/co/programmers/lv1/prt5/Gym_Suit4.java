package kr.co.programmers.lv1.prt5;

import java.util.ArrayList;
import java.util.Collections;

public class Gym_Suit4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gym_Suit4 gs = new Gym_Suit4();

		int n1 = 5;
		int[] lost1 = {2, 4};
		int[] reserve1 = {1, 3, 5};
		int rtn1 = 0;
		
		rtn1 = gs.solution(n1, lost1, reserve1);
		System.out.println("[1] > " + rtn1);

		int n2 = 5;
		int[] lost2 = {2, 4};
		int[] reserve2 = {3};
		int rtn2 = 0;
		
		rtn2 = gs.solution(n2, lost2, reserve2);
		System.out.println("[2] > " + rtn2);

		//int n3 = 3;
		//int[] lost3 = {3};
		//int[] reserve3 = {1};
		
		//int n3 = 24;
		//int[] lost3 = {12, 13, 16, 17, 19, 20, 21, 22};
		//int[] reserve3 = {1,22, 16, 18, 9, 10};	
		
		int n3 = 5;
		int[] lost3 = {2, 3};
		int[] reserve3 = {5, 3, 1};	// 3���� ������ ���� ����
		int rtn3 = 0;
		
		rtn3 = gs.solution(n3, lost3, reserve3);
		System.out.println("[3] > " + rtn3);

		int n4 = 5;
		int[] lost4 = {2, 4, 5};
		int[] reserve4 = {1, 4}; 
		int rtn4 = 0;
		
		rtn4 = gs.solution(n4, lost4, reserve4);
		System.out.println("[4] > " + rtn4);
		
	}

	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        answer = n;

        
        ArrayList<Integer> a_lost = new ArrayList<>();
        ArrayList<Integer> a_resv = new ArrayList<>();
        
       	for(int i : lost) {
       		a_lost.add(i);
       	}
       	for(int j : reserve) {
       		a_resv.add(j);
       	}
       	
       	int bollowed = 0;
       	int self = 0;
       	// �Ҿ���� ��� �� ������ ���� ������ �ִ� ��� ���� ó��
       	for (int i=0 ; i<a_lost.size() ; i++) {
       		int tmp = a_lost.get(i);
       		
       		//if ( a_resv.contains(tmp) ) { //-> �ȵ�
       		for (int j=0 ; j<a_resv.size() ; j++) {
       			if (tmp == a_resv.get(j)) {
	       			// ���� ������ �����ش�
	       			a_lost.remove(i);
	       			a_resv.remove(j);
	       			self++;
	       			break;
       			}
       		}
       	}
       	
       	// �ϴ� a_lost ����
       	// �չ�ȣ ���� �˻� �� ó��
       	Collections.sort(a_lost);
    	Collections.sort(a_resv);
    	
       	for (int i=0 ; i<a_lost.size() ; i++) {
       		int prev = a_lost.get(i)-1;
       		int next = a_lost.get(i)+1;

       		for (int j=0 ; j<a_resv.size() ; j++) { // �� ��ȣ ����
       			if (prev == a_resv.get(j)) {

	       			a_resv.remove(j);
	       			bollowed++;
	       			break;
       			}else if (next == a_resv.get(j)) {

	       			a_resv.remove(j);
	       			bollowed++;
	       			break;
       			}
       		}
       		
       	}    	
       	
        System.out.println("1->" + bollowed + "/ 2->" + self);
        // �ʱ� �ο� - �Ҿ���� �ο� + ���� �ο�
    	answer = answer - (lost.length-self) + bollowed ;	
        return answer;
	}
}