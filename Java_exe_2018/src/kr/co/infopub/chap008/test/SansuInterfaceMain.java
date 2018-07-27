package kr.co.infopub.chap008.test;

import kr.co.infopub.chap008.SansuInterface;
//interface 상수
public class SansuInterfaceMain 
         implements SansuInterface {
	public static void main(String[] args) {
		int man=MAN;
		switch(man){
			case 1: System.out.println("남자");break;
			case 2: System.out.println("여자");break;
		}
	}
}
