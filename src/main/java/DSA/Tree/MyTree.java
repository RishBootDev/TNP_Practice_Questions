package DSA.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MyTree {

    private TreeNode root;
    private int count;

    public MyTree(int data) {
        this.root = new TreeNode(data);
    }

    public MyTree() {
    }

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void tree() {

        TreeNode t1 = new TreeNode(20);
        TreeNode t2 = new TreeNode(30);
        TreeNode t3 = new TreeNode(40);
        TreeNode t4 = new TreeNode(20);

        this.root.left = t1;
        this.root.right = t2;

        t1.left = t3;
        t1.right = t4;

        inorder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        preOrder(root);

        countNode(root);
        System.out.println("The node count is "+this.count);

        System.out.println(checkFull(root));

    }


    public void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void preOrder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        inorder(root.right);
        System.out.print(root.data + " ");

    }

    public void postOrder(TreeNode root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        inorder(root.left);
        inorder(root.right);

    }

    public static void main(String[] args) {
        MyTree mt = new MyTree(10);
        mt.tree();
    }

    public boolean checkFull(TreeNode root) {

        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        if (root.left != null && root.right == null) return false;
        if (root.left == null) return false;

        boolean left = checkFull(root.left);
        boolean right = checkFull(root.right);

        return left && right;
    }

    public void countNode(TreeNode root) {
        if (root == null) return;

        countNode(root.left);
        this.count++;
        countNode(root.right);
    }

    // this is the approach for the complete binary tree for the complete binary tree
    public boolean checkCompleteBT(TreeNode root) {
        if (root == null) return true;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean nullFound = false;

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current == null) {
                nullFound = true;
            } else {
                if (nullFound) {
                    return false;
                }
                queue.add(current.left);
                queue.add(current.right);
            }
        }

        return true;
    }


    // this is the approach for the dfs
    public boolean checkCBT(TreeNode root, int index, int count) {

        if(root == null) return true;
        else if(index >= count) return false;
        return checkCBT(root.left, 2*index + 1, count) &&
                checkCBT(root.right, 2*index + 2, count);

    }
}


