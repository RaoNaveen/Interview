package BT;

import java.util.ArrayList;
import java.util.List;

public class PathOfANode {

	static List<Integer> list=new ArrayList<>();
	public static void main(String[] args) {
		PathOfANode path=new PathOfANode();
		Node root = new Node(15);
		root.left = new Node(10);
		root.right = new Node(20);
		root.left.left = new Node(8);
		root.left.right = new Node(12);
		root.right.left = new Node(16);
		root.right.right = new Node(25);
//		if(path.hasPath(root,25)) {
//			System.out.println(list);
//		}else {
//			System.out.println("No Path");
//		}
		System.out.println(path.hasPathSum(root, 33));
	}

	private boolean hasPath(Node root, int i) {
		if(root==null)
			return false;
		list.add(root.value);
		if(root.value==i)
			return true;
		if(hasPath(root.left, i) || hasPath(root.right, i))
			return true;
		list.remove(list.size()-1);
		return false;
	}
	
	public boolean hasPathSum(Node root,int sum) {
		if(root==null)
			return sum==0;
		else {
			int subSum=sum-root.value;
			if(subSum==0 && root.left==null && root.right==null)
				return true;
			if(hasPathSum(root.left, subSum) || hasPathSum(root.right, subSum))
				return true;
		}
		return false;
	}
}
