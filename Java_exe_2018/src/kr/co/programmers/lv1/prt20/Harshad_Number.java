package kr.co.programmers.lv1.prt20;

public class Harshad_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Harshad_Number hn = new Harshad_Number();
		int n1 = 10;
		boolean rtn1 = hn.solution( n1  );
		System.out.println("[1] > " + rtn1);
		int n2 = 12;
		boolean rtn2 = hn.solution( n2  );
		System.out.println("[2] > " + rtn2);
	}

	public boolean solution(int x) {
		 boolean answer = true;

		 char[] test = (x+"").toCharArray();
		 int tmp_sum = 0;
		 //System.out.println(">"+ test.length);
		 for (int i=0; i< test.length; i++) {
			 //System.out.println(">"+ test[i]);
			 tmp_sum += new Integer(test[i]+"");
		 }
		 //System.out.println(">"+ tmp_sum );
		 
		 if ( x%tmp_sum != 0) 
			 answer = false;
		 return answer;
	}
}
