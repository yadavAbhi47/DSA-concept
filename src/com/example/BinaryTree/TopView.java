package com.example.BinaryTree;

import java.util.*;

public class TopView {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Pair {
        Node node;
        int hd;

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        if (root == null) return;

        Map<Integer, Integer> topMap = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair curr = queue.poll();
            int hd = curr.hd;
            Node temp = curr.node;

            // Store the first node encountered at each horizontal distance
            if (!topMap.containsKey(hd)) {
                topMap.put(hd, temp.data);
            }

            if (temp.left != null) {
                queue.add(new Pair(temp.left, hd - 1));
            }

            if (temp.right != null) {
                queue.add(new Pair(temp.right, hd + 1));
            }
        }

        // Print top view
        for (int val : topMap.values()) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        /*
         *           1
         *         /   \
         *       2       3
         *     /  \     /  \
         *    4    5   6    7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Top View of the Binary Tree:");
        topView(root);
    }
}
