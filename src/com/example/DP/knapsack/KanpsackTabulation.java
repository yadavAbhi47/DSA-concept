package com.example.DP.knapsack;

public class KanpsackTabulation {

    public static void Print(int[][] dp){
        for(int i = 0; i<dp.length;i++){
            for(int j = 0; j<dp[0].length;j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int knapsackTab(int[] val, int[] wt, int W){
        int n = val.length;
        int[][] dp = new int[n+1][W+1];

        for(int i =1; i<n+1;i++){
            for(int j =1; j<W+1;j++){
                int v = val[i-1];
                int w = wt[i-1];
                if(w<=j){
                    // include
                    int incProfit = v + dp[i-1][j-w];
                    // exclude
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else{
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        Print(dp);
        return dp[n][W];
    }

    public static void main(String[] args){
        int W = 7;
        int[] val = {15,14,10,45,30};
        int[] wt = {2,5,1,3,4};
        System.out.println(knapsackTab(val,wt,W));
    }
}
