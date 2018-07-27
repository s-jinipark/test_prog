package kr.co.infopub.chap040;

public class TypeConversion2 {
	public static void main(String[] args) {
		
		String stss="ㄱㄴㄷㄹ가나다라";
		//byte<-->String
		byte[] byteStr=stss.getBytes();//S-->b
		
		for(int i=0;i<byteStr.length;i++){
			int num=byteStr[i];
			System.out.println(Integer.toBinaryString(num));
		}
		System.out.println();
		for(int i=0;i<stss.length();i++){
			int num=stss.charAt(i);
			System.out.print(num+":");
			System.out.print(Integer.toBinaryString(num)+" :");
			System.out.println((char)num);
		}
		System.out.println();
	}
}
