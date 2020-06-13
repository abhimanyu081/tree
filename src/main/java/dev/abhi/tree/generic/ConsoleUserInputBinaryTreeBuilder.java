package dev.abhi.tree.generic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/***
 * Takes right and left child for each nodes through console
 * and then builds the tree
 * 
 * @author user
 *
 */
public class ConsoleUserInputBinaryTreeBuilder implements BinaryTreeBuilder<Integer> {

	private Queue<BinaryTreeGeneric<Integer>> queue = new LinkedList<>();

	@Override
	public BinaryTreeGeneric<Integer> buildUsingLevelOrder() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the root node");
		
		Integer rootValue = parseLine(br.readLine());

		BinaryTreeGeneric<Integer> bt = new BinaryTreeGeneric<Integer>(rootValue);
		queue.add(bt);

		while (!queue.isEmpty()) {

			BinaryTreeGeneric<Integer> node = queue.remove();

			System.out.println("Enter the left node of " + node.getData());
			Integer leftValue = parseLine(br.readLine());

			if (leftValue != -1) {

				BinaryTreeGeneric<Integer> left = new BinaryTreeGeneric<Integer>(leftValue);
				node.setLeftChild(left);
				queue.add(left);

			}

			System.out.println("Enter the right node of " + node.getData());
			Integer rightValue = parseLine(br.readLine());

			if (rightValue != -1) {

				BinaryTreeGeneric<Integer> right = new BinaryTreeGeneric<Integer>(rightValue);
				node.setRightChild(right);
				queue.add(right);

			}
		}

		return bt;

	}

	public Integer parseLine(String line) {

		if (line == null || "".equals(line.trim())) {
			return -1;
		}

		try {
			return Integer.parseInt(line);
		} catch (Exception e) {
			System.out.println("Error While Parsing the Input = " + line);
			throw new NumberFormatException("Error While Parsing the Input = " + line);
		}

	}

}
