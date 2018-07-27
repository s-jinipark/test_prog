package kr.co.infopub.chap077;

public class ArrayMethodMain {

	public static void main(String[] args) {

		int a=5;
		int b=6;
		ArrayMethod.copyVInt(a,b);//call by value  //immutable
		   						  // 함수 내부에서 b=a 하지만
		System.out.println(a); //변경되지 않느다.
		System.out.println(b); //변경되지 않느다.
		ArrayMethod.multi(a);  //call by value  //immutable
			  				   // 함수 내부에서 *10 하지만
		System.out.println(a);//변경되지 않느다.
		
		System.out.println("--------------------");
		
		int [] aa={5,4,7,1,9,12,0,3,2,6};
		int [] bb=new int[aa.length];
		int [] cc={5,4,7,1,9,12,0,3,2,6};
		int [] dd=new int[cc.length];
		
		ArrayMethod.copyR(aa,bb);  //call by reference로 copy
								   //[2] 함수내부에서 bb=aa
		ArrayMethod.print(bb);
		ArrayMethod.copyRChange(aa,bb);
		                           //[2] 함수내부에서 bb=aa, bb[0] 변경
		ArrayMethod.print(bb);
		ArrayMethod.print(aa);
		
		System.out.println("--------------------");
		ArrayMethod.bbsort(aa);  //call by reference로 sorting  //mutable
		ArrayMethod.print(aa);  
		
		ArrayMethod.copyV(cc,dd);  //dd의 값들은 모두 0이었다. 
		ArrayMethod.print(dd); //call by value로 copy  //mutable
	}
}
