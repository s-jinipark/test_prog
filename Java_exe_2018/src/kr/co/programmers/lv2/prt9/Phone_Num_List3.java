package kr.co.programmers.lv2.prt9;

public class Phone_Num_List3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone_Num_List3 pnl = new Phone_Num_List3();
		
		String[] s1 = { "119", "97674223", "1195524421" };
		boolean rtn1 = pnl.solution( s1 );
		System.out.println("[1] > " + rtn1);

		String[] s2 = { "123","456","789" };
		boolean rtn2 = pnl.solution( s2 );
		System.out.println("[2] > " + rtn2);
		
		String[] s3 = { "12", "123" , "1235", "567", "88"};
		boolean rtn3 = pnl.solution( s3 );
		System.out.println("[3] > " + rtn3);
	}

	public boolean solution(String[] phone_book) {
        boolean answer = true;
		// ** 재연습
        // 비교하여 한 번호가 다른 번호의 접두사인 경우 : false 
        
        for (int i=0; i<phone_book.length ; i++ ) {
        	for (int j=0 ; j<phone_book.length ; j++) {
        		if ( i != j
        				&& phone_book[j].startsWith(phone_book[i])) {
        			System.out.println(">" + phone_book[i] + " / " + phone_book[j]);
        			answer = false;
        			break;
        		}
        	}
        }
        
        return answer;
        
    }


}
