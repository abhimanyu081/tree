package dev.abhi.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class IterativePreOrder {

    private BinaryTree bt;

    Deque<BinaryTree> stack;

    public IterativePreOrder(BinaryTree bt) {
        this.bt = bt;
        stack = new ArrayDeque<BinaryTree>();
    }

    public void traverse() {
        BinaryTree temp = bt;
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

}