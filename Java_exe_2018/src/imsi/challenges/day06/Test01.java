package imsi.challenges.day06;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test01 t = new Test01();
				
		int[] mon = {4,9,5,8};
		
		int S1 = 2;
		int S2 = 3;
		//int S3 = 4;
		int S3 = 3;
		
		int an = t.solution(mon, S1, S2, S3);
		
		System.out.println(an);

	}
	
	public int solution(int[] monster, int S1,  int S2, int S3) {
		int answer = 0;
		int tmp_hap = 0;
		double tmp_tot = 0;
		double tmp_succ = 0;
		double tmp_per = 0;
		for (int i=1; i<=S1 ; i++) {
			for (int j=1; j<=S2 ; j++) {
				for (int k=1; k<=S3 ; k++) {
					tmp_hap = i + j + k +1;
					//System.out.println(safeOrNot(monster, tmp_hap));
					tmp_tot++;
					if (safeOrNot(monster, tmp_hap) ) tmp_succ++;
				}
			}
		}
		tmp_per = tmp_succ/tmp_tot;
		answer = (int)(tmp_per*1000);
 		return answer;
    }

	public boolean safeOrNot(int[] monster, int tmp_hap) {
		boolean rtn = true;
		for (int i=0; i< monster.length ; i++) {
			if (monster[i] == tmp_hap ) {
				rtn = false;
				break;
			}
		}
		return rtn;
	}
	// tmp_hap = i + j + k ;
	// 말이 1에 놓여 있었음 (시작위치  1)
	// tmp_hap = i + j + k +1; 로 변경
}
