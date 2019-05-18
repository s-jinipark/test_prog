package kr.co.jungsuk.ex.e09;

public class P06_1 {
	// [9-6] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
	/*
		메서드명 : fillZero
		기 능 : 주어진 문자열(숫자)로 주어진 길이의 문자열로 만들고, 왼쪽 빈 공간은 '0'으로
			채운다.
			만일 주어진 문자열이 null이거나 문자열의 길이가 length의 값과 같으면 그대로
			반환한다.
			만일 주어진 length의 값이 0보다 같거나 작은 값이면, 빈 문자열("")을 반환한다.
		반환타입 : String
		매개변수 : String src - 변환할 문자열
			int length - 변환한 문자열의 길이
	*/
	public static String fillZero(String src, int length) {
		/* (1) fillZero메서드를 작성하시오.
			1. src가 널이거나 src.length()가 length와 같으면 src를 그대로 반환한다.
			2. length의 값이 0보다 같거나 작으면 빈 문자열("")을 반환한다.
			3. src의 길이가 length의 값보다 크면 src를 length만큼 잘라서 반환한다.
			4. 길이가 length인 char배열을 생성한다.
			5. 4에서 생성한 char배열을 '0'으로 채운다.
			6. src에서 문자배열을 뽑아내서 4에서 생성한 배열에 복사한다.
			7. 4에서 생성한 배열로 String을 생성해서 반환한다.
		*/
		String rtn_val = "";
		if ( src.equals("") || src.length() == length) {
			//System.out.println( "(1)" );
			rtn_val = src;
		} else if ( length  <= 0) {
			//System.out.println( "(2)" );
			rtn_val = "";
		} else if (src.length()  > length) {
			//System.out.println( "(3)" );
			rtn_val = src.substring(0, length); // **
			//System.out.println(">" + rtn_val);

		} else {
			//System.out.println( "(4)" );
			char[] test = new char[length];
			for (int i =0 ; i<test.length; i++) {
				test[i] = '0';
			}
			
			// [2] char[] 가 src 보다 큰 상황
			//     뒤에서 부터 채움
			//System.out.println(src);
			int diff = length - src.length();
			for (int j = src.length()-1; j>=0 ; j--) {
				//System.out.println(j + "/" + src.charAt(j));
				test[j+diff]= src.charAt(j);
			}
			
			for (int i =0 ; i<test.length; i++) {
				rtn_val += test[i];
			}
		}
		
		return rtn_val;
	}
	public static void main(String[] args) {
		String src = "12345";
		//System.out.println(fillZero("",5));
		System.out.println(fillZero(src,10));
		System.out.println(fillZero(src,-1));
		System.out.println(fillZero(src,3));
	}

}