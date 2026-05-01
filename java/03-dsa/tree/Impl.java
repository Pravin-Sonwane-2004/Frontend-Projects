package tree;

import java.util.ArrayDeque;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}


public class Impl {
   void main() {
     TreeNode root = new TreeNode(5);
       
        // root.left = new TreeNode(10);
        // root.right = new TreeNode(20);

        // root.right.left = new TreeNode(30);
        // root.right.right = new TreeNode(40);
        // levelOrder(root);
        
   }

    public static void levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        while (!queue.isEmpty()) {
        TreeNode current = queue.poll();
        System.out.println(current.val);

        if (current.left != null) queue.add(current.left);
        if (current.right != null) queue.add(current.right);
    }
    }














   public static void printTree(TreeNode root) {
    if(root == null) return;

    IO.print(root.val+ " ");
    printTree(root.left);
    printTree(root.right);
   }

   public static TreeNode swap(TreeNode root) {
    if(root == null) return null;
    TreeNode temp = root.right;
    root.right = root.left;
    root.left = temp;
    swap(root.left);
    swap(root.right);

    return root;
}
    public static int countNodes(TreeNode root) {
        if (root == null) return 0;

        int left = countNodes(root.left);
        int right = countNodes(root.right);

        return 1 + left + right;
    }

    public static void preorder(TreeNode root) {
    if(root == null) return;
        IO.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(TreeNode root) {
        preorder(root.left);
             IO.println(root.val);
        preorder(root.right);
}
public static void postorder(TreeNode root) {
     preorder(root.left);
        preorder(root.right);
        IO.println(root.val);
}
}
