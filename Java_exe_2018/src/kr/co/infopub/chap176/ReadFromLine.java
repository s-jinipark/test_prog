package kr.co.infopub.chap176;
import java.io.*;
public class ReadFromLine {

	public static void main(String[] args) {
		try{
			InputStreamReader isr=new InputStreamReader(System.in);
			LineNumberReader br=new LineNumberReader(isr);
			StringBuffer sb=new StringBuffer();
			String s="";
			//ctrl+c 콘솔 :  이클립스 ctrl+Z
			System.out.println("끝내고 싶다면 ctrl+Z를 입력하시오");
			while((s=br.readLine())!=null){
			     sb.append( br.getLineNumber()+" "+s+"\n");
			}
			System.out.println(sb.toString());
			br.close();
			isr.close();
		}catch(Exception ee){
			System.out.println(ee.toString());
		}
	}
}
