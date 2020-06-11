package dev.abhi;

import java.io.IOException;

import dev.abhi.tree.BinaryTree;
import dev.abhi.tree.IterativePreOrder;

public class TreeDemo {
    public static void main(String[] args) throws IOException {
        BinaryTreeHelper bTreeHelper = new BinaryTreeHelper();
        BinaryTree bt = bTreeHelper.createBinaryTree();

        System.out.println("Pre Order Traversal");
        bTreeHelper.printPreOrder(bt);

        System.out.println();
        System.out.println("Post Order Traversal");
        bTreeHelper.printPostOrder(bt);

        System.out.println();
        System.out.println("In Order Traversal");
        bTreeHelper.printInOrder(bt);

        System.out.println("-----------------------ITERATIVE---------------------------");
        IterativePreOrder iterativePreOrder = new IterativePreOrder(bt);
        iterativePreOrder.traverse();
    }

}