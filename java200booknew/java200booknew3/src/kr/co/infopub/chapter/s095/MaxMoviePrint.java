package kr.co.infopub.chapter.s095;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;
public class MaxMoviePrint {
/*	public static void printToHTML(List<String> slist, String fname){
		try (PrintWriter pw=new PrintWriter(new FileWriter(fname,false),true)){
				for(String sts : slist){
					pw.println(sts);
				}
		} catch (IOException e) {
		}
	}*/
	public static void printToCSV(List<MaxMovie> mvlist, String fname) {
		//try (PrintWriter pw=new PrintWriter(new FileWriter(fname,false),true)){
		// 한글 깨짐으로 인해 수정
		try ( BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fname), "MS949")) ) {
		    
			for(MaxMovie mm : mvlist){
				//pw.println(mm);
				bw.write(mm.toString());
				bw.newLine();
			}
		} catch (IOException e) {
		}
	}
	public static void printToJSON(List<MaxMovie> mvlist, String fname){
		//try (PrintWriter pw=new PrintWriter(new FileWriter(fname,false),true)){
		try ( BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fname), "MS949")) ) {
				
//			pw.println("{\"billboard\": [");
//			for(int i=0; i<bblist.size()-1 ;i++){
//				Billbaord bb=bblist.get(i);
//				pw.println(pair(bb)+",");
//			}
//			pw.println(pair(bblist.get(bblist.size()-1 )));
//			pw.println("]}");
			bw.write("{\"billboard\": [");
			bw.newLine();
			for(int i=0; i<mvlist.size()-1 ;i++){
				MaxMovie mm=mvlist.get(i);
				bw.write(pair(mm)+",");
				bw.newLine();
			}
			bw.write(pair(mvlist.get(mvlist.size()-1 )));
			bw.newLine();
			bw.write("]}");	
			bw.newLine();
		} catch (IOException e) {
		}
	}
	/*
	public static void printToObject(List<Billbaord> bblist, String fname) {
		try (PrintWriter pw=new PrintWriter(new FileWriter(fname,false),true)){
			for(Billbaord bb : bblist){
					pw.println(String.format("Billbaord b%d =new Billbaord(%d,\"%s\","
							+ "%d,\"%s\",\"%s\");", 
					bb.getRank(), bb.getRank(), bb.getSong(),
					bb.getLastweek(),bb.getImagesrc(),bb.getArtist()));
				}
		} catch (IOException e) {
		}
	}
	public static void printToXML(List<Billbaord> bblist, String fname){
		try (PrintWriter pw=new PrintWriter(new FileWriter(fname,false),true)){
			pw.println("<?xml version='1.0' encoding='utf-8'?>");
			pw.println("<billboards>");
			for(Billbaord bb : bblist){
					pw.println(pairxs(bb));
			}
			pw.println("</billboards>");
		} catch (IOException e) {
		}
	}
	private static String rp(String msg){
		String st=msg;
		st=st.replaceAll("&", "&amp;");
		st=st.replaceAll(">", "&gt;");
		st=st.replaceAll("<", "&lt;");
		st=st.replaceAll("\'", "&apos;");
		st=st.replaceAll("\"", "&quot;");
		return st;
	}
	// <key>value</key>
	private static String pairx(String key, String value){
		String ss=String.format("<%s>%s</%s>", key,value,key);
		return ss;
	}
	private static String pairxs(Billbaord bb){
		String rank=pairx("rank",rp(bb.getRank()+""));
		String song=pairx("song",rp(bb.getSong()+""));
		String lastweek=pairx("lastweek",rp(bb.getLastweek()+""));
		String imagesrc=pairx("imagesrc",rp(bb.getImagesrc()+""));
		String artist=pairx("artist",rp(bb.getArtist()+""));
		return String.format("<billboard>\n%s %s %s %s %s\n</billboard>",
				rank, song,lastweek,imagesrc,artist);
	}
	*/
	private static String pair(MaxMovie mm){
		String rank=pair("rank",mm.getRank()+"");
		String mname=pair("mname",mm.getMoviename()+"");
		String imgsrc=pair("imgsrc",mm.getImagesrc()+"");

		
		return String.format("{%s,%s,%s}",rank, mname,imgsrc);
	}

	// "key":"value"
	private static String pair(String key, String value){
		String ss=String.format("\"%s\":\"%s\"", key,value);
		return ss;
	}
	// {"key":"value"}
	private static String pairs(String key, String value){
		String ss=String.format("{\"%s\":\"%s\"}", key,value);
		return ss;
	}
}
