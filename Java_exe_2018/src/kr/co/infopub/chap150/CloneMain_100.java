package kr.co.infopub.chap150;
public class CloneMain_100 {

	public static void main(String[] args) {
		Student_100 st=new Student_100("새새",6,"서울 동작구 방앗간리");
		System.out.println("1 st  "+st);
		Student_100 st1=st;//shallow copy
		st1.setAddr("경기 고양시");//
		st1.setId(3);//
		System.out.println("----------");
		System.out.println("2 st  "+st);
		System.out.println("2 st1 "+st1);
		//깊은 복사
		System.out.println("----------");
		Student_100 sts=(Student_100)st.clone();//deepcopy
		System.out.println("3 sts "+sts);
		sts.setAddr("서울 운동장");
		sts.setId(5);
		System.out.println("4 st  "+st);
		System.out.println("5 sts "+sts); 
		// Student_100 에 Cloneable 이 없다면 .. 4,5 동일
		// 				  Cloneable 이 있으면 .. 4,5 다르게 나옴
	}
}
