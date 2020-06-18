package imsi.challenges.day13;

import java.util.Arrays;
import java.util.Comparator;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test01 t = new Test01();
		
		int n = 4;
		int[][] co = {
				{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}
		};
		int an = t.solution(n, co);
		
		System.out.println(an);

	}
	
    public int solution(int n, int[][] costs) {
        int answer = 0;
        // 임의의 i에 대해, costs[i][0] 와 costs[i][1]에는 다리가 연결되는 두 섬의 번호가 들어있고, 
        // costs[i][2]에는 이 두 섬을 연결하는 다리를 건설할 때 드는 비용입니다.

        // 최저 비용이 목표이니, 가격 순으로 정렬
        print(costs);
        System.out.println("=====");
        Arrays.sort(costs, Comp);
        print(costs);
        
        // 비용이 가장 싼 다리 부터 건설하고 모든 섬이 연결되면 건설을 멈추고 비용을 반환하면 됨
        
        boolean[] bridge = new boolean[costs.length];  // 다리를 건설 했는지
        boolean[] visit = new boolean[n];	// 섬에 방문했는지
        visit[costs[0][0]] = true; // 최소 비용의 다리를 먼저 이어 줌
        visit[costs[0][1]] = true;
        bridge[0] = true;
        
        answer = costs[0][2]; // 처음 건설한 다리 비용 추가
        int island = 2; // 방문한 섬의 개수를 체크
        
        while(island < n) {	// 모든 섬을 방문했을 경우 더 이상 다리를 건설할 필요가 없음
        	for (int i=1 ; i<bridge.length ; i++) {
                if(!bridge[i] && ((visit[costs[i][0]]&&!visit[costs[i][1]])||(visit[costs[i][1]]&&!visit[costs[i][0]]))) {
                    bridge[i] = true;
                    visit[costs[i][0]] = true;
                    visit[costs[i][1]] = true;
                    island++;
                    answer+=costs[i][2];
                    break;
                }
        	}
        }
        return answer;
    }
    
    Comparator<int[]> Comp = new Comparator<int[]>() {

		@Override
		public int compare(int[] o1, int[] o2) {
			// TODO Auto-generated method stub
			return o1[2] - o2[2];
		}
    };
    
    public void print(int[][] p) {
    	for (int i=0; i< p.length ; i++) {
    		System.out.println(">" + p[i][0] + " / "
    				+ p[i][1] + " / " + p[i][2] );
    	}
    }

} 
