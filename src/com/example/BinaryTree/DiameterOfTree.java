package com.example.BinaryTree;

public class DiameterOfTree {

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
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        //Height of tree
        public static int height(Node root){
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh,rh)+1;
        }

        public static int diameterOfTree(Node root){
            if(root == null){
                return 0;
            }
            int leftDiameter = diameterOfTree(root.left);
            int rightDiameter = diameterOfTree(root.right);
            int lh = height(root.left);
            int rh = height(root.right);
            int SelfDiameter = (lh+rh+1);
            return Math.max(SelfDiameter, Math.max(leftDiameter,rightDiameter));

        }
    }
    public static void main(String[] args){
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        int diam = tree.diameterOfTree(root);
        System.out.println("The max diameter of tree is:- "+ diam);
    }
}
