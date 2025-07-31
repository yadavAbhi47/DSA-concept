package com.example.BinaryTree;

public class SumOfNode {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;
        }
    }
    static  class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] ==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right= buildTree(nodes);
            return newNode;
        }
    }

    //Sum of nodes in a binary tree;
    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int lh = sumOfNodes(root.left);
        int rh = sumOfNodes(root.right);
        return lh+rh+root.data;
    }


    public static void main(String[] args){
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        int value = sumOfNodes(root);
        System.out.println("Sum of the values of nodes are:- " + value);
        System.out.println("print node");

    }
}
