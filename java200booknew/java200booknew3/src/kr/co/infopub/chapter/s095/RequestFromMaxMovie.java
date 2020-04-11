package kr.co.infopub.chapter.s095;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//2018-09-05 modified 3rd
public class RequestFromMaxMovie {
	boolean isConnection=false;
	
	ArrayList<MaxMovie> maxmovies =new ArrayList<MaxMovie>();

	public ArrayList<MaxMovie> getMaxMovies() {
		return maxmovies;
	}
	public RequestFromMaxMovie(){
		maxmovies.clear();
	}
	
	//public synchronized void getBillboardData(String newUrls){
	public synchronized void getMaxMovieData(String newUrls, String date){
		 maxmovies.clear();
		 Document doc=null;
		 String fnames="billboard/";
		 String ss="";
		 
	     try {
	    	 doc = Jsoup.connect(newUrls).get(); //GET

	    	 Elements links = doc.select("p.tmpo");
	    	 Elements links2 = doc.select("p.mtx1.pl7");
	    	 Elements links3 = doc.select("p.mtx2.pl7"); // 공백에 걍 . 찍는다
	    	 
	    	 //System.out.println("links : " + links3.size());
//	         for (Element link : links) {
//	        	 Element img=link.selectFirst("p.tmpo img");
//	        	 String mname = img.attr("alt");
//	        	 String imgsrc = img.attr("src");
//	             //System.out.println("mname---"+mname);
//	             //System.out.println("imgsrc---"+imgsrc);
//	             Element em=link.selectFirst("p.tmpo em");
//	             String srank = em.text();
//	             //System.out.println("rank---"+srank);
//	             
//	             MaxMovie movie1=new MaxMovie(
//	 	 				toInt(srank), replace(mname),
//	 	 				replace(imgsrc) );
//	             maxmovies.add(movie1);	 	 		     
//	         }
	         
	    	 // [2] 여러 links 조회
	    	 for (int i=0; i<links.size(); i++) {
	    		 Element img=links.get(i).selectFirst("p.tmpo img");
	    		 String mname = img.attr("alt");
	    		 String imgsrc = img.attr("src");
	    		 Element em=links.get(i).selectFirst("p.tmpo em");
	    		 //Element mname=links2.get(i).selectFirst("a");
	    		 //Element mname=links2.get(i).getElementsByTag("a").first();
	    		 //-> 15사냥의 시간 : 텍스트가 2개 붙어서 나옴 <a> 와 그 안의 <em> 의 text
	    		 
	    		 //System.out.println("mname---"+mname);
	    		 Element year=links2.get(i).selectFirst("em");
	    		 //System.out.println("year---"+year.text());
	    		 //System.out.println("em---"+em.text()); 
	    		 //Element mname=links3.get(i).selectFirst("em");
	    		 //System.out.println("mname---"+mname.text());
	    		 
	             MaxMovie movie1=new MaxMovie(
	 	 				toInt(em.text()), replace(mname),
	 	 				replace(imgsrc) );
	             maxmovies.add(movie1);	 
	 	 		        
	    	 }

	     } catch (IOException e) {
			System.out.println(e);
		 }
	}
	public String replace(String msg){
		String ss=msg;
		ss=ss.replaceAll("&#039;", "'");
		ss=ss.replaceAll("&amp;", "&");
		ss=ss.replaceAll("&quot;", "\"");
		return ss.trim();
	}

	private String __toStr(String lastweek){
		return lastweek.contains("-")?101+"":lastweek;
	}
	private int toInt(String msg){
		return Integer.parseInt(msg==null ?"-1":msg.trim());
	}
	public String toArtis(String msg){
		return msg.replaceAll("-", " ");
	}

	public void printtMaxMovie(){
		for (MaxMovie dto : maxmovies) {
			System.out.println(dto);
		}
	}
    //<button class='chart-detail-header__date-selector-button'>
	//===> button.chart-detail-header__date-selector-button
	public String getTimeDate(String aurl) {
		Document doc;
		String sdate=null;
		String tmp=null;
	    try {
	        doc = Jsoup.connect(aurl).get();
	    	 Element bDay = doc.select("div.rankGuide").last();
	    	 sdate=bDay.text(); 
	    	 // 문자열 처리
	    	 if (sdate.contains("집계기간 : ")) {
	    		 tmp = sdate.substring(sdate.indexOf("집계기간 : ") );
	    		 tmp = tmp.substring(6, tmp.indexOf(" | "));
	    	 }
	        
	    } catch (IOException e) {
	        System.out.println(e);
	    }
		//return sdate!=null?RestDay.toDay(sdate): RestDay.saturday();
	    return tmp;
	}
	public static void main(String[] args) {
		RequestFromMaxMovie rfw=new RequestFromMaxMovie();
		//String a="https://www.billboard.com/charts/hot-100/";
		String a="http://www.maxmovie.com/Chart/Rank/List";
		String rs=rfw.getTimeDate(a);
		//System.out.println("rs : " + rs);
		rfw.getMaxMovieData(a, rs);
        rfw.printtMaxMovie();
	}
}
