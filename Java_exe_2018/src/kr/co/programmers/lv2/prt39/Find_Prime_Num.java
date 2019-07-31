package kr.co.programmers.lv2.prt39;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_Prime_Num {

	List<Integer> list = new ArrayList<>();
	Set<Integer> set = new HashSet<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Find_Prime_Num fpn = new Find_Prime_Num();
		
		String num = "011";
		
		int rtn1 = fpn.solution(  num );
		System.out.println("[1] > " + rtn1 );
		
		
	}

	public int solution( String num ) {
		int answer = 0; 
		
		char[] test = num.toCharArray();
		int len = test.length;
		
		for (int i=1; i<=len ; i++) {
			perm(test, 0, len, i);
		}
		
		//perm(test, 0, 2, 1);
		
		//set 확인
		for (int i : set) {
			System.out.println(">" + i + "/" + isPrime(i) );
			// 소수인지 확인
			if ( isPrime(i) ) answer++;
		}
		
		return answer;

    } 
	
	// 배열 arr 는 계속해서 데이터를 들고 다니면서 교환되고 있는 배열
	// depth 는 현재 트리구조에서 어느 깊이에서 교환작업을 하고 있는지
	// n 은 배열안에 들어있는 숫자를 뜻하며 고정값이다
	// k 는 몇개를 뽑아내서 순열을 만들 것인지를 뜻하며 고정값이다
	public void perm(char[] arr, int depth, int n, int k) {
		
		if ( depth == k ) {
			//print(arr, k);
			//System.out.println(print(arr, k)) ;
			set.add(Integer.parseInt(print(arr, k)));
			return;
		} 
		
		for (int i = depth; i < n ; i++) {
			swap(arr, i, depth);
			perm(arr, depth+1, n, k);
			swap(arr, i, depth);
		}
	}
	
	
	public void swap(char[] arr, int i, int j) { 
		char temp = arr[i]; 
		arr[i] = arr[j]; 
		arr[j] = temp; 
	}

	public String print(char[] arr, int k) { 
		String  rtn = "";
		for (int i = 0; i < k; i++) { 
//			if (i == k - 1) 
//				System.out.println(arr[i]); 
//			else 
//				System.out.print(arr[i] + ","); 
			
			rtn += arr[i]+"";
		} 
		return rtn;
	}

	
	public boolean isPrime(int num) {
		int n = 2;	//사용자의 입력값을 대상으로 
					//나눗셈 연산을 수행할 변수(1씩 증가 예정) 
		if (num == 0 || num == 1 ) return false; // 1 제외
		
		boolean flag=true;	//--소수다~!!!(check~!!!) 
		while(n<num) { 
			if(num%n==0) { 
				flag = false;	//-- 소수가 아니다~!!! 
				break;
			} 
			n++; 
		}

		return flag;
	}

}
