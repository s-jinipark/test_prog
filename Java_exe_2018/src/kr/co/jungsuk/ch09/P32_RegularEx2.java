package kr.co.jungsuk.ch09;
import java.util.regex.*;	// Pattern과 Matcher가 속한 패키지

class P32_RegularEx2 {
	public static void main(String[] args) {
		String[] data = {"bat", "baby", "bonus", "c", "cA",
				        "ca", "co", "c.", "c0", "c#",
					"car","combat","count", "date", "disc"
						};		
		String[] pattern = {".*","c[a-z]*","c[a-z]", "c[a-zA-Z]",
                                          "c[a-zA-Z0-9]","c.","c.*","c\\.","c\\w",
                                          "c\\d","c.*t", "[b|c].*", ".*a.*", ".*a.+",
                                          "[b|c].{2}"
                                         };

		for(int x=0; x < pattern.length; x++) {
			Pattern p = Pattern.compile(pattern[x]);
			System.out.print("Pattern : " + pattern[x] + "  결과: ");
			for(int i=0; i < data.length; i++) {
				Matcher m = p.matcher(data[i]);
				if(m.matches())
					System.out.print(data[i] + ",");
			}
			System.out.println();
		}
	} // public static void main(String[] args) 
}


/*
 	정규식 패턴 		설명		
	.*  		모든 문자열 			결과: bat,baby,bonus,c,cA,ca,co,c.,c0,c#,car,combat,count,date,disc,
	c[a-z]*  	c로 시작하는 영단어	결과: c,ca,co,car,combat,count,
	c[a-z]  	c로 시작하는 두자리 영단어
								결과: ca,co,
	c[a-zA-Z]  	c로 시작하는 두자리 영단어(대소문자 구분 안함)
								결과: cA,ca,co,
	c[a-zA-Z0-9]	c로 시작하고 숫자와 영어로 조합된  두글자
								결과: cA,ca,co,c0,
	c.  		c로 시작하는 두자리 문자열	결과: cA,ca,co,c.,c0,c#,
	c.*  		c로 시작하는 모든 문자열
								결과: c,cA,ca,co,c.,c0,c#,car,combat,count,
	c\.  		c. 와 일치하는 문자열  '.'은 패턴 작성에 사용되는 문자이므로 
	  			escape 문자인 \ 를 사용		
	  							결과: c.,
	c\w  		c[a-zA-Z] 와 동일	결과: cA,ca,co,c0,
	c\d  		c[0-9] 와 동일 		결과: c0,
	c.*t  		c 로 시작하고 t 로 끝나는 모든 문자열
								결과: combat,count,
	[b|c].*  	b 또는 c 로 시작하는 문자열
								결과: bat,baby,bonus,c,cA,ca,co,c.,c0,c#,car,combat,count,
	.*a.*  		a를 포함하는 모든 문자열
								결과: bat,baby,ca,car,combat,date,
	.*a.+  		a를 포함하는 모든 문자열
				+ : 1 또는 그 이상의 문자 (반드시 하나 이상의 문자 있어야..)
								결과: bat,baby,car,combat,date,
	[b|c].{2}  	b 또는 c 로 시작하는 세자리 문자열
								결과: bat,car,

*/