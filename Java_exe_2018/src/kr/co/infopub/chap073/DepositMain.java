package kr.co.infopub.chap073;

public class DepositMain {
	public static void main(String[] args) {
		//3년 80만원 복리 년 3%
		int month=36;
		double a0=800000;
		double rate=3;
		double amount=Exponential.deposit(month, a0, rate);
		System.out.printf("%d개월 %f씩 저축 : %f\n",month,
				a0,Math.ceil(amount));

	}

}
