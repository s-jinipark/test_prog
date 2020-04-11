package kr.co.infopub.chapter.s089;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class BillboardMain_my {
 public static void main(String[] args) {
	 String newUrls="http://www.maxmovie.com/Chart/Rank/List";
	 //BillboardDriver billdriver=new BillboardDriver();
	 //String fnames=billdriver.saveBillboard100(newUrls);
     //today billboard/2018-09-14.txt 읽기
	 URL url = null;
     try {
    	url = new URL(newUrls);
    	
    	 // 주소지에 빨대 꽂기 
 		BufferedReader reader = new BufferedReader(  
 				new InputStreamReader(url.openStream(), "utf-8"), 8 );
 		String line = null;
 		while ((line = reader.readLine()) != null){  // 한줄씩 읽어서 
 			if(!line.trim().equals("")){             // 공백이 아니면 출력한다.
 				System.out.println(line.trim());
 			}
 		}
 	} catch (Exception e) {
 		System.out.println(" Parsing error !!! ");
 	} 
 }
}
