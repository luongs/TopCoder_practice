import java.util.LinkedList;
import java.util.Queue;


public class Tree {

	class Node{
		int key; 
		String value; 
		
		Node leftChild; 
		Node rightChild;
		
		Node (int key, String value){
			this.key = key; 
			this.value= value;
		}
		
		public String toString(){
			return value+" has the key "+key;
		}
	}
	
	Node root; 
	
	public void insertNode(int key, String value){
		Node newNode = new Node(key, value);		
		if (root == null){
			// Create root for tree if tree is empty
			root = newNode;
		}
		else{
			// focus node will iterate through tree
			// set as root at start
			Node currentNode = root;
			// parent must be saved seperately
			Node parent; 
			while (true){
				parent = currentNode; 
				
				if (key<currentNode.key){
					currentNode = currentNode.leftChild;
					// if no left child present then set 
					// new node on it
					if (currentNode == null){
						// must set node one away
						parent.leftChild = newNode;
						// end function
						return;
					}
				}
				else { // key>currentNode.key
					currentNode = currentNode.rightChild;
					// no child therefore new node can be added
					if (currentNode == null)
						parent.rightChild = newNode;
						return;
				}
			}
		 }
	}
	
	//TODO: Implement each traversal iteratively
	// http://en.wikipedia.org/wiki/Tree_traversal
	
	// inOrder, preOrder, postOrder are all DFS traversal types
	public static void inOrderTraverse(Node current){
		if (current==null)
			return; 
		else{
			inOrderTraverse(current.leftChild);
			System.out.println(current);
			inOrderTraverse(current.rightChild);
		}
	}
	
	public static void preOrderTraverse(Node current){
		if (current == null)
			return; 
		else{
			System.out.println(current);
			inOrderTraverse(current.leftChild);
			inOrderTraverse(current.rightChild);
		}
	}
	
	public static void postOrderTraverse(Node current){
		// Traverse left subtree followed by right subtree and finally parent
		if (current==null)
			return;
		else{
			inOrderTraverse(current.leftChild);
			inOrderTraverse(current.rightChild);
			System.out.println(current);
		}
	}
	
	// BFS traversal type
	public static void levelOrderTraverse(Node current){
		Queue<Node> q = new LinkedList<Node>();
		q.add(current);
		// Iterate through each level until queue is empty
		while (!q.isEmpty()){
			Node nd = q.remove();
			// implementation of visit()
			System.out.println(nd);
			if (nd.leftChild != null)
				q.add(nd.leftChild);
			if (nd.rightChild != null)
				q.add(nd.rightChild);
		}
	}
	
	// check if tree is BST 
	public static boolean isBST(Node current, int max, int min){
		if (current == null)
			return true;
		if (current.key > max || current.key < min){
			return false; 
		}
		return (isBST(current.leftChild, current.key, min) && (isBST(current.rightChild, max, current.key)));
	}
	
	//More info and methods: 
	//http://en.wikipedia.org/wiki/Binary_search_tree
	
	public static void main(String[] args) {
		Tree tr = new Tree();
		tr.insertNode(20, "a");
		tr.insertNode(10, "b");
		tr.insertNode(30, "c");
		tr.insertNode(5, "d");
		tr.insertNode(40, "e");
		
		inOrderTraverse(tr.root);
		if (isBST(tr.root, Integer.MAX_VALUE, Integer.MIN_VALUE))
			System.out.println("Is a BST");
		else
			System.out.println("Is not a BST");
		//preOrderTraverse(tr.root);
		//postOrderTraverse(tr.root);
		//levelOrderTraverse(tr.root);
		

	}

}
