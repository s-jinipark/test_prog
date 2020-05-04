package imsi.challenges.day10;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Test01 t = new Test01();
						

		int[] arr = {1, 1, 1, 1, 1};
		int tgt = 3;
		
		int an = t.solution(arr, tgt);
		
		System.out.println(an);


	}
	// 잘 모름 -> 검색해서..
	// (발췌) DFS 깊이탐색을 이용해서 문제를 풀어야 했다. DFS 문제는 Stack 또는 재귀를 통해 풀이가 가능하다. 나는 재귀를 이용해서 문제를 풀었다.
	// 결국은 배열에 있는 요소가 하나의 노드라고 비유한다면, 배열의 인덱스는 깊이라고 비유할 수 있다. 결국은 각 깊이에 대해 모두 탐색하게 되고, 
	// 모든 경우의 수를 모두 탐색하게 된다. 아래 이미지를 보면 이 문제를 DFS를 풀어야 하는 이유를 좀 더 잘 이해할 수 있을 것이다!
	public int solution(int[] numbers,  int target) {
		int answer = 0;
		
		//return answer;
		return dfs(numbers, target, 0, 0);
    }

    public int dfs(int[] numbers, int target, int index, int num) {
        if(index == numbers.length) {
            return num == target ? 1 : 0;
        } else {
            return dfs(numbers, target, index + 1, num + numbers[index])
                    + dfs(numbers, target, index + 1, num - numbers[index]);
        }
    }
	
}
