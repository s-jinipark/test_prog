package kr.co.infopub.chapter.s094;

public class MaxMovieMain6 {
	public static void main(String[] args) {
		RequestFromMaxMovie rfw=new RequestFromMaxMovie();
		//String a="https://www.billboard.com/charts/hot-100/";
		String a="http://www.maxmovie.com/Chart/Rank/List";
		String rs=rfw.getTimeDate(a);
		//rfw.getBillboardData(a+rs);
		//rfw.printBillboard();
		
		rfw.getMaxMovieData(a, rs);
        rfw.printtMaxMovie();
        
		//BillboardPrint.printToCSV(rfw.getBillboards(), "billboard\\"+rs+".csv");
        MaxMoviePrint.printToCSV(rfw.getMaxMovies(), "billboard\\m"+rs+".csv");
		//BillboardPrint.printToJSON(rfw.getBillboards(), "billboard\\"+rs+".json");
		//BillboardPrint.printToXML(rfw.getBillboards(), "billboard\\"+rs+".xml");
	}
}
