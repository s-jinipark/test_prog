package imsi.inflearn.test2020.C2.T01;

public class RecursiveTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 재귀호출 테스트 (순열 구하기) 
		// N 개의 알파벳 중에서 R 개를 나열할 수 있는 경우를 모두 출력
		
		RecursiveTest2 t = new RecursiveTest2();
		int n = 3;
		int r = 2; // 3개 중에 2개
        int[] arr = {1, 2, 3};
		
		t.solution(n, r, arr);
	}
	
	public void solution(int n, int r, int[] arr) {

        // 복습 
		// 3개중에 2개 뽑는 경우이므로 2중 for 문으로 되긴 함
        for (int i=0 ; i<arr.length ; i++) {
        	for (int j=0 ; j<arr.length ; j++) {
        		if (i != j) { // 같은 경우는 제외
        			System.out.println(">" + arr[i] + "/" + arr[j]);
        		}
        	}
        }
        // 하지만 3중, 4중으로 가면  for 문도 3중, 4중으로 중첩됨. 
        // 같은 경우 제외하는 if 도 && 로 계속 붙여 줌
        // -> 그래서 재귀로 ..
        
		// 변수		설명
        // -------- --------------------
		// arr		r 개를 뽑기 위한 n 개의 값
		// output	뽑힌 r 개의 값
		// visited	중복해서 뽑지 않기 위해 체크하는 값

        int[] output = new int[r];
        boolean[] visited = new boolean[n];
        
        getResult(arr, output, visited, 0 , n, r);
        
	}
	
	public void getResult(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
		if (depth >= r) { // 다 뽑힘
			print(output);
		} else {
			// arr 에서 하나씩 뽑아야
//			for (int i=0 ; i<n ; i++) { // n개 중에서 뽑는 거 이므로
//				//output[i] = arr[i]; // 오류남
//				output[depth] = arr[i]; // [2] **
//				visited[i] = true; //뽑혔다는 표시
//				// 다음 자리
//				getResult(arr, output, visited, depth+1, n, r);
//				// 여기로 돌아 왔다는 것은 하위에서 할 수 있는 것 다 한 뒤라는 얘기
//				visited[i] = false; 
//			}
			// 위와 같이 하니  1 1 도 나옴 => 즉 나온 녀석은 빼 주어야 함
			// [3]
			for (int i=0 ; i<n ; i++) { // n개 중에서 뽑는 거 이므로
				if ( visited[i] == false) { //[3] **
					output[depth] = arr[i]; // [2] **
					visited[i] = true; //뽑혔다는 표시
					// 다음 자리
					getResult(arr, output, visited, depth+1, n, r);
					// 여기로 돌아 왔다는 것은 하위에서 할 수 있는 것 다 한 뒤라는 얘기
					visited[i] = false; 
				}
			}
		}
	}

    // 배열 출력
    public void print(int[] arr) {
        for (int i = 0; i < arr.length ; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
}
