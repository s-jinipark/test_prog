package kr.co.infopub.chapter.s091;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
// 속도도 느리고 개편을 하면 또 소스가 변경될 수 있다. 
public class MovieTimeMain {
 public static void main(String[] args) {
	 //String newUrls="https://www.billboard.com/charts/hot-100/";
	 String newUrls="http://www.maxmovie.com/Chart/Rank/List";
	 Document doc=null;
	 String fnames="billboard/";
	 String ss="";
	 String tt="";
	 
	 String tmp = "";
	 
     try {
    	 doc = Jsoup.connect(newUrls).get(); //GET
    	 //button.chart-detail-header__date-selector-button 포함
    	 //첫번째 엘리먼트
    	 Element bDay = doc.select("div.rankGuide").last();
    	 ss=bDay.text();      // September 22, 2018
    	 
    	 // 문자열 처리
    	 if (ss.contains("집계기간 : ")) {

    		 tmp = ss.substring(ss.indexOf("집계기간 : ") );
    		 tmp = tmp.substring(6, tmp.indexOf(" | "));
    	 }
    	 
     } catch (Exception e) {
		System.out.println(e);
	 }
    System.out.println("이번  차트 날짜 : "+ss.trim());
    System.out.println("이번  차트 날짜 : "+tmp.trim());
 }

}

/*
결과 

이번  차트 날짜 : 예매순위 : 영화진흥위원회의 실시간 예매데이터를 1시간 간격으로 수집한 순위 집계기간 : 2020년 02월 22일 | 1시간 단위 업데이트
이번  차트 날짜 : 2020년 02월 22일

*/