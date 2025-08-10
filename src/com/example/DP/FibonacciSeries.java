package com.example.DP;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FibonacciSeries {
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

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        int result = fib(n,dp);
        System.out.println(result);
    }
}
