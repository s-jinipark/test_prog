package kr.co.infopub.chap013;
public class Coffee2Main {
//반복, 복잡함을 메서드로 만든다.
	public static void main(String[] args) {
		
		int myMoneyA = 800;  //800원은 커피 몇잔일까?
		int cupsA = Coffee2Main.coffee(myMoneyA);
		Coffee2Main.printCoffee(cupsA);
		
		int myMoneyB = 150;  //150원은 커피 몇잔일까?
		int cupsB = coffee(myMoneyB);
		printCoffee(cupsB);
		
	}//main
	
	public static int coffee(int money){
		int cups=0;   //몇잔나올까 준비
		if(money > 0){
			cups=money/200;
		}else if(money==0){
			cups=0;
		}else{
			cups=-1;
		}
		return cups;
	}//coffee
	
	public static void printCoffee(int cups){
		if(cups>0){
			System.out.println("커피 "+cups+"잔 입니다.");
			//System.out.printf("커피 %d잔 입니다.",cups);
		}else{
			System.out.println("액수가 모자랍니다.");
		}
	}//printCoffee
}

/*
모든 기본타입은 값에 의한 대입이고,
모든 참조타입은 참조에 의한 대입이다.
그런데.. 메서드의 아규먼트로 모든 타입을 넘길 때는 값에 의한 전달이 된다는 점에 주의**
*/