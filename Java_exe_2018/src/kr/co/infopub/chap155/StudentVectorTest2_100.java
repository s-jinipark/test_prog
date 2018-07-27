package kr.co.infopub.chap155;
import java.util.*;
public class StudentVectorTest2_100 {

	public static void main(String[] args) {
		Vector<Student> v=new Vector<>(2,5);    
		v.add(new Student("Jee",2,"Seoul"));//0
		v.add(new Student("Gong",1,"Seoul"));// ¼ø¼­¸¦ ¹Ù²ã º½
		v.add(new Student("Song",3,"Seoul"));//2
		v.add(new Student("Chang",4,"koyang"));//3
		print(v);
		Collections.shuffle(v);//¹«ÀÛÀ§·Î ¼¯´Â´Ù.
		print(v);
		//[2]
		//Collections.sort(v); //[2] -> ERR

	}
	public static void print(List<Student> list){
		System.out.println("-----------------------------");
		System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			Student stu=list.get(i);//index´Â 0ºÎÅÍ
			System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getAddr());
		}
	}
}
