package DSA.Tree;

public class MyTree {

    private TreeNode root;

    public MyTree(int data) {
        this.root = new TreeNode(data);
    }

    public MyTree() {
    }

    static class TreeNode{
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

    }

    public void inorder(TreeNode root) {
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }

    public void preOrder(TreeNode root) {
        if(root == null) return;

        inorder(root.left);
        inorder(root.right);
        System.out.print(root.data + " ");

    }

    public void postOrder(TreeNode root) {
        if(root == null) return;

        System.out.print(root.data + " ");
        inorder(root.left);
        inorder(root.right);

    }

    public static void main(String[] args) {
        MyTree mt = new MyTree(10);
        mt.tree();
    }
}
