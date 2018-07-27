package kr.co.infopub.chap010;
public class TypeTest100{
  public static void main(String[] args) {	
	byte ba=10;
	byte bb=20;
	byte bc=10+20;
	//byte bd=ba+bb;  //타입 캐스팅 에러
	// Type mismatch ERR
	// 정수 타입의 기본 타입은 int *****
	// 변수로 넘겨줄 경우 자동으로 int
	// -> casting 필요
	byte be=(byte)(ba+bb);   //(byte)(int+int)
	Object tObj = ba;
	System.out.println( tObj instanceof Integer );
	System.out.println( tObj instanceof Byte );
	System.out.println("01 : "+bc);
	System.out.println("02 : "+be);
	
	short sa=30;
	short sb=50;
	short sc=30+50;
	//short sd=sa+sb; //타입 캐스팅 에러
	short se=(short)(sa+sb);  //(short)(int+int)
	Object tObj2 = sc;
	System.out.println( tObj2 instanceof Integer );
	System.out.println( tObj2 instanceof Short );	
	System.out.println("03 : "+sc);
	System.out.println("04 : "+se);

	int ia=20;
	int ib=30;
	int ic=20+30;   
	int id=ic+sa;  //sa는 변수이기 때문에 int 된다. ***
	System.out.println("05 : "+ic);
	//--> 변수이기 때문에 int ?? -> 이해 안됨
	
	long la=40l; // long 타입을 선언하려면, l 이나 L 필요
	long lb=50L;
	long lba=50+Integer.MAX_VALUE;  //(int+int) //50 에 L 을 붙이지 않아 int -> 음수
	long lbb=50L+Integer.MAX_VALUE; //(long+int)
	long lc=la+lb;                  //(long+long)
	// long+long ?? 변수로 넘기면 int 아니고?? *****
	
	System.out.println("06 : "+lba);  //int를 기준
	System.out.println("07 : "+lbb);
	System.out.println("08 : "+lc);
	
	float fa=45.0f; // 소수 타입의 기본은 double. 
	//float 은 f나 F로 선언
	float fb=46.67F;
	//float fc=30.4;  //F가 없으면 long 타입이 된다. ***
	// cannot covert double to float 인데???
	
	float fd=30;    // int는 자동으로 float이 된다.
	float fe=fa+fb;
	
	double da=12;
	double db=45+Float.MAX_VALUE;
	double dc=da+db;
	System.out.println("09 : "+dc);
	
	System.out.println("10 : "+"byte 범위: "+Byte.MIN_VALUE+" ~ "+Byte.MAX_VALUE);
	System.out.println("11 : "+"short 범위: "+Short.MIN_VALUE+" ~ "+Short.MAX_VALUE);
	System.out.println("12 : "+"int 범위: "+Integer.MIN_VALUE+" ~ "+Integer.MAX_VALUE);
	System.out.println("13 : "+"long 범위: "+Long.MIN_VALUE+" ~ "+Long.MAX_VALUE);
	System.out.println("14 : "+"float 양의 범위: "+Float.MIN_VALUE+" ~ "+Float.MAX_VALUE);
	System.out.println("15 : "+"double 양의 범위: "+Double.MIN_VALUE+" ~ "+Double.MAX_VALUE);	
  }
 }
// C 언어는 int 범위가 유동적(Unix - 4바이트, Windows - 2바이트)
// java -> 기본타입의 크기를 고정
// byte, short(char), int, long, float, double
// 1, 2, 4, 8, 4, 8
// bsilfd 124848 이라고 기억 *****
// 비실 FD (PD 는 괜찮은데..)
