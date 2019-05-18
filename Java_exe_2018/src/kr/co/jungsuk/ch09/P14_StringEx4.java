package kr.co.jungsuk.ch09;
import java.util.StringJoiner;

class P14_StringEx4 {
	public static void main(String[] args) {
		String animals = "dog,cat,bear";
		String[] arr   = animals.split(",");

		System.out.println(String.join("-", arr));

		StringJoiner sj = new StringJoiner("/","[","]");
		for(String s : arr)
			sj.add(s);

		System.out.println(sj.toString());
	}
}
/*
java.util.StringJoiner 는 JDK 1.8부터 추가되었다

*/