package revCN;

import java.util.*;

public class TreeNode<T> {

	public T data;
	public ArrayList<TreeNode<T>> children;
	
	public TreeNode(T data) {
		this.data = data;
		this.children = new ArrayList<>();
	}


}
