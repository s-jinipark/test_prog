package kr.co.programmers.lv1.prt6;

public class Sort_Strings_As_You_Like {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort_Strings_As_You_Like ssayl = new Sort_Strings_As_You_Like();
		
		String[] strings1 = {"sun", "bed", "car"};
		int n1 = 1;
		String[] rtn1 = ssayl.solution(strings1, n1 );
		System.out.println("[1] > " + rtn1);
		for (int i=0 ; i<rtn1.length; i++) {
			System.out.println(" > " + rtn1[i]);
		}
		
		String[] strings2 = {"abce", "abcd", "cdx"};
		int n2 = 2;
		String[] rtn2 = ssayl.solution(strings2, n2 );
		System.out.println("[2] > " + rtn2);
		for (int i=0 ; i<rtn2.length; i++) {
			System.out.println(" > " + rtn2[i]);
		}

		String[] strings3 = {"abzcd","cdzab","abzfg","abzaa","abzbb","bbzaa"};
		int n3 = 2;
		String[] rtn3 = ssayl.solution(strings3, n3 );
		System.out.println("[3] > " + rtn3);
		for (int i=0 ; i<rtn3.length; i++) {
			System.out.println(" > " + rtn3[i]);
		}
		
	}

	public String[] solution(String[] strings, int n) {
		char test1, test2;
	    String tmp = "";
	    
	    for (int i=0; i<strings.length-1; i++) {
	    	test1 = strings[i].charAt(n);
	    	for(int j=i+1; j<strings.length ; j++) {
	    		test2 = strings[j].charAt(n);
	    		System.out.println("=>"+ test1 + " / " + test2 );
	    		if (test1 > test2) {
	    			tmp = strings[j];
	    			strings[j] =strings[i];
	    			strings[i] = tmp;
	    		} else if (test1 == test2) {
	    			//System.out.println("=>"+ test1 + " / " + test2 );
	    			System.out.println("=>>"+ strings[i].compareTo(strings[j]));
	    			if (strings[i].compareTo(strings[j]) > 0) {
		    			tmp = strings[j];
		    			strings[j] =strings[i];
		    			strings[i] = tmp;
	    			}
	    		}
	    	}
	    }
	    String[] answer = strings;
	    return answer;
	}
}
