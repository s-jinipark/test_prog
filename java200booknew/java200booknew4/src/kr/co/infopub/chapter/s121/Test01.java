package kr.co.infopub.chapter.s121;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 층 수 를 입력 받아야
		int n = 5;
		
		for (int i=0; i< n ; i++) {
			for (int j=0; j<n-i-1 ; j++) {
				System.out.print(" ");
			}
			
			for (int j=0; j<=(i*2) ; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println("---------------");
		for(int i=0; i<n;i++){
			for(int j=0; j<i;j++){
				System.out.print(" ");
			}
			for(int k=1; k<2*(n-i);k++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------");
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

}
