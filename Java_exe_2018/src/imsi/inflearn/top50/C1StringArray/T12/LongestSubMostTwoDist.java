package imsi.inflearn.top50.C1StringArray.T12;

import java.util.HashMap;
import java.util.Map;

public class LongestSubMostTwoDist {


	public static void main(String[] args) {
		String s = "ccaabbb";
		System.out.println(solve(s));
	}
	
    public static int solve(String s) {
    	// 1
    	int start =0, end =0, length =0, counter =0;
    	Map<Character, Integer> map = new HashMap<>();
    	
    	// 2
    	while (end < s.length() ) {
    		char endChar = s.charAt(end); // 0 부터 
    		map.put(endChar, map.getOrDefault(endChar, 0)+1);
    		
    		if (map.get(endChar) == 1) counter++; // 1 일 때 한 번씩 +
    		end++;
    		// 3 
    		while (counter > 2) { // 3가지 종류의 문자열 등장
    			char startChar = s.charAt(start);
    			map.put(startChar, map.get(startChar)-1);
    			if (map.get(startChar)==0) counter--;
    			start++;
    		}
    		
    		length = Math.max(length, end-start); // 가장 긴 길이를 length 에 저장
    	}
    	return length;

    }
	
}
