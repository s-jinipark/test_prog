package kr.co.infopub.chap005;

public class HelloModifier {
	
	final public static  void go(){
		System.out.println("Hello go!");
	}
	static  public  void jump(){
		System.out.println("Hello jump!");
	}
	public static void main(String[] args) 
	{
		go();
		jump();
	}
}
