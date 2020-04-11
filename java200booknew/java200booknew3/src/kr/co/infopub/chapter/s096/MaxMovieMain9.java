package kr.co.infopub.chapter.s096;
import org.jdom2.input.SAXBuilder;

import kr.co.infopub.chapter.s095.RequestFromMaxMovie;

import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
// jdom
public class MaxMovieMain9 {
	public static void main(String[] args) {
		 //2018-01-15 세줄 추가 /이번주 빌보드
//		RequestFromBillboardHot rfw=new RequestFromBillboardHot();
//		String a="https://www.billboard.com/charts/hot-100/";
//		String rs=rfw.getTimeDate(a);
		RequestFromMaxMovie rfw=new RequestFromMaxMovie();
		String a="http://www.maxmovie.com/Chart/Rank/List";
		String rs=rfw.getTimeDate(a);
		
		SAXBuilder builder = new SAXBuilder();
        Document document = null;
    	try {
    		//document= builder.build("billboard\\m"+rs+".xml");
    		document= builder.build("billboard\\m_test.xml");  // XML 은 -> 파일명에 빈칸 있으면 오류
    		 Element root = document.getRootElement();
    		 List<Element> movies = root.getChildren("movie");
    		 for (Element ele: movies) {
    			String rank=ele.getChildText("rank");
    			String mname=ele.getChildText("mname");
    			String imgsrc=ele.getChildText("imgsrc");

    			String sf=String.format("%s, %s, %s",rank, mname,imgsrc);
    			System.out.println(sf);
			 }
    	}catch (Exception e) {
			System.out.println( e);
		}
	}
}
	  
