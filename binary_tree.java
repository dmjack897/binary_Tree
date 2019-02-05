package binary_tree;

class Node
{
	int data;
	Node left;
	Node right;
}
class Tree
{
	public Node root;
	
	public void setNode(Node node)
	{
		this.root = node;
	}
	public Node getNode()
	{
		return root;
	}
	public Node makeNode(Node left,Node right,int data)
	{
		Node node = new Node();
		node.data = data;
		node.left = left;
		node.right = right;
		
		return node;
	}
	public void inorder(Node node)
	{
		if(node !=null)
		{
			inorder(node.left);
			System.out.println(node.data);
			inorder(node.right);
		}
	}
	public void preorder(Node node)
	{
		if(node != null)
		{
			System.out.println(node.data);
			preorder(node.left);
			preorder(node.right);
		}
	}
	public void postorder(Node node)
	{
		if(node != null)
		{
			postorder(node.left);
			postorder(node.right);
			System.out.println(node.data);
		}
		
	}
}
public class binary_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t = new Tree();
		Node n4 = t.makeNode(null, null, 4);
		Node n5 = t.makeNode(null, null, 5);
		Node n2 = t.makeNode(n4, n5, 2);
		Node n3 = t.makeNode(null, null, 3);
		Node n1 = t.makeNode(n2, n3, 1);
		t.setNode(n1);
		t.inorder(t.getNode());
		System.out.println();
		t.preorder(t.getNode());
		System.out.println();
		t.postorder(t.getNode());
		
	}

}
/*
class Node
{
	int data;
	Node left;
	Node right;
}
class Tree
{
	public Node root;
	public void setNode(Node node)
	{
		this.root = node;
	}
	public Node getNode()
	{
		return root;
	}
	public Node makeNode(Node left,Node right,int data)
	{
		Node node = new Node();
		node.data = data;
		node.left = left;
		node.right = right;
		return node;
	}
	public void preorder(Node node)
	{
		if(node !=null)
		{
			
		}
	}
}
*/