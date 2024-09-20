package Trees_DSA;
class BinarySearchTree{
	 Node root=null;
	class Node{
		Node left;
		Node right;
		int data;
		public Node(int data)
		{
			this.left=null;
			this.right=null;
			this.data=data;
		}
			
	}
	
	
	public Node insert(int data,Node root) {
		if(root==null) {
			return new Node(data);
		}
		
		if(root.data>data) {
			root.left=insert(data,root.left);
		}
		else
		{
			root.right=insert(data,root.right);
		}
		return root;
	}

	public void inOrder(Node root) {
		if(root==null) {
			return;
		}
		else
		{
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
	}
	
	public void preOrder(Node root) {
		if(root==null) return;
		else {
			System.out.println(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public void postOrder(Node root) {
		if(root==null) return;
		else {
			
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.data);
		}
	}
}
public class BinaryTree {
	
	public static void main(String args[])
	{
		BinarySearchTree tree=new BinarySearchTree();
		for(int i=1;i<6;i++)
		{
			tree.root=tree.insert(i,tree.root);
		}
//		tree.inOrder(tree.root);
//		tree.preOrder(tree.root);
		tree.postOrder(tree.root);
	
}
}
