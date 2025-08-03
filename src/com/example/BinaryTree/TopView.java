package com.example.BinaryTree;

public class TopView {
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



    public static void main(String[] args){
        /*
         *           1
         *         /   \
         *       2       3
         *     /  \     /  \
         *    4    5   6    7
         * */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /*
         *       2
         *     /  \
         *    4    5
         */

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);


    }
}
