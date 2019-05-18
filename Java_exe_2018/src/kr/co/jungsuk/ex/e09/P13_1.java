package kr.co.jungsuk.ex.e09;

public class P13_1 {
	// [9-13] 다음은 하나의 긴 문자열(source) 중에서 특정 문자열과 일치하는 문자열의 개수
	//	를 구하는 예제이다. 빈 곳을 채워 예제를 완성하시오.

	public static void main(String[] args) {
		String src = "aabbccAABBCCaa";
		System.out.println(src);
		System.out.println("aa를 " + stringCount(src, "aa") +"개 찾았습니다.");
	}
	
	static int stringCount(String src, String key) {
		return stringCount(src, key, 0);
	}
	
	static int stringCount(String src, String key, int pos) {
		int count = 0;
		int index = 0;
		if (key == null || key.length() == 0)
			return 0;
		/*
		(1) 알맞은 코드를 넣어 완성하시오.
		*/
		while (true ) {
			
			index = src.indexOf(key, pos);
			System.out.println(">" + index);
			if (index == -1) {
				break;

			} else {
				count++;
				pos = index+key.length();
			}
		}
		return count;
	}
}