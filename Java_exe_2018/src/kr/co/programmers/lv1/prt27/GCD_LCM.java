package kr.co.programmers.lv1.prt27;

import java.util.Arrays;

public class GCD_LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GCD_LCM gl = new GCD_LCM();
		int n = 3;
		int m = 12;
		
		int[] answer1 = gl.solution(n, m);
		for (int i : answer1) {
			System.out.println("->" + i);
		}
	}

    public int[] solution(int n , int m ) {

        int[] answer = new int[2];
        int big = 0;
        int small = 0;
        int r = 1;
        
        // 큰값 식별
        if (n < m) {
        	big = m;
        	small = n;
        } else {
        	big = n;
        	small = m;
        }
        
        while (r > 0) { // 유클리드 호제법을 이용한 GCD(최대공약수)구하기
        	r = big%small;
        	big = small;
        	small = r;
        }
        
        int LCM = n * m / big; // LCM(최소공배수)구하기
        
        System.out.println("GCD 최대공약수 : " + big);
        System.out.println("LCM 최소공배수 : " + LCM);
        return answer;
    }
    
}
