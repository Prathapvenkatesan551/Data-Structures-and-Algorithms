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
	
	public Node search(int data,Node root) {
		if(root==null || root.data==data) return root;
		if(data>root.data) {
			return search(data,root.right);
		}
		else
		{
			return search(data,root.left);
		}
	}
	
	public Node delete(Node root,int data) {
		if(root==null) return root;
		if(data>root.data) {
			root.right=delete(root.right,data);
		}
		else if(data<root.data){
			
			root.left=delete(root.left,data);
		}
		else
		{
			
			if(root.left==null) {
				return root.right;
			}
			else if(root.right==null) {
				return root.left;
			}
			
			root.data=minRoot(root.right).data;
			root.right=delete(root.right,root.data);
		}
		return root;
	}
	public Node minRoot(Node root) {
	
		if(root.left==null) return root;
		else {
			return minRoot(root.left);
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
		if(tree.search(3,tree.root)!=null) {
			System.out.println("Exist");
		}
		else
		{
			System.out.println("Not Exist");
		}
		
		tree.root=tree.delete(tree.root, 0);
		tree.inOrder(tree.root);
	
}
}
