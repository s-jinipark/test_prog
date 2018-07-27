package kr.co.infopub.chap143146.test;

import kr.co.infopub.chap143146.Bus;
import kr.co.infopub.chap143146.Car;
import kr.co.infopub.chap143146.Cargo;
import kr.co.infopub.chap143146.Dump;
import kr.co.infopub.chap143146.Sports;
import kr.co.infopub.chap143146.Taxi;
import kr.co.infopub.chap143146.Truck;

public class CarMain {
  public CarMain() {
  }
  public static void main(String[] args) {
    Car car1=new Car();
    Bus bus1=new Bus();
    Car car2=new Bus();

    Bus buc1=(Bus)car2;
    Car car3=new Truck();
    Truck truck1=new Truck();
    Truck truck2=(Truck)car3;
    Car car4=new Taxi();
    Taxi taxi1=new Taxi();
    Car car5=new Sports();
    Sports spo1=new Sports();
    Car car6=new Dump();
    Dump dum2=(Dump)car6;
    Car car7=new Cargo();
    Cargo cago2=(Cargo)car7;
  }
}