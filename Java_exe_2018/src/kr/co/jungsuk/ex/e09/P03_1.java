package kr.co.jungsuk.ex.e09;

public class P03_1 {
	// [9-3] 다음과 같은 실행결과가 나오도록 코드를 완성하시오.
	/*
	[실행결과]
		fullPath:c:\jdk1.8\work\PathSeparateTest.java
		path:c:\jdk1.8\work
		fileName:PathSeparateTest.java
	*/
	public static void main(String[] args) {

		String fullPath = "C:\\dev\\git\\test2018\\Java_exe_2018\\src\\kr\\co\\jungsuk\\ex\\e09\\P02_1.java";
		String path = "";
		String fileName = "";
		
		/*
		(1) 알맞은 코드를 넣어 완성하시오.
		*/
		int tmp_indx = fullPath.lastIndexOf("\\");
		System.out.println(">:"+tmp_indx);	
		
		path = fullPath.substring(0, tmp_indx);
		fileName = fullPath.substring( tmp_indx+1 );
		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+path);
		System.out.println("fileName:"+fileName);
	}

}