package kr.co.infopub.chapter.s099;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javafx.scene.image.Image;

public class MovieImageFXListRequest {
 private Map<String, Image> images;
 public MovieImageFXListRequest() {
	images= Collections
	  .synchronizedMap(new LinkedHashMap<String, Image>(10, 1.53f, true));
 }
 public synchronized Image loadImage(String imagesrc) {
	Image mimage=null;
	if (images.containsKey(imagesrc)) {
		mimage= images.get(imagesrc);
	} else {
		if(imagesrc!=null && !imagesrc.contains("q_____")){
			try{
				mimage= new Image(imagesrc,50,55,true,true);
			}catch (Exception e) {
				mimage=null;;
			}
		}
	}
	return mimage==null ? new Image(getClass()
			              .getResourceAsStream("billboard.jpg")):mimage;
 } 
// public synchronized void getAllImages(ArrayList<SovereignFlag> bills){
//	images.clear(); 
//	List<SovereignFlag> newbills=Collections.synchronizedList(bills);
//	for(SovereignFlag bb: newbills){
//		new Thread(() ->{
//			if(!images.containsKey(bb.getFlag())){
//				images.put(bb.getFlag(),loadImage(bb.getFlag()));
//				System.out.println(bb.getFlag()+
//						            "\t\t\t---Map에  Image저장----->>>>>>");  
//			}
//		}).start();
//	}
// }
 
 public synchronized void getAllImages(ArrayList<MaxMovie> movies){
	images.clear(); 
	List<MaxMovie> newmovies=Collections.synchronizedList(movies);
	for(MaxMovie mm: newmovies){
		new Thread(() ->{
			if(!images.containsKey(mm.getMoviename())){
				images.put(mm.getMoviename(),loadImage("http:" + mm.getImagesrc() ));
				System.out.println(mm.getMoviename()+
						            "\t\t\t---Map에  Image저장----->>>>>>");  
			}
		}).start();
	}
 }
 
 public synchronized void printImage(){
	 System.out.println(images.size());
	 Iterator<String> imagekeys=images.keySet().iterator();
	 while(imagekeys.hasNext()){
		 String key=imagekeys.next();
		 //Image val=images.get(key);
		 System.out.printf("key=%s\n",key); // 키만 출력
	 }
 }
 public static void main(String[] args) {
	    MovieImageFXListRequest  request=new MovieImageFXListRequest();
	    RequestFromMaxMovie rfm=new RequestFromMaxMovie();
		//String a="https://ko.wikipedia.org/wiki/ISO_3166-1";
		//String msg="srcset=\"//upload.wikimedia.org/wikipedia";
		//rfw.getAllHtml(a);   
		//rfw.getSevereign(msg);
		String a="http://www.maxmovie.com/Chart/Rank/List";
		String rs=rfm.getTimeDate(a);
		//System.out.println("rs : " + rs);
		rfm.getMaxMovieData(a, rs);
		rfm.printtMaxMovie();
		
		//request.getAllImages(rfw.getFlags());  //image를 맵에 저장
		request.getAllImages(rfm.getMaxMovies());  //image를 맵에 저장
		request.printImage();
 }
}