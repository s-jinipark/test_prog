package kr.co.infopub.chap015;

import java.util.Arrays;

public class MathTest1Main100 {

	public static void main(String[] args) {
		

		//random
		double dRan=Math.random();//0<==dRan<1 실수
		int    iRan=(int)(Math.random()*100);//0<==iRan<100 정수
		System.out.println("16: Math.random()=> "+dRan);
		System.out.println("17: (int)(Math.random()*100)=> "+iRan);
		
		for (int i=0; i<6; i++) {
			int iRan2=(int)(Math.random()*46);//0<==iRan<100 정수
			System.out.println(i+" : (int)(Math.random()*46)=> "+iRan2);
		}
		
		//중복없이 (로또 번호)
		int[] lotto = new int[6];
		int indx = 0;
		while (indx < 6) {
			int iRan2=(int)(Math.random()*46);//0<==iRan<100 정수
			
			//System.out.println(indx+" : (int)(Math.random()*46)=> "+iRan2);
			boolean dup = false;
			for (int j=0; j<lotto.length;j++) {
				if (lotto[j] == iRan2) {
					dup = true;
				}
			}
			if (!dup) {
				lotto[indx] = iRan2;
				indx++;
			}
			
		}
		for (int j=0; j<lotto.length;j++) {
			System.out.println("["+j+"] : => "+lotto[j]);
		}
		//소트 한번 해주지 *****
		Arrays.sort(lotto);
		for (int j=0; j<lotto.length;j++) {
			System.out.println("s["+j+"] : => "+lotto[j]);
		}		
	}
}
