package tree;

public class SortedArrayToBST {

	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
		}
	}

	Node root;

	public static void main(String[] args) {

		int[] arr = { -10, -3, 0, 5, 9 };
		new SortedArrayToBST().sortedArrayToBST(arr);
	}

	public Node sortedArrayToBST(int[] nums) {

		int start = 0;

		int end = nums.length - 1;
		Node node = sortedArray(nums, start, end);
		
		return node;

	}

	Node sortedArray(int[] nums, int start, int end) {

		if (start > end) {
			return null;
		}

		int mid = (start + end) / 2;

		Node node = new Node(nums[mid]);

		node.left = sortedArray(nums, 0, mid - 1);
		node.right = sortedArray(nums, mid + 1, end);

		return node;
	}

}
