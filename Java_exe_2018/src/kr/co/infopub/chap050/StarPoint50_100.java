package kr.co.infopub.chap050;
public class StarPoint50_100 {

	public static void main(String[] args) {
		printButterfly(5);
		System.out.println("------------------");
		printDiamond(5);
	}
	public static void printStarDecrease(int n){
		
		for(int i=0; i<n;i++){
			// 일반
			//for(int i2=0; i2<n-i; i2++){
			//	System.out.print("*");
			//}
			// (2)갯수 증가
			for(int i2=0; i2<2*(n-i); i2++){
				System.out.print("*");
			}
			// (3) 공백 넣어주기

			
//			for(int j=0; j<i;j++){
//				System.out.print(" ");
//			}
//			for(int k=1; k<2*(n-i);k++){
//				System.out.print("*");
//			}
			System.out.println();
		}
	}
	public static void printStarIncrease(int n){
		
		for(int i=n-1; i>=0;i--){
			for(int j=0; j<i;j++){
				System.out.print(" ");
			}
			for(int k=1; k<2*(n-i);k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void printButterfly(int n){
		printStarDecrease(n);
		printStarIncrease(n);
	}
	public static void printDiamond(int n){
		printStarIncrease(n);
		printStarDecrease(n);
	}
}
