package imsi.inflearn.top50.C1StringArray.T01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
/*
* Arrays.sort() 
* time complexity of O(n logn n) 
* space complexity of O(1).
*/


//class Interval{
//	int start;
//	int end;
//	Interval(){
//		this.start = 0;
//		this.end =0;
//	}
//	Interval(int s, int e){
//		this.start = s;
//		this.end = e;
//	}
//}

//-> Interval 은  1 에 있는 것 사용
// start 로 소팅 -> 비교 -> 현재의 start 가 앞의 end 와 겹치지 않아야


public class MeetingRooms2 {
	public static void main(String[] args) {
		MeetingRooms2 a = new MeetingRooms2();
		
		// [1]
//		Interval in1 = new Interval(15,20);
//		Interval in2 = new Interval(5,10);
//		Interval in3 = new Interval(0,30);
//		
//		Interval[] intervals = {in1, in2,in3};
		
		// [2]
		Interval in1 = new Interval(7,10);
		Interval in2 = new Interval(2,4);
		
		Interval[] intervals = {in1, in2};	
		System.out.println(a.solve(intervals));
	}
	
	public boolean solve(Interval[] intervals) {
		boolean rtn = true;

//START--------------------------------------------------		
		// 1 null 체크
		if (intervals==null) return false;
		print(intervals);
		Arrays.sort(intervals, Comp);
		System.out.println("==========");
		print(intervals);
		
		// 2 비교
		// 이전 것 참조하기 위해 1부터 시작
		for (int i=1 ; i<intervals.length ; i++) {
			if (intervals[i-1].end > intervals[i].start) {
				return false;
			}
		}
		
//END  --------------------------------------------------
		
		// 번외 - sort 테스트
		int[] test = {2,6,8,9,5};
		
		Arrays.sort(test);
		
		for (int i=0; i< test.length ; i++) {
			System.out.println(">" + test[i]);
		}
		
		// 내림차순 소트
		//Arrays.sort(test, Dcomp);
		// int 로 하면 안됨
		Integer[] test2 = {2,6,8,9,5};
		//Arrays.sort(test2, Dcomp);
		Arrays.sort(test2, Collections.reverseOrder() );
		System.out.println("==========");
		for (int i=0; i< test2.length ; i++) {
			System.out.println(">" + test2[i]);
		}
		
		// 스트링도 되나?
		String[] test3 = {"AK", "CA", "BB", "BA"};
		Arrays.sort(test3, Collections.reverseOrder()); // ***
		System.out.println("==========");
		for (int i=0; i< test3.length ; i++) {
			System.out.println(">" + test3[i]);
		}
		return rtn;
		
	}
	public void print(Interval[] intervals) {
		for(int i=0; i<intervals.length; i++) {
			Interval in = intervals[i];
			System.out.println(in.start+" "+in.end);
			
		}
	}

	
	Comparator<Interval> Comp = new Comparator<Interval>() {

		@Override
		public int compare(Interval o1, Interval o2) {
			// TODO Auto-generated method stub
			//return 0;
			return o1.start - o2.start; // 오름 차순
			//return o2.start - o1.start; // 내림 차순
		}

	};
	

	Comparator<Integer> Dcomp = new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o2-o1;
		}
		
	};
}
