package kr.co.infopub.chap024;
public class  AssignMain100
{
	// 024 대입 연산자(=)와 박싱/언박싱
	public static void main(String[] args) 
	{
		int intNm1=123;
		long longNum1=345L;
		double doubleNum=123.123;
		
		Integer intWrap1=new Integer(187);
		// 참조 타입은 new 키워드를 사용하여 객체를 생성
		// 랩퍼 클래스도 참조 타입
		// 랩퍼 클래스는 기본타입을 참조타입으로 만들때 사용 ***
		// -> 데이터 보관과 여러 메소드를 제공하는 역할		
		Long    longWrap1=new Long(876);
		Double  doubleWrap1=new Double(365);
		
		String str="Hello JAVA7";          //predefined
		String newStr=new String("Hello"); //predefined
		Object  obj=new Object();          //predefined
		
		Student stu=new Student();       //user-defined

		doubleNum=longNum1;       //primitive promotion
		intNm1=(int)doubleNum;      //primitive casting
		longNum1=longWrap1.longValue();  //pri<-->wrap
		
		//longWrap1=intWrap1; //reference type mismatch 
		obj=longWrap1;        //상속관계(계층) promotion
		longWrap1=(Long)obj;  //상속관계(계층) casting
		System.out.println(longWrap1.longValue());
		obj=stu;             //상속관계(계층) promotion
		stu=(Student)obj;    //상속관계(계층) casting
		System.out.println(stu.getName());
		//str=stu;           //reference type mismatch 
	}
	// 기본 타입				Wrapper class
	//  Boxing   	 -->
	//           	 <--    UnBoxing
	//   double
	//   float  ↑
	//   long   ↑ promotion
	//   int    ↑  ( ↓ 는 casting )
}
