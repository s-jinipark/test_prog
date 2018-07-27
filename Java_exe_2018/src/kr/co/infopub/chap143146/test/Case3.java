package kr.co.infopub.chap143146.test;

import kr.co.infopub.chap143146.Car;
import kr.co.infopub.chap143146.Taxi;

public class  Case3
{
	public static void main(String[] args) 
	{
		Car car4=new Taxi();
		Taxi taxi1=new Taxi();
		car4.show() ;
		System.out.println(car4.speed() );

		taxi1.show() ;
		System.out.println(taxi1.speed() );
	}
}
