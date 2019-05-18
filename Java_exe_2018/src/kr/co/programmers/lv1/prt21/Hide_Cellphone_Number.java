package kr.co.programmers.lv1.prt21;

public class Hide_Cellphone_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hide_Cellphone_Number hcn = new Hide_Cellphone_Number();
		String n1 = "01033334444";
		String rtn1 = hcn.solution( n1  );
		System.out.println("[1] > " + rtn1);
		
		String n2= "027778888";
		String rtn2 = hcn.solution( n2  );
		System.out.println("[2] > " + rtn2);
	}

	public String solution(String phone_number) {
		 String answer = "";

		 char[] test = phone_number.toCharArray();
		 
		 for (int i = test.length -5 ; i >= 0 ; i--) {
			 test[i] = '*';
		 }
		 
		 for (int j = 0; j< test.length; j++) {
			 answer += test[j];
		 }
		 return answer;
	}
}
