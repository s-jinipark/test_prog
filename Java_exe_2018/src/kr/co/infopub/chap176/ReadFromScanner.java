package kr.co.infopub.chap176;
import java.io.*;
import java.util.*;
public class ReadFromScanner {//JAVA7
	public static void main(String[] args) {
		try{
			Scanner isr=new Scanner(System.in);
			String s="";
			//while(!(s=isr.nextLine()).equals("@esc")){//@esc
			while((s=isr.nextLine())!=null){
				 System.out.println(s);
			}
			isr.close();
		}catch(Exception ee){
			System.out.println(ee.toString());
		}
	}
}
