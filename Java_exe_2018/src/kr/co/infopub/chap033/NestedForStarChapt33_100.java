package kr.co.infopub.chap033;
public class NestedForStarChapt33_100 {

	public static void main(String[] args) {
		//중첩for
		// 따라함
		for(int i=0; i< 10; i++) {
			//System.out.println("*");
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		// 따라함
		for(int i=0; i< 10; i++) {
			//System.out.println("*");
			for(int j=0; j<10-i; j++) {
				System.out.print("@");
			}
			System.out.println("");
		}
	}
}
