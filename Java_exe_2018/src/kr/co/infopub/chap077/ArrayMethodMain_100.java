package kr.co.infopub.chap077;

public class ArrayMethodMain_100 {

	public static void main(String[] args) {
	
		int [] aa={5,4,7,1,9,12,0,3,2,6};
		int [] bb=new int[aa.length];
		int [] cc={5,4,7,1,9,12,0,3,2,6};
		int [] dd=new int[cc.length];
		print(aa);
		System.out.println("--------------------");
		//bbsort
		for (int i=0; i<aa.length-1; i++) {
			System.out.println("i:"+i);
			for (int j=0; j<aa.length-1-i; j++) {
				System.out.println("j:"+j);
				if (aa[j]>aa[j+1]) {
					int tmp =aa[j];
					aa[j]=aa[j+1];
					aa[j+1]=tmp;
					print(aa);
				}
			}
		}
		print(aa);
		
	}
	public static void print(int [] p){
		for(int i=0;i<p.length;i++){      //값들이 변한다.
			System.out.print("["+p[i]+"] ");  //레퍼런스 타입은 
		}
		System.out.println();
	}
}
