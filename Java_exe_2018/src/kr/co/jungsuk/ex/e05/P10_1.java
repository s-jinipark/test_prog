package kr.co.jungsuk.ex.e05;

public class P10_1 {
	// [5-10] 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
	// (1)에 알맞은 코드를 넣어서 완성하시오.
	/*
	a b c d e f g h i j k l m n o p q r s t
	` ~ ! @ # $ % ^ & * ( ) - _ + = | [ ] {
	
	u v w x y z
	} ; : , . /
	
	0 1 2 3 4 5 6 7 8 9
	q w e r t y u i o p
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
						// 0   1   2   3   4   5   6   7   8   9
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		String src = "abcz123";
		String result = "";
		
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for(int i=0; i < src.length();i++) {
			char ch = src.charAt(i);
			/*
			(1) 알맞은 코드를 넣어 완성하시오.
			*/ 
			// [2] 알파벳이면 특수문자로, 숫자면 알파벳으로 변경
			// 알파벳은 소문자로 들어온다 가정 (a~z : 97~122)
			System.out.println(">" + (int)ch + "/" );
			int tmp = (int)ch;
			if ( tmp >= 97 && tmp <= 122 ) {
				result += abcCode[tmp-97];
			} else {
				tmp = Integer.valueOf(ch + "");
				result += numCode[tmp];
			}
		}
		System.out.println("src:"+src);
		System.out.println("result:"+result);
	}

}
