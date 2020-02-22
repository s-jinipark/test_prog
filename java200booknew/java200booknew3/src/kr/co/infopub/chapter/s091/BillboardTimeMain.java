package kr.co.infopub.chapter.s091;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
// 속도도 느리고 개편을 하면 또 소스가 변경될 수 있다. 
public class BillboardTimeMain {
 public static void main(String[] args) {
	 String newUrls="https://www.billboard.com/charts/hot-100/";
	 Document doc=null;
	 String fnames="billboard/";
	 String ss="";
	 String tt="";
     try {
    	 doc = Jsoup.connect(newUrls).get(); //GET
    	 //button.chart-detail-header__date-selector-button 포함
    	 //첫번째 엘리먼트
    	 Element bDay = doc.select("button.chart-detail-header__date-selector-button").first();
    	 ss=bDay.text();      // September 22, 2018
     } catch (Exception e) {
		System.out.println(e);
	 }
    System.out.println("이번 빌보드 차트 날짜 : "+ss.trim());
 }

}
