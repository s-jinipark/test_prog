package kr.co.infopub.chap050;
public class StarPoint50_101 {

	public static void main(String[] args) {

		int max = 5;
		for(int i=0; i<max ; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<2*(max-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<max ; i++) {
			for (int j=1; j<max-i; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<(2*i)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
