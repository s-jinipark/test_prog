package kr.co.programmers.lv2.prt27;

public class Next_Big_Number3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Next_Big_Number3 nbn = new Next_Big_Number3();
		
		int n1 = 78;
		int rtn1 = nbn.solution( n1  );
		System.out.println("[1] > " + rtn1);

		int n2 = 15;
		int rtn2 = nbn.solution( n2  );
		System.out.println("[2] > " + rtn2);

	}

	public int solution(int n) {
		int answer = 0;
		
		String nToBinary = Integer.toBinaryString(n); // @1
		int nCount = 0; // 
		for(int i=0; i<nToBinary.length(); i++) { // @2
			if(nToBinary.charAt(i) == '1') nCount++;
		}
		
		int tmp = 0, tmpCount = 0;
		for(tmp = n+1; nCount != tmpCount; tmp++) { // @3
			String tmpToBinary = Integer.toBinaryString(tmp); // @4
			tmpCount = 0;
			for(int i=0; i<tmpToBinary.length(); i++) { // @5
				if(tmpToBinary.charAt(i) == '1') tmpCount++;
			}
		}
		
		return tmp-1; // @6
    } 
	// 
    
}
