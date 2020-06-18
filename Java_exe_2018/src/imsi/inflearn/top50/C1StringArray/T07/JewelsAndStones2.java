package imsi.inflearn.top50.C1StringArray.T07;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones2 {

	public static void main(String[] args) {
		String J = "aA", S = "aAAbbbb";
		System.out.println(solve(J, S));
	}

	public static int solve(String jew, String stone) {

		int count = 0;
		// 1 보석은 대소문자를 구분해서 갖고 있어야 한다
		// 2 aA -> 2개
		// 3 스톤에 가서 aA 가 개별적으로 몇개이었는지 체크
		
		// 중복을 허용하지 않는 HashSet 만듬
		Set<Character> set = new HashSet<>();
		for (char jewChar : jew.toCharArray()) {
			set.add(jewChar); // a, A 셋팅
		}
		
		for (char stoneChar : stone.toCharArray()) {
			if (set.contains(stoneChar)) {
				count++;
			}
		}
		
		return count;
	}

}
