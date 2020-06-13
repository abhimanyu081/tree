package dev.abhi.tree.generic;

public class BinaryTreeGeneric<T> {

	private T data;
	private BinaryTreeGeneric<T> rightChild;
	private BinaryTreeGeneric<T> leftChild;

	public BinaryTreeGeneric(T data) {
		super();
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public BinaryTreeGeneric<T> getRightChild() {
		return rightChild;
	}

	public void setRightChild(BinaryTreeGeneric<T> rightChild) {
		this.rightChild = rightChild;
	}

	public BinaryTreeGeneric<T> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BinaryTreeGeneric<T> leftChild) {
		this.leftChild = leftChild;
	}

}
