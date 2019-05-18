package kr.co.jungsuk.ex.e09;

public class P11_1 {
	// [9-11] 커맨드라인으로 2~9사이의 두 개의 숫자를 받아서 두 숫자사이의 구구단을 출력
	//	하는 프로그램을 작성하시오.
	//	예를 들어 3과 5를 입력하면 3단부터 5단까지 출력한다.

	public static void gugudan(int begin, int end) {
		
		for (int i = begin ; i<= end ; i++) {
			
			for (int j=1 ; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.println("" );
		}

	}
		
	public static void main(String[] args) {

		gugudan(3,5);
	}
}