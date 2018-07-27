package kr.co.infopub.chap074;
public class ArrayInit_100 {
	public static void main(String[] args) {
		//기본타입의 배열 사용 방법 1 선언
		int [] a;// 선언
		//정의
		a=new int[5];
		//초기화
		a[0]=2;	a[1]=5; a[2]=3; a[3]=9;	a[4]=8;
		
		//방법 2 선언 정의 초기화
		int [] b=new int[]{2,5,3,9,8};
	
		//방법 3 선언 (정의)초기화
		int [] c={2,5,3,9,8};
		//불가 다시 대입 불가
		//c={2,5,3,9};
		//-> Array constants can only be used in initializers
		System.out.print("a[ ] : \t");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	
		int [] d=a; //Shallow copy
		a[4]=55; //a의 값을 변동시키면 d의 값이 바꿜까?
		System.out.print("d[ ] : \t");
		for(int i=0;i<a.length;i++){
			System.out.print(d[i]+"\t");
		}
		// d=a 였으므로, a 값을 변동시키면 d의 값이 바뀜
		
		System.out.println();
		int [] e=new int[5];
		System.arraycopy(d,0,e,0,d.length);//Deep copy
		d[4]=100;//d의 값을 변동시키면 e의 값이 바꿜까?
		System.out.print("e[ ] : \t");		
		for(int i=0;i<e.length;i++){
			System.out.print(e[i]+"\t");
		}
		
		boolean[] bb=new boolean[5];
		System.out.println(bb[0]);
		
		//add - d[] 확인
		System.out.print("d[ ] : \t");				
		for(int i=0;i<d.length;i++){
			System.out.print(d[i]+"\t");
		}
		/*
		참조에 의한 대입 복사
				같은 레퍼런스를 갖게 된다(소스의 레퍼런스를 대입한다)
		System.arraycopy
				데스티네이션이 준비되면 소스를 데스티네이션에 일대일 대입 한다
		클론(clone)
				새로운 배열 객체를 만든 다음 배열을 일대일 대입(복사) 한다.
				배열의 엘리먼트가 String 이나 기본 타입이면 소스와 데스티네이션은
				서로 영향을 받지 않는 새로운 객체가 된다 **
				그러나
				참조 타입(String 제외) ** 일 때는 뮤터블한 특징 때문에 
				소스의 값이 바뀌면 데스티네이션의 값도 바뀐다
		*/
		System.out.println();
		System.out.println("------------------------------");
		int [] a100 =new int[]{2,5,3,9,8};
		int [] b100 = a100.clone();
		int [] b110 = a100;
		int [] c100 = new int[5];
		System.arraycopy(a100, 0, c100, 0, a100.length);
		//a100 값 바꿈
		a100[4] = 1000;
		for(int i=0;i<a100.length;i++){
			System.out.print(a100[i]+"\t" + b100[i]+"\t" + b110[i]+"\t" + c100[i]+"\n" );
		}
	}//
}