package kr.co.jungsuk.ch09;
import java.util.Scanner;
import java.io.File;

class P36_ScannerEx2 {
	public static void main(String[] args) throws Exception {
		//Scanner sc = new Scanner(new File("data2.txt"));
		//[2] 파일 못 찾아서 임시로 변경
		Scanner sc = new Scanner(new File("C:\\tmp\\test\\data2.txt"));
		
		int sum = 0;
		int cnt = 0;

		while (sc.hasNextInt()) {
			sum += sc.nextInt();
			cnt++;
		}

		System.out.println("sum="+sum);
		System.out.println("average="+ (double)sum/cnt);
	}
}
