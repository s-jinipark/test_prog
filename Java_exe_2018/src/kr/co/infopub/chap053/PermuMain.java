package kr.co.infopub.chap053;

public class PermuMain {

	
	public static void main(String[] args) {
		
		int n=10;
		for (int i = 0; i <= n; i++) {
			System.out.printf("%dP%d=%d\n",n,i,Recurs.P(n, i));
		}
		System.out.println("--------------------------------");
		for (int i = 0; i <= n; i++) {
			System.out.printf("%dC%d=%d\n",n,i,Recurs.C(n, i));
		}
		
	}

}
