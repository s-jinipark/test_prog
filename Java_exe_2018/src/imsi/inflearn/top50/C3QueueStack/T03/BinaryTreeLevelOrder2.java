package imsi.inflearn.top50.C3QueueStack.T03;

import java.util.*;


class Tnode{
	int val;
	Tnode left, right;
	Tnode(int x){
		this.val=x;
	}
}
public class BinaryTreeLevelOrder2{
	public static void main(String[] args) {
		Tnode root = new Tnode(1);
		root.left = new Tnode(2);
		root.right = new Tnode(3);
		root.left.left = new Tnode(4);
		root.left.right = new Tnode(5);
		//[2]
		root.right.left = new Tnode(6);
		root.right.right = new Tnode(7);
		
		System.out.println(solve2(root));
	}
	public static List<List<Integer>> solve2(Tnode root) {
		List<List<Integer>> result = new ArrayList<>();
		// ** List ÀÇ List
		
		Queue<Tnode> queue = new LinkedList<>();
		queue.offer(root);
		
		while (!queue.isEmpty()) {
			
			int size = queue.size();
			
			List<Integer> list = new ArrayList<>();
			
			for (int i=0 ; i< size; i++) {
				Tnode node = queue.poll();
				list.add(node.val); // °ª add
				if (node.left != null ) {
					queue.offer(node.left);
				}
				if (node.right != null ) {
					queue.offer(node.right);
				}
			}
			result.add(list);
		}

		return result;
	}
}

