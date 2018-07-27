package kr.co.infopub.chap177;
import java.io.*;
public class ReadFromKeyBoard {

	public static void main(String[] args) {
		try{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			String s="";
			//ctrl+c 콘솔 :  이클립스 ctrl+Z
		    System.out.println("끝내고 싶다면 ctrl+Z를 입력하시오");
			while((s=br.readLine())!=null){//ctrl+z
				 System.out.println(s);//출력
			}
			br.close();
			isr.close();
		}catch(Exception ee){
			System.out.println(ee.toString());
		}
	}
}
