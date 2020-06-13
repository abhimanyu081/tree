package dev.abhi;

import java.io.IOException;

import dev.abhi.tree.generic.BinaryTreeBuilder;
import dev.abhi.tree.generic.BinaryTreeGeneric;
import dev.abhi.tree.generic.ConsoleUserInputBinaryTreeBuilder;
import dev.abhi.tree.generic.IterativePreOrderGenric;
import dev.abhi.tree.generic.TreesUtilGeneric;

/**
 * Hello world!
 *
 */
public class GenericBinaryTreeDemo 
{
    public static void main( String[] args ) throws IOException
    {
    	BinaryTreeBuilder<Integer> btBuilder = new ConsoleUserInputBinaryTreeBuilder();
    	BinaryTreeGeneric<Integer> bt=btBuilder.buildUsingLevelOrder();
    	
    	IterativePreOrderGenric iterativePreOrderGenric = new IterativePreOrderGenric(bt);
    	
    	iterativePreOrderGenric.traverse();
    	
    	TreesUtilGeneric<Integer> treeUtil = new TreesUtilGeneric<Integer>();
    	
    	System.out.println("Nodes count = "+treeUtil.countNodes(bt));
    	System.out.println("Nodes with degree 2 = "+treeUtil.countNodesWithDegree2(bt));
    	System.out.println("Nodes with degree 1 = "+treeUtil.countNodesWithDegree1(bt));
    	System.out.println("Nodes with degree 0 = "+treeUtil.countLeafNodes(bt));
    	System.out.println("Nodes with degree 1 OR 2 = "+treeUtil.countNonLeafNodes(bt));
    }
}
