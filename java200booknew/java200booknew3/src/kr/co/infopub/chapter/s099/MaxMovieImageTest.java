package kr.co.infopub.chapter.s099;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
// image read test 
public class MaxMovieImageTest extends Application {
    // 이미지 하나 보이기
    public static void main(String[] args) {
        launch(args);
    }
     
    @Override
    public void start(Stage primaryStage) {

        Group root = new Group();
        //String imageSource=  "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Flag_of_France.svg/99px-Flag_of_France.svg.png";       
        //String imageSource = "http://www.billboard.com/images/pref_images/q63694v2qz7.jpg";
        
        //이미지가 바뀔 수 있음
        String imageSource= "http://images.maxmovie.com/thumbf/movie_info/image/2020/01/M000115954/poster/Max2020EMMA1_0.jpg";
        
        //인터넷
        ImageView imageView = new ImageView(new Image(imageSource));
        //디렉토리 내 파일
        //ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("billboard.jpg")));
        Group myGroup = new Group();
        myGroup.getChildren().add(imageView);
        root.getChildren().add(myGroup);
   
        primaryStage.setScene(new Scene(root, 150, 150));
        //primaryStage.setTitle("Billboard Image");
        primaryStage.setTitle("MaxMovie Image");
        primaryStage.show();
    }
    
}

   