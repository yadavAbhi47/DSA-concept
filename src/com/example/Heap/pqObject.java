package com.example.Heap;


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class pqObject {

    static class Student{
        String name;
        int rollno;

        Student(String name, int rollno) {
            this.name = name;
            this.rollno = rollno;
        }

        public String toString(){
            return "name -> " + name + " , rollno -> " +rollno;
        }

    }
    public static void main(String[] args) {

        Queue<Student> pq = new PriorityQueue<>((a,b)-> b.rollno - a.rollno);
        pq.offer(new Student("ram", 10));
        pq.offer(new Student("shyam", 8));
        pq.offer(new Student("sita", 2));
        pq.offer(new Student("laxman", 1));
        pq.offer(new Student("krishna", 4));

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
