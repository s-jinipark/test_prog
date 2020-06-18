package imsi.inflearn.test2020.C2.T01;

public class RecursiveTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 재귀호출 테스트 (순열 구하기) 
		// N 개의 알파벳 중에서 R 개를 나열할 수 있는 경우를 모두 출력
		
		RecursiveTest t = new RecursiveTest();
		int n = 3;
		int r = 2; // 3개 중에 2개
        int[] arr = {1, 2, 3};
		
		t.solution(n, r, arr);
	}
	
	public void solution(int n, int r, int[] arr) {
		// 변수		설명
		// arr		r 개를 뽑기 위한 n 개의 값
		// output	뽑힌 r 개의 값
		// visited	중복해서 뽑지 않기 위해 체크하는 값

        int[] output = new int[n];
        boolean[] visited = new boolean[n];
        
		getResult(arr, output, visited, 0, n, r);
		
	}
	
	// visited 배열을 이용한 순열
	// depth : n중  for 문 (depth 번째 for 문)
	public void getResult(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
		if (depth >= r) { // 이미 r 개의 for 문이 나왔다
			print(output, r);
		} else {
			
		    for (int i=0; i<n; i++) { // n중 for 문 돌리는 것
		        if (visited[i] != true) { // 나오지 않았다
		            //visited[i] = true;
		            output[depth] = arr[i]; 
		            visited[i] = true; // i 는 이제 나왔어
		            getResult(arr, output, visited, depth + 1, n, r);  // 다음 for 문 실행    
		            // depth 번째에 i 를 넣는 모든 경우를 이미 다 고려 했음
		            output[depth] = 0; // 이 줄은 없어도 됨
		            visited[i] = false;; // 뒤에서 빼야 되니까...
		        }
		    }
		}
	}
    // 배열 출력
    public void print(int[] arr, int r) {
        for (int i = 0; i < r; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
}
