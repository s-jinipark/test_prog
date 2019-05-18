package kr.co.jungsuk.ch09;
import java.util.Scanner;
import java.io.File;

class P37_ScannerEx3 {
	public static void main(String[] args) throws Exception {
		//Scanner sc = new Scanner(new File("data3.txt"));
		//[2] 파일 못 찾아서 임시로 변경
		Scanner sc = new Scanner(new File("C:\\tmp\\test\\data3.txt"));
		
		int cnt = 0;
		int totalSum = 0;

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			Scanner sc2 = new Scanner(line).useDelimiter(",");
			int sum = 0;

			while(sc2.hasNextInt()) {
				sum += sc2.nextInt();
			}
			System.out.println(line + ", sum = "+ sum);
			totalSum += sum;
			cnt++;
		}
		System.out.println("Line: " + cnt + ", Total: " + totalSum);
	}
}
