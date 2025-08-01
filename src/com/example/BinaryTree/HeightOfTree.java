package com.example.BinaryTree;

public class HeightOfTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    static class BinaryTree{
        static int idx = -1;
        public static Node BuildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);
            return newNode;
        }

        public static int Height(Node root){
            if(root == null){
                return 0;
            }

            int lh = Height(root.left);
            int rh = Height(root.right);
            return Math.max(lh,rh)+1;
        }
    }



    public static void main(String[] args){
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        int h = tree.Height(root);
        System.out.println("Height of tree is:- "+h);
    }

}
