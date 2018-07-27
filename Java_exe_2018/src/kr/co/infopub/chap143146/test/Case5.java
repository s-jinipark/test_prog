package kr.co.infopub.chap143146.test;

import kr.co.infopub.chap143146.Car;
import kr.co.infopub.chap143146.Dump;
import kr.co.infopub.chap143146.Truck;

public class  Case5
{
	public static void main(String[] args) 
	{
		Car car6=new Dump(); 
		Dump dum1=new Dump(); 
		Truck truc3=(Truck)car6;
		Dump dum2=(Dump)car6;
		Dump dum3=(Dump)truc3;
		Truck dum4=new Dump(); 

		dum2.show() ;
		System.out.println(dum2.speed() );
        dum2.pass();
		dum2.tone() ;
	}
}
