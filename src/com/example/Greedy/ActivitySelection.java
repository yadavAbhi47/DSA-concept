package com.example.Greedy;

import java.util.*;

public class ActivitySelection {
    public static void main(String[] args){
        int[] start = {1,3,0,5,8,8};
        int[] end = {2,4,6,7,9,8};

        //sorting
        int[][] activities = new int[start.length][3];
        for(int i = 0; i< start.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // sorting using lambda function
        Arrays.sort(activities, Comparator.comparingInt(a ->a[2]));


        int maxAct;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=1; i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("max activities = " + maxAct);
        for(int a : ans){
            System.out.print("A"+ a +" ");
        }
        System.out.println();

    }
}
