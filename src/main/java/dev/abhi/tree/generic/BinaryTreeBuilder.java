package dev.abhi.tree.generic;

import java.io.IOException;

public interface BinaryTreeBuilder<T> {

	public BinaryTreeGeneric<T> buildUsingLevelOrder() throws IOException;
	
}
