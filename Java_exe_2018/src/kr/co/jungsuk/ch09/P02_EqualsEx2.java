package kr.co.jungsuk.ch09;
class Person {
	long id;

	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Person) {
			return id ==((Person)obj).id; // Person 타입으로 형 변환
		} else {
			return false; // 타입이  Person 이 아니면 비교할 필요도 없다
		}
	}

	Person(long id) {
		this.id = id;
	}
}

class P02_EqualsEx2 {
	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		//[2]
		/*
		 Person 인스턴스의 주소 값이 아닌 멤버변수 id의 값을 비교하기 위해 
		 equals 메소드를 오버라이딩
		 
		 */
		if(p1==p2)
			System.out.println("p1과 p2는 같은 사람입니다. **");
		else
			System.out.println("p1과 p2는 다른 사람입니다.");

		if(p1.equals(p2))
			System.out.println("p1과 p2는 같은 사람입니다. **");
		else
			System.out.println("p1과 p2는 다른 사람입니다.");
	
	}
}
