/**
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * Return it in List form
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stck = new Stack<TreeNode>();
        List<Integer> lst = new LinkedList<Integer>();
		if (root == null)
		    return lst;
		stck.push(root);
		while (stck.size()>0){
			TreeNode curr = stck.pop(); 
			// Print current node
			//System.out.println(curr);
			lst.add(curr.val);
			TreeNode n = curr.right;
			// right node is printed later, so push it first
			// remember lifo, so this will get touched later on
			if (n!=null) stck.push(n);
			n = curr.left;
			// left node will be printed first so push it now
			// will be popped in next iteration
			if (n!=null) stck.push(n);
        }
        return lst;
}}