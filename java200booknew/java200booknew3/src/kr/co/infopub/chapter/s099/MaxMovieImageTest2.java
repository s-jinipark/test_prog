package kr.co.infopub.chapter.s099;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import kr.co.infopub.chapter.s099.MovieImageFXListRequest;
import kr.co.infopub.chapter.s099.RequestFromMaxMovie;
public class MaxMovieImageTest2 extends Application {

 public static void main(String[] args) {
    launch(args);
 }
 //ImageFXListRequest  request=new ImageFXListRequest();
 //RequestFromWikipedai rfw=new RequestFromWikipedai();

 MovieImageFXListRequest  request=new MovieImageFXListRequest();
 RequestFromMaxMovie rfm=new RequestFromMaxMovie();
 
 @Override
 public void start(Stage primaryStage) {
//	String a="https://ko.wikipedia.org/wiki/ISO_3166-1";
//	String msg="srcset=\"//upload.wikimedia.org/wikipedia";
//	rfw.getAllHtml(a);   
//	//rfw.printHtml();
//	rfw.getSevereign(msg);
//	//rfw.printFlags();
//	ArrayList<SovereignFlag> flags=rfw.getFlags();
//	request.getAllImages(flags);  //image List
	
	//----------
	String a="http://www.maxmovie.com/Chart/Rank/List";
	String rs=rfm.getTimeDate(a);
	//System.out.println("rs : " + rs);
	rfm.getMaxMovieData(a, rs);
	//rfm.printtMaxMovie();
	ArrayList<MaxMovie> movies=rfm.getMaxMovies();
	request.getAllImages(movies);  //image List
	
	int col=5; 
	VBox root = new VBox(col);     // HBox 5개
    int row=movies.size()/col;
    for(int i=0; i<row; i++){
    	HBox hbox = new HBox(10);          // 10줄
        hbox.setPadding(new Insets(5));
        hbox.setAlignment(Pos.CENTER);
    	for (int j = 0; j < col; j++) {      
    		MaxMovie m=movies.get(i*col+j);  
        	ImageView imageView = 
        	  new ImageView(request.loadImage("http:" + m.getImagesrc() ));
        	imageView.setFitWidth(50);
        	imageView.setFitHeight(50);
        	imageView.setOnMouseClicked(ee->{
        		System.out.println(m.getMoviename() );
        	});
        	hbox.getChildren().add(imageView);
		}
    	root.getChildren().add(hbox);        
    }
    primaryStage.setScene(new Scene(root, 65*col, 75*row));
    primaryStage.setTitle("Movie Images");
    primaryStage.show();
 }
}