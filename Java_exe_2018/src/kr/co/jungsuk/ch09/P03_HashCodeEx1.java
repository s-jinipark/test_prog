package kr.co.jungsuk.ch09;
class P03_HashCodeEx1 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	/* 
	hashCode()
	해싱은 데이터관리기법 중 하나인데 다량의 데이터를 저장하고 검색하는데 유용
	해시함수는 찾고자하는 값을 입력하면, 그 값이 저장된 위치를 알려주는 해시코드를 반환한다
	-> 
	String 클래스는 문장열의 내용이 같으면, 동일한 해시코드를 반환하도록
	hashCode 메서드가 오버라이딩 되어 있기 때문
	*/
}
