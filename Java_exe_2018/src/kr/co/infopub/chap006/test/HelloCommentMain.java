package kr.co.infopub.chap006.test;
//패키지가 다르면 import
import kr.co.infopub.chap006.HelloComment;

public class HelloCommentMain 
{
	public static void main(String[] args) 
	{
		HelloComment hc=new HelloComment();
		//%n enter(next line)
		System.out.printf("12345691은 솟수일까? %b%n"
		,hc.isPri(12345691));//59로 나누어짐
	}
}
