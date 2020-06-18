package imsi.inflearn.top50.C1StringArray.T07;

public class JewelsAndStones {

	public static void main(String[] args) {
		String J = "aA", S = "aAAbbbb";
		System.out.println(solve(J, S));
	}

	public static int solve(String jew, String stone) {

		int count = 0;

		char[] j_c = jew.toCharArray();
		char[] s_c = stone.toCharArray();
		
		for (int i=0; i<s_c.length ; i++) {
			
			char tmp = s_c[i];
			
			for (int j=0 ; j<j_c.length ; j++) {
				if (tmp == j_c[j]) {
					count++;
				}
			}
		}
		
		return count;
	}

}
