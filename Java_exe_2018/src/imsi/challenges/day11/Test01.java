package imsi.challenges.day11;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test01 t = new Test01();
						

		String name = "JEROENAZ";
		
		int an = t.solution(name);
		
		System.out.println(an);

	}

	public int solution( String name ) {
		int answer = 0;
		int len = name.length();
		
		for (int i=0; i<len ; i++ ) {
			int forw = 0;
			int back = 0;
			char tmp = name.charAt(i);
			//System.out.println((int)tmp);
			int curr = (int)tmp;
			
			int tmp_forw = 65; // 기본 A 셋팅
			int tmp_back = 91; // 기본 A -> 커서 1번 이동하여 'Z' 셋팅
			//A - 65
			//Z - 90
			if (i>0) {
				forw++;	// 커서 이동 해야 함
				back++;
			}
			
			while (tmp_forw < curr) {
				tmp_forw++;
				forw++;
			}
			
			while (tmp_back > curr) {
				tmp_back--;
				back++;
			}
			
			if (forw < back) {
				answer += forw;
			} else {
				answer += back;
			}
		}
		
		return answer;
    }

	
}
