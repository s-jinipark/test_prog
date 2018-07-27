package kr.co.infopub.chap155;
import java.util.*;
public class StudentShuffleTest {
	public static void main(String[] args) {
		Vector<Student> v=new Vector<>(2,5);    
		v.add(new Student("Jee",1,"Seoul"));//0
		v.add(new Student("Gong",2,"Seoul"));//1
		v.add(new Student("Song",3,"Seoul"));//2
		System.out.println("cap : " + v.capacity());
		print(v);
		Collections.shuffle(v);//무작위로 섞는다.
		print(v);
	}
	public static void print(List<Student> list){
		System.out.println("-----------"+list.size());
		for(int i=0;i<list.size();i++){
			Student stu=list.get(i);//index는 0부터
			System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getAddr());
		}
	}
	/*
	Vector 클래스의 생성자 		설명

 	Vector()					10개의 데이터를 저장할 수 있는 길이의 객체를 생성한다. 
								저장 공간이 부족한 경우 10개씩 증가한다. 

 	Vector(int size) 			size 개의 데이터를 저장할 수 있는 길이의 객체를 생성한다. 
								저장공간이 부족할 경우 size개씩 증가한다. 

 	Vector(int size, int incr)	size 개의 데이터를 저장할 수 있는 길이의 객체를 생성한다. 
								저장 공간이 부족한 경우 incr 개씩 증가한다.
	*/
}
