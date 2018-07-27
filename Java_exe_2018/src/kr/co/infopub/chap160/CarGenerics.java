package kr.co.infopub.chap160;
import java.util.*;
public class CarGenerics
{
	public static void main(String[] args) 
	{
		Vector <Car> vc=new Vector<Car>(5,5);
		vc.add(new Car());  
		vc.add(new Car());  
		vc.add(new Car());
		vc.add(new Taxi()); 
		vc.add(new Bus());
		Car c1=vc.get(1);
		c1.show();//Car
		vc.add(new Bus());//Car로 대입 Bus is Car
		Car c2=vc.get(3);//Car
		c2.show();//Taxi
		Vector <Bus> vb=new Vector<Bus>(5,5);
		vb.add(new Bus()); 
		vb.add(new Bus()); 
		vb.add(new Bus());
		//vc=vb;//error->ensure compile-time type safety //incompatible types
		System.out.println("-------------------------");
		Vector <? extends Car> vec=vb;//whild card
		for(Car c : vec){
			c.show();
			((Bus)c).move();
		}
	}
	//160 지네릭스와 파라미터화된 타입 이해하기 

	//지네릭스(Generics)는 캐스팅하지 않고도 클래스를 쓸 수 있게 해주는 기능

	// - 파라미터화된 타입
	// - 와일드 카드(wild card, ?) 
	// - 파라미터화된 메소드
	// - 사용자가 정의한 파라미터화된 타입

}

