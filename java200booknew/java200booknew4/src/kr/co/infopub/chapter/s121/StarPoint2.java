package kr.co.infopub.chapter.s121;
public class StarPoint2 {
	public static void printStarDecrease(int n){	
		int max = 0;
		for (int i=1 ; i<=n ; i++) {
			if (max == 0 ) {
				max = 1;
			} else {
				max += 2;
			}
		}
		//System.out.println(">" + max);
		
		for (int i=0 ; i < n ; i++) {
			for (int j=0 ; j < i ; j++ ) {
				System.out.print(" ");
			}
			for (int j=0 ; j < max ; j++ ) {
				System.out.print("*");
			}
			System.out.println();
			max -=2;
		}
	}
	
	public static void main(String[] args) {
		printStarDecrease(5);
	}
}
