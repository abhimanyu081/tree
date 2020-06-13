package dev.abhi.tree.generic;

public class TreesUtilGeneric<T> {

	// WE CAN COUNT THE NODE BY TRAVERSING THE
	// AND THEN GETTING THE LENGHT OF THE ARRAY
	// THIS WILL TAKE ON SPACE
	// ANOTHER APPROACH IS TO JUST COUNT THE NODES
	// THIS TAKES CONSTANT SPACE AND O(n) TIME
	public  int countNodes(BinaryTreeGeneric<T> bt) {

		if (bt != null) {

			int x = countNodes(bt.getLeftChild());
			int y = countNodes(bt.getRightChild());
			return 1 + x + y;
		}
		return 0;

	}

	/****
	 * 
	 * Countes nodes having degree 2
	 * 
	 * @param bt
	 * @return
	 */
	public  int countNodesWithDegree2(BinaryTreeGeneric<T> bt) {
		if (bt == null) {
			return 0;
		} else if (bt.getLeftChild() != null && bt.getRightChild() != null) {
			return countNodesWithDegree2(bt.getLeftChild()) + countNodesWithDegree2(bt.getRightChild()) + 1;
		} else {
			return countNodesWithDegree2(bt.getLeftChild()) + countNodesWithDegree2(bt.getRightChild());
		}
	}

	/**
	 * counts nodes with degree 0 or leaf nodes
	 * 
	 * @param bt
	 * @return
	 */
	public  int countLeafNodes(BinaryTreeGeneric<T> bt) {
		if (bt == null) {
			return 0;
		} else if (bt.getLeftChild() == null && bt.getRightChild() == null) {
			return countLeafNodes(bt.getLeftChild()) + countLeafNodes(bt.getRightChild()) + 1;
		} else {
			return countLeafNodes(bt.getLeftChild()) + countLeafNodes(bt.getRightChild());
		}
	}

	/****
	 * Count non leaf nodes that is, nodes having degree 1 or 2
	 * 
	 * @param bt
	 */
	public  int countNonLeafNodes(BinaryTreeGeneric<T> bt) {
		if (bt == null) {
			return 0;
		} else if (bt.getLeftChild() != null || bt.getRightChild() != null) {
			return countNonLeafNodes(bt.getLeftChild()) + countNonLeafNodes(bt.getRightChild()) + 1;
		} else {
			return countNonLeafNodes(bt.getLeftChild()) + countNonLeafNodes(bt.getRightChild());
		}
	}

	/**
	 * 
	 * count nodes having exactly 1 degree
	 * 
	 * @param bt
	 * @return
	 */
	public  int countNodesWithDegree1(BinaryTreeGeneric<T> bt) {
		if (bt == null) {
			return 0;
		} else if ((bt.getLeftChild() == null && bt.getRightChild() != null)
				|| (bt.getLeftChild() != null && bt.getRightChild() == null)) {
			return countNodesWithDegree1(bt.getLeftChild()) + countNodesWithDegree1(bt.getRightChild()) + 1;
		} else {

			return countNodesWithDegree1(bt.getLeftChild()) + countNodesWithDegree1(bt.getRightChild());
		}
	}

}
