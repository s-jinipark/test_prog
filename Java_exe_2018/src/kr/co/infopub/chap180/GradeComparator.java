package kr.co.infopub.chap180;
import java.util.Comparator;
public class GradeComparator implements Comparator<Student>{
	private static GradeComparator gc
			=new GradeComparator();
	private  GradeComparator(){} 
	public static GradeComparator getInstance(){
		return gc;
	}
	public int compare(Student o1, Student o2) {
		Grade g1=o1.getGrade();//己利
		Grade g2=o2.getGrade();
		return g1.compareTo(g2);//己利厚背
	}
}
