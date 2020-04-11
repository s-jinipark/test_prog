package kr.co.infopub.chapter.s098;
import java.io.Serializable;
public class MaxMovie implements Serializable {
	private int rank;         // 순위
	private String moviename;      // 영화명
	private String imagesrc;  // 사진

	
	public MaxMovie() {
	}
	
	public MaxMovie(int rank, String moviename, String imagesrc) {
		super();
		this.rank = rank;
		this.moviename = moviename;
		this.imagesrc = imagesrc;
	}

	@Override
	public String toString() {
		return "[rank=" + rank + ", moviename=" + moviename +  ", imagesrc=" + imagesrc 
				 +"]";
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	
	public String getImagesrc() {
		return imagesrc;
	}
	public void setImagesrc(String imagesrc) {
		this.imagesrc = imagesrc;
	}
	
}
