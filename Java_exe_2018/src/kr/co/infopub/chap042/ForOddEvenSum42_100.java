package kr.co.infopub.chap042;
public class ForOddEvenSum42_100 {

	public static void main(String[] args) {
		
		int toNum=100;

		int sumOdd=0;
		int sumEven=0;

		sumEven=summEven(1,toNum);
		System.out.println("1 to "+toNum+" even sum "+sumEven);

		sumOdd=summOdd(1,toNum);
		System.out.println("1 to "+toNum+" odd sum "+sumOdd);
		
		// Ãß°¡·Î
		int sumEven2=0;
		int sumOdd2=0;
		for( int i=1; i<=100;i++){
			if(i%2!=0){
				sumOdd2+=i;
			} else {
				sumEven2+=i;
			}	
		}
		
		System.out.println("1 to 100 even sum "+sumEven2);
		System.out.println("1 to 100 odd  sum "+sumOdd2);
		
	}
	public static int summEven(int start, int end){
		int sumEven=0;
		//Â¦¼öÇÕ
		for( int i=1; i<=end;i++){
			if(i%2!=0){
				continue;
			}
			sumEven+=i;
		}
		return sumEven;
	}
	public static int summOdd(int start, int end){
		int sumOdd=0;
		//Â¦¼öÇÕ
		for( int i=1; i<=end;i++){
			if(i%2==0){
				continue;
			}
			sumOdd+=i;
		}
		return sumOdd;
	}
}
