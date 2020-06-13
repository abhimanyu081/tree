package dev.abhi.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeHelper {

    Queue<BinaryTree> q = new LinkedList<>();
    
    
    

    public BinaryTree createBinaryTree() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the root node");
        Integer rootValue = Integer.parseInt(br.readLine());

        BinaryTree bt = new BinaryTree(rootValue);
        q.add(bt);

        while (!q.isEmpty()) {

            BinaryTree node = q.remove();

            System.out.println("Enter the left node of " + node.getValue());
            Integer leftValue = Integer.parseInt(br.readLine());

            if (leftValue != -1) {

                BinaryTree left = new BinaryTree(leftValue);
                node.setLeft(left);
                q.add(left);

            }

            System.out.println("Enter the right node of " + node.getValue());
            Integer rightValue = Integer.parseInt(br.readLine());

            if (rightValue != -1) {

                BinaryTree right = new BinaryTree(rightValue);
                node.setRight(right);
                q.add(right);

            }
        }

        return bt;

    }

    public void printPostOrder(BinaryTree root) {

        if (root != null) {

            printPreOrder(root.getLeft());
            printPreOrder(root.getRight());
            System.out.print(root.getValue() + ",");
        }

    }

    public void printPreOrder(BinaryTree root) {

        if (root != null) {
            System.out.print(root.getValue() + ",");
            printPreOrder(root.getLeft());
            printPreOrder(root.getRight());
        }

    }

    public void printInOrder(BinaryTree root) {

        if (root != null) {

            printPreOrder(root.getLeft());
            System.out.print(root.getValue() + ",");
            printPreOrder(root.getRight());
        }

    }

}