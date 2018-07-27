package kr.co.infopub.chap122;
public class NumberCountingMain_100 {

	public static void main(String[] args) {
		
		System.out.println("123: "+numberSum(123));
		System.out.println("2: "+numberSum(2));
		System.out.println("5354354 : "+numberSum(5354354));
		System.out.println("123456789 : "+numberSum(123456789));
	}
	
	public static int numberSum(int number){
		int a=0;
		int num=0;
		a=number;
		for(int i=0;i<length(number);i++){
			num+=a%10;
			a/=10;
			System.out.println(">" + num + " / " + a);
		}
		return num;
	}
	private static int length(int nums){
		return (nums+"").length();
	}
}
