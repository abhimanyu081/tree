package dev.abhi.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class PreOrderTraverser implements TreeTraverser {

    private Deque<BinaryTree> stack = new ArrayDeque<BinaryTree>();

    @Override
    public void traverse(BinaryTree root) {

        BinaryTree temp = root;

        while (temp != null || !stack.isEmpty()) {

            if (temp != null) {

                System.out.print(temp.getValue() + ",");
                stack.push(temp);
                temp = temp.getLeft();
            } else {
                temp = stack.pop();
                temp = temp.getRight();
            }

        }

    }

    @Override
    public void traverseRecursive(BinaryTree root) {
        BinaryTree temp = root;
        if (root != null) {
            System.out.print(temp.getValue() + ",");
            traverseRecursive(temp.getLeft());
            traverseRecursive(temp.getRight());
        }
    }

}