package kr.co.infopub.chap123;
public class Make369 {
	private int number369(int number){ // 숫자에 3,6,9 가 몇 번 포함되어 있는지 리턴
		int a=0;
		int num=0;
		a=number;
		for(int i=0;i<length(number);i++){
			if((a%10)!=0 && (a%10)%3==0){//0이 아니면서 3,6,9
				// 자리의 3,6,9 는 3 의 배수(3%3=0, 6%3=0, 9%3=0)
				// 그런데 0%3 도 0 이 되므로 각 자리수의 0 은 제외
				num++;
			}
			a=a/10;
		}
		return num;
	}//
	private int length(int nums){
		return (nums+"").length();
	}//
	public void play369(int max){
		for(int i=1;i<=max;i++){
			if(number369(i)>0){
				for(int j=1;j<=number369(i);j++){
					System.out.print("*");
				}
				System.out.print("\t");
			}else{
				System.out.print(i+"\t");
			}
			if(i%10==0){
				System.out.println();
			}
		}
	}//
}

/**
 * 3의 배수를 구하는 것이 아니라 </br>
 * 3, 6, 9가 몇개 포함되어 있는 지를 구하는 프로그램 </br>
 */
