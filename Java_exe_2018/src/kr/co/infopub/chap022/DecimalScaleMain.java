package kr.co.infopub.chap022;
public class DecimalScaleMain {

	public static void main(String[] args) {
		int deciNUm=123;//Integer.MAX_VALUE;
		//System.out.println(Integer.toBinaryString(deciNUm));
		System.out.print("1: ");
		for(int i=0;i<32;i++){	// 32보다 작은 조건
			System.out.print((int)(deciNUm/Math.pow(2,31-i)));
			deciNUm=(int)(deciNUm%Math.pow(2,31-i));
		}
		// int 는 최대값 2의 31승이므로 32 미만
		// Math.pow(2,31-i) 는 2의 31승 부터 2의 0승 이 된다
		// 123 은 64+32+16+8+2+1 이다
	    // 0은 '없다' 1은 '있다' 를 나타낸다
		
		System.out.println(); 
		System.out.println("2: "+toBinal(123));//2진수  
		System.out.println("3: "+0173);//8진수  
		System.out.println("4: "+toOctal(123));//8진수
		System.out.println("5: "+0x7b);//0x7B 16진수

	}
	public static String toBinal(int num){
		int temp=num;
		String sToOct="";//String 초기화
		for(int i=0;i<32;i++){
			sToOct=(temp%2)+sToOct;
			temp=temp/2;
		}
		return sToOct;
	}
	public static String toOctal(int num){
		int temp=num;
		String sToOct="";//String 초기화
		for(int i=0;i<32/3;i++){
			sToOct=(temp%8)+sToOct;
			temp=temp/8;
		}
		return sToOct;
	}
}