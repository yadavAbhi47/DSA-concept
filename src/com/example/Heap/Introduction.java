package com.example.Heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class Introduction {

    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(6);
        pq.offer(7);
        pq.offer(2);
        pq.offer(1);
        pq.add(3);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
