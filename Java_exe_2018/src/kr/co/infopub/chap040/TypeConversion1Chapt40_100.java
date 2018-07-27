package kr.co.infopub.chap040;
public class TypeConversion1Chapt40_100 {

	public static void main(String[] args) {
		
		String strNum1="12345";
		int    tempNum1=2345;
		//String--> int
		//tempNum1 = strNum1; //-> X
		int intNum1=Integer.parseInt(strNum1);
		double douNum1=Double.parseDouble(strNum1);
		
		//int--> String
		String strNum2=Integer.toString(tempNum1);
		String strNum3=tempNum1+"";
		
		//String <--> char
		char [] charStr={'H','e','l','l','o'};
		String strChar=new String(charStr);
		char [] charStr2=strChar.toCharArray();
		char charChar=strChar.charAt(4);//'0'
		String sv=String.valueOf(charStr2);
		System.out.println(sv);
		
		//추가로
		String str1 = "hello world";
		char[] chr1 = str1.toCharArray();
		for (int i=0; i<chr1.length; i++) {
			System.out.println(">" + chr1[i]);
		}
		
		//String Concatenation
		String s="Get ";
		s+="java ";
		s+="this time.";
		String st="";
		st.concat("java ").concat("this time.");
		System.out.println("=받지않음=>"+st);//immutable
		st=st.concat("java ").concat("this time.");
		System.out.println("=받기<="+st);
		// String 은 문자열을 스트링 컨케트네이션 하거나 변형 시켜도
		// 원래의 문자열을 유지하는 이뮤터블한 특성이 있다
		// 변화된 문자열을 얻으려면 변환 후 저장해야...
		String stss="안녕하세요.";
		
		//byte<-->String
		byte[] byteStr=stss.getBytes();//S-->b
		for(int i=0;i<byteStr.length;i++){
			System.out.print(byteStr[i]+" ");
		}
		System.out.println();
		String strByte=new String(byteStr);//b-->s
		System.out.println(strByte);
			
	}
}
