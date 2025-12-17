package com.example.DP;

public class TargetSubSubset {
    public static void Print(boolean[][] arr){
        for(int i  = 0; i<arr.length;i++){
            for(int j =0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean targetSumSubset(int[] arr, int target){
        int n = arr.length;
        boolean[][] dp = new boolean[n+1][target+1];
        for(int i = 0; i<=n;i++){
            dp[i][0] = true;
        }
        for(int i = 1; i<n+1;i++){
            for(int j = 1; j<target+1;j++){
                int v = arr[i-1];

                if( v<=j && dp[i-1][j-v] == true){
                    // include
                    dp[i][j] = true;
                }
                // exclude
                else if(dp[i-1][j] == true){
                    dp[i][j] = true;
                }
            }
        }
        Print(dp);
        return dp[n][target];
    }

    public static void main(String[] args) {
        int[] arr = {4,2,7,1,3};
        int target = 10;
        System.out.println(targetSumSubset(arr,target));
    }
}
