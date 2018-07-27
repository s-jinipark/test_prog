package kr.co.infopub.chap179.test;
import java.io.IOException;

import kr.co.infopub.chap179.WritingData;
import kr.co.infopub.chap179.WritingDatasUsing;


public class WritingDatasUsingMain {
	public static void main(String[] args) {
		WritingDatasUsing wdu=new WritingDatasUsing();
		WritingData wd=new WritingData();
		wd.setName("È«±æ¼ø");
		wd.setAge(20);
		wd.setHeight(165);
		wd.setMan(false);
		
		WritingData wd2=null;
		try {
			wdu.writingData("abc.txt",true, wd);
			wd2=wdu.readingData("abc.txt");
			System.out.println(wd2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
