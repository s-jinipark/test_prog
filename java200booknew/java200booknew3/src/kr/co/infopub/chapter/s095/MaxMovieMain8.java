package kr.co.infopub.chapter.s095;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileReader;
import java.io.BufferedReader;
// json
public class MaxMovieMain8 {
	public static void main(String[] args) {
		 //2018-01-15 세줄 추가 /이번주 빌보드
		//RequestFromBillboardHot rfw=new RequestFromBillboardHot();
		//String a="https://www.billboard.com/charts/hot-100/";
		//String rs=rfw.getTimeDate(a);
		RequestFromMaxMovie rfw=new RequestFromMaxMovie();
		String a="http://www.maxmovie.com/Chart/Rank/List";
		String rs=rfw.getTimeDate(a);
		
		BufferedReader br=null;
		try {
			br=new BufferedReader(new FileReader("billboard\\m"+rs+".json"));
			StringBuffer sb=new StringBuffer();
			String msg="";
			while((msg=br.readLine())!=null){
				sb.append(msg);
			}
			JSONObject maxmovies=new JSONObject(sb.toString());
			JSONArray maxes=maxmovies.getJSONArray("maxmovie");
			for(int i=0; i< maxes.length() ;i++){
				System.out.println("------------------------------------");
				JSONObject max=maxes.getJSONObject(i);
				//String rank=bill.getString("rank");
    			//String song=bill.getString("song");
    			//String lastweek=bill.getString("lastweek");
    			//String imagesrc=bill.getString("imagesrc");
    			//String artist=bill.getString("artist");
    			String rank=max.getString("rank");
    			String mname=max.getString("mname");
    			String imgsrc=max.getString("imgsrc");

    			String sf=String.format("%s, %s, %s",rank, mname,imgsrc);

    			System.out.println(sf);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
	  
