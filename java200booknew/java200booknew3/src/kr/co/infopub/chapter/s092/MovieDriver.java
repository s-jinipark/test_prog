package kr.co.infopub.chapter.s092;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MovieDriver {
	public String saveMoviechart(String today, String newUrls){
		 Document doc=null;
		 String fnames="billboard/";
		 String ss="";
	     try {
	    	 doc = Jsoup.connect(newUrls).get(); //GET
	    	 
	    	 Element first = doc.select("div.rankGuide").first();
	    	 ss+=first.outerHtml()+"\n";
	    	 
	    	 //System.out.println("1--------------");
	    	 Elements links = doc.select("p.tmpo");
	         for (Element link : links) {
	        	 ss+=link.outerHtml()+"\n";
	             //System.out.println("---------------------------------------");
	         }

		     //billboard/2018-09-14.html 저장
		     fnames=fnames+today+".html";

			 PrintWriter pw=new PrintWriter(
						    new FileWriter(fnames));
		     pw.print(ss);
		     pw.close();
	     } catch (IOException e) {
			System.out.println(e);
		 }
	     return fnames;
	}
	public String saveMoviechart(String newUrls){
	     //billboard/2018-09-14.txt 저장
	     SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	     String today=sdf.format(new Date());
	     return saveMoviechart(today,newUrls);
	}
}
