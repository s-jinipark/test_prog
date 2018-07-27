package kr.co.infopub.chap074;

public class TestMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		TestA a = new TestA();

		a.setName("jang");
		//[2]
		a.setList("abc");
		
		TestA b = (TestA) a.clone();

		System.out.println("a = " + a.getName());
		System.out.println("b = " + b.getName());
		//[2]
		System.out.println("a = " + a.getList());
		System.out.println("b = " + b.getList());

		System.out.println("--------------------");
		
		a.setName("GGG");
		//[2]
		a.setList("GGG");
		
		System.out.println("a = " + a.getName());
		System.out.println("b = " + b.getName());
		//[2]
		System.out.println("a = " + a.getList());
		System.out.println("b = " + b.getList());

	}

}
