package dev.abhi.tree;

/****
 * 
 * @author Abhimanyu Utility methods for Tree
 * 
 */

public class Trees {

    // WE CAN COUNT THE NODE BY TRAVERSING THE
    // AND THEN GETTING THE LENGHT OF THE ARRAY
    // THIS WILL TAKE ON SPACE
    // ANOTHER APPROACH IS TO JUST COUNT THE NODES
    // THIS TAKES CONSTANT SPACE AND O(n) TIME
    public static int countNodes(BinaryTree bt) {

        if (bt != null) {

            int x = countNodes(bt.getLeft());
            int y = countNodes(bt.getRight());
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
    public static  int countNodesWithDegree2(BinaryTree bt){
        if(bt==null){
            return 0;
        }else if(bt.getLeft()!=null && bt.getRight()!=null) {
        	return countNodesWithDegree2(bt.getLeft())+countNodesWithDegree2(bt.getRight())+1;
        }else {
        	return countNodesWithDegree2(bt.getLeft())+countNodesWithDegree2(bt.getRight());
        }
    }

    /**
     * counts nodes with degree 0 or leaf nodes
     * 
     * @param bt
     * @return
     */
    public static int countLeafNodes(BinaryTree bt) {
    	if(bt==null) {
    		return 0;
    	}else if(bt.getLeft()==null && bt.getRight()==null) {
    		return countLeafNodes(bt.getLeft())+countLeafNodes(bt.getRight())+1;
    	}else {
    		return countLeafNodes(bt.getLeft())+countLeafNodes(bt.getRight());
    	}
    }
    
    /****
     * Count non leaf nodes
     * that is, nodes having degree 1 or 2
     * 
     * @param bt
     */
    public static int countNonLeafNodes(BinaryTree bt) {
    	if(bt==null) {
    		return 0;
    	}else if(bt.getLeft()==null || bt.getRight()==null) {
    		return countNonLeafNodes(bt.getLeft())+countNonLeafNodes(bt.getRight())+1;
    	}else {
    		return countNonLeafNodes(bt.getLeft())+countNonLeafNodes(bt.getRight());
    	}
    }
    
    /**
     * 
     * count nodes having exactly 1 degree
     * @param bt
     * @return
     */
    public static int countNodesWithDegree1(BinaryTree bt) {
    	if(bt==null) {
    		return 0;
    	}else if((bt.getLeft()==null && bt.getRight()!=null) || (bt.getLeft()!=null && bt.getRight()==null)) {
    		return countNodesWithDegree1(bt.getLeft())+countNodesWithDegree1(bt.getRight())+1;
    	}else {
    		
    		return countNodesWithDegree1(bt.getLeft())+countNodesWithDegree1(bt.getRight());
    	}
    }
   

}