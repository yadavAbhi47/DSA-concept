package com.example.DP;
import java.util.Arrays;

public class ClimbingStairs {
    public static int climbingStairs(int n, int[] dp){
        if(n == 0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        dp[n] = climbingStairs(n-1,dp)+climbingStairs(n-2,dp);
        return dp[n];
    }

    public static void main(String[] args){
        int n = 5;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int result = climbingStairs(n,dp);
        System.out.println("Number of ways to climb the stairs are:- " + result);
    }
}
