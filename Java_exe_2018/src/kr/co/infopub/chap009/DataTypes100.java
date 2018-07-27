package kr.co.infopub.chap009;
public class DataTypes100 {

	public static void main(String[] args) {
		//primitive type
		// 기본 타입
		int    primitiveInt  = 19;
		double primitiveLong = 3.1453;
		//reference type
		// 참조 타입
		String refStr = "안녕하세요"; //*****
		Object refObj = new Object();
		//Wrapper class (reference)
		// 랩퍼 클래스(참조)
		Integer wrapInt    = new Integer(19);
		Double  wrapDouble = new Double(3.1453);
		//Array (reference)
		// 배열 (참조)
		int [] a={1,2,3};

		// 참조 타입은 new 키워드를 이용하여 데이터를 메모리에 대입 => 객체 생성
		// 생성된 객체를 이용하려면 참조 필요 (refStr) 
		// 배열과 String 은 일반 참조 타입과 달리 new 를 사용하지 않고도 객체를 생성
		System.out.println("1: "+primitiveInt);
		System.out.println("2: "+primitiveLong);
		System.out.println("3: "+refStr);
		System.out.println("4: "+refStr.indexOf('녕')); // 자바에서 자리는 항상 0부터
		System.out.println("5: "+refStr.hashCode());
		System.out.println("6: "+refObj);
		System.out.println("7: "+refObj.getClass());
		System.out.println("8: "+refObj.hashCode());
		System.out.println("9: "+wrapInt);
		System.out.println("10: "+wrapInt.intValue());
		System.out.println("11: "+wrapDouble);
		System.out.println("12: "+wrapDouble.doubleValue());
		System.out.println("13: "+a);
		System.out.println("14: "+a.length);
		System.out.println("15: "+a[1]);
	}
}
// 기본 타입 		랩퍼 클래스
//	byte			Byte
//	char			Character
//	long			Long
//	double			Double
//	short			Short
//	int				Integer
//	float			Float
//	boolean			Boolean

/*
기본타입 : 연산이나 저장을 위한 데이터 단위
참조타입 : 데이터와 이를 가공하는 기능(메서드)을 제공하는 데이터 단위


java2 와 java5 의 차이

java2 : Wrapper class 이용

java5 : Boxing / Unboxing

*/
