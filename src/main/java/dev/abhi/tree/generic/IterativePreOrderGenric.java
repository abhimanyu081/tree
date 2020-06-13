package dev.abhi.tree.generic;

import java.util.ArrayDeque;
import java.util.Deque;

public class IterativePreOrderGenric {

	private BinaryTreeGeneric<Integer> bt;

	Deque<BinaryTreeGeneric<Integer>> stack;

	public IterativePreOrderGenric(BinaryTreeGeneric<Integer> bt) {
		this.bt = bt;
		stack = new ArrayDeque<BinaryTreeGeneric<Integer>>();
	}

	public void traverse() {
		BinaryTreeGeneric<Integer> temp = bt;
		while (temp != null || !stack.isEmpty()) {

			if (temp != null) {

				System.out.print(temp.getData() + ",");
				stack.push(temp);
				temp = temp.getLeftChild();
			} else {
				temp = stack.pop();
				temp = temp.getRightChild();
			}
		}

	}

}