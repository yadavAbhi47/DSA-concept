package com.example.BinaryTree;
import java.util.*;
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
    static class Info{
        Node node;
        int hd;
        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root){
        //level order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;
        q.add(newInfo(root,0));
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
        Info newInfo = new Info(root,0);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);



    }
}
