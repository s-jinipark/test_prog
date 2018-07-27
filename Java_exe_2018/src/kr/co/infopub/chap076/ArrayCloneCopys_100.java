package kr.co.infopub.chap076;
public class ArrayCloneCopys_100 {

	public static void main(String[] args) {
		int [] a={8,5,2,4,6,3,7,9};
		//int [] b={8,5,2,4,6,3,7,9};
		int [] c=a;    //shallow copy
		int [] d=new int[a.length];
		System.arraycopy(a,0,d,0,a.length);//deep copy
		//clone을 지원하지 않으면 CloneNotSupportedException 발생
		int [] e=(int [])a.clone();
		a[4]=-2;
		System.out.println("----- a 인쇄");
		print(a);
		System.out.println("----- c 인쇄");
		print(c);
		System.out.println("----- d 인쇄");
		print(d);
		System.out.println("----- e 인쇄");
		print(e); //[2] d, e 는 변동 없음

		System.out.println("--------------------");
		int [][] fa={{4,5,6,7},{6,7,8,9}};
		int [][] fb=(int[][])fa.clone();
		fa[0][0]=-1;
		System.out.println("----- fb 인쇄");
		print(fb);//1차원 배열 clone-> deep copy **
		          //2차원 배열 clone-> shallow copy
		//2차원 배열을 deep copy 시키기 위해서 
		int [][] fc=new int[fa.length][fa[0].length];
		
		for(int i=0;i<fa.length;i++){
			fc[i]=(int [])fa[i].clone(); //[2] 1차원 배열에서 clone
			// 즉 fc[0], fc[1] 에서 .clone()
		}
		
		fa[0][0]=-5;
		System.out.println("----- fc 인쇄");
		print(fc);//fc는 fa변화에 영향을 받지 않는다.
	}
	public static void print(int [] p){
		for(int i=0;i<p.length;i++){      
			System.out.print("["+p[i]+"] ");
		}
		System.out.println();
	}
	public static void print(int [][] p){
		for(int i=0;i<p.length;i++){
			for(int j=0;j<p[i].length;j++){
				System.out.print("["+p[i][j]+"] ");
			}
			System.out.println();
		}
	}
}
