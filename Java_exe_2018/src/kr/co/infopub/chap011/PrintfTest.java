package kr.co.infopub.chap011;
import java.util.*;
public class  PrintfTest
{
	public static void main(String[] args) 
	{
		int a=20;
		long b=30000L;
		float c=34.98F;
		double d=234.234;
		char e='k';
		Calendar today = Calendar.getInstance();
		System.out.println("1 : "+a+" "+b+" "+c+" "+d+" "+e);//불편하다.
		System.out.printf("2 : \\ %%  %d  %d  %f  %f %c %n",a,b,c,d,e);
		System.out.printf("3 : %1$d  %1$d  %2$c\n",a,97);//argument_index$conversion
		System.out.printf("4 : %1$h %1$o %1$x\n",a);
		System.out.printf("5 : %f %1$a %1$e %1$f %1$g\n",65.8734543537);
		System.out.printf("6 : Today %1$tm %1$te,%1$tY %n", today);
		System.out.printf("7 : Today %1$tm %1$td,%1$ty %n", today);
		System.out.printf("8 : Today %1$th %1$tI,%1$ta %n", today);
		System.out.printf("9 :123456789012345678901234567890\n");
		System.out.printf("10:%1$20f\n", 5678.3435453535);
		System.out.printf("11:%1$20.10f\n", 5678.3435453535);
		System.out.printf("12:%1$-20.10f\n", 5678.3435453535);
		/*
		printf(format, arguments) 의 형식
		%d 의 %는 출력형식, d는 컨버전이다
		%d 는 int 타입, %f 는 double 타입, %c 는 char 타입

		%형식과 아규먼트 순서나 개수가 일치하지 않는다면
		%1$ 첫번째 아규먼트, %2$ 두번째 아규먼트를 나타냄  
		
		m 은 month(01-12)
	 	%te 는 1-31 , %td는 01-31
	 	%tY 는 네자리(2017) , %ty는 두자리(17)
		*/
	}
}

