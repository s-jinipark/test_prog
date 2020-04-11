package kr.co.infopub.chapter.s095;

import kr.co.infopub.chapter.s095.MaxMoviePrint;
import kr.co.infopub.chapter.s095.RequestFromMaxMovie;

public class MaxMovieMain6 {
	public static void main(String[] args) {
		//RequestFromBillboardHot rfw=new RequestFromBillboardHot();
		//String a="https://www.billboard.com/charts/hot-100/";
		//String rs=rfw.getTimeDate(a);
		RequestFromMaxMovie rfw=new RequestFromMaxMovie();
		String a="http://www.maxmovie.com/Chart/Rank/List";
		String rs=rfw.getTimeDate(a);		
		
		//rfw.getBillboardData(a+rs);
		//rfw.printBillboard();

		rfw.getMaxMovieData(a, rs);
        rfw.printtMaxMovie();
        
		//BillboardPrint.printToCSV(rfw.getBillboards(), "billboard\\"+rs+".csv");
		//BillboardPrint.printToJSON(rfw.getBillboards(), "billboard\\"+rs+".json");
		MaxMoviePrint.printToJSON(rfw.getMaxMovies(), "billboard\\m"+rs+".json");
		//BillboardPrint.printToXML(rfw.getBillboards(), "billboard\\"+rs+".xml");
	}
}
