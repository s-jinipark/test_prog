package kr.co.infopub.chapter.s107;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Node> list = new ArrayList<>();
		list.add(new Node(6, 3));
		list.add(new Node(1, 10));
		list.add(new Node(5, 5));
		list.add(new Node(2, 7));
		list.add(new Node(4, 3));
		list.add(new Node(3, 1));

		for (int i=0; i<list.size() ; i++) {
			System.out.println(">" + list.get(i).idx + " " + list.get(i).val);
		}
		System.out.println("---------------");
		// val 기준으로 정렬
		
		Collections.sort(list, new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				return o1.val - o2.val;
			}
		});
		
		for (int i=0; i<list.size() ; i++) {
			System.out.println(">" + list.get(i).idx + " " + list.get(i).val);
		}
		
		System.out.println("---------------");
		// 동일 val 있을 경우는 index 정렬  

		Collections.sort(list, new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				if (o1.val == o2.val) {
					return o1.idx - o2.idx;
				} else {
					return o1.val - o2.val; // 기존과 동일
				}
			}
		});
		
		for (int i=0; i<list.size() ; i++) {
			System.out.println(">" + list.get(i).idx + " " + list.get(i).val);
		}
	}


}

class Node {
	int idx;
	int val;
	
	public Node(int idx, int val) {
		this.idx = idx;
		this.val = val;
	}
}
