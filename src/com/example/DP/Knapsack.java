package com.example.DP;

import java.util.Arrays;

public class Knapsack {

    // recursion + memoization

    public static int knapsack(int[] val,int[] wt, int W, int n, int[][] dp){
        if(W == 0 || n==0){
            return 0;
        }
        if(dp[n][W] != -1){
            return dp[n][W];
        }
        if(wt[n-1] <= W){ //valid
            // include
            int ans1 = val[n-1]+knapsack(val,wt,W-wt[n-1],n-1, dp);
            //exclude
            int ans2 = knapsack(val,wt,W,n-1, dp);
            dp[n][W] =  Math.max(ans1,ans2);
            return dp[n][W];
        } else{
            dp[n][W] = knapsack(val,wt,W,n-1, dp);
            return dp[n][W];
        }
         
    }


    public static void main(String[] args){
        int W = 7;
        int[] val = {15,14,10,45,30};
        int[] wt = {2,5,1,3,4};
        int[][] dp = new int[val.length+1][W+1];
        for(int[] row:dp){
            Arrays.fill(row, -1);
        }
        System.out.println(knapsack(val,wt,W,val.length,dp));
    }
}
