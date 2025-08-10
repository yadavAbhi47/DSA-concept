package com.example.DP;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FibonacciSeries {

    // Memoization
    public static int fib(int n, int[] dp){
        if(n == 0 || n==1){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }

        dp[n] = fib(n-1, dp) + fib(n-2, dp);
        return dp[n];
    }

    //tabulation
    public static int fibo(int n){
        int[] dp = new int[n+1];
        dp[1] = 1;
        for(int i = 2; i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        int result = fib(n,dp);
        System.out.println("By Memoization result:- "+result);
        int ans = fibo(n);
        System.out.println("By tabulation:- "+ans);
    }
}
