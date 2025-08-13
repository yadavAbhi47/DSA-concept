package com.example.DP;
import java.util.Arrays;

public class ClimbingStairs {
    //memoization
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

    //tabulation
    public static int climbingStairs_t(int n){
        int[] ways = new int[n+1];
        ways[0]=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                ways[i] = ways[i-1];
            } else{
                ways[i] = ways[i-1] + ways[i-2];
            }
        }
        return ways[n];
    }

    public static void main(String[] args){
        int n = 5;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int result = climbingStairs(n,dp);
        int answer = climbingStairs_t(n);
        System.out.println("Number of ways to climb the stairs are:- " + result + " by memoization");
        System.out.println("Number of ways to climb the stairs are:- " + answer + " by tabulation");

    }
}
