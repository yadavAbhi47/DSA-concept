package com.example.practice;

import java.util.Arrays;

public class TriangularSum {
    public static int TrangularSum(int[] nums) {
        int n = nums.length;
        int[] pascal = pascal(n - 1);  // use n-1 row
        int result = 0;

        for (int i = 0; i < n; i++) {
            result = (result + pascal[i] * nums[i]) % 10;
        }
        return result;
    }

    // Generate Pascal row (mod 10) for n
    public static int[] pascal(int n) {
        int[] pascal = new int[n + 1];
        pascal[0] = 1;
        for (int i = 0; i < n; i++) {
            pascal[i + 1] = (int)(((long)pascal[i] * (n - i)) / (i + 1) % 10);
        }
        return pascal;
    }

    public static void main(String[] args) {
        int[] arr = {5,3,5,1,7,2,6,6,4,0,4,6,4,3,1,4,0,8,2,4,3,4,9,0,5,5,0,4,6,0,6,3,4,2,2,7,3,8,1,0,5,3,1,9,0,2,2,5,8,6,2,3,2,3,5,8,5,4,1,2,0,9,3,4,4,4,1,5,1,9,2,0,8,4,3,2,4,1,9,2,4,9,2,0,1,2,3,3,8,6,0,7,3,5,7,7,9,2,5,3,2,3,4,9,3,3,5,3,4,0,7,2,1,2,5,0,5,0,6,9,7,6,5,3,2,9,8,9,4,1,8,4,8,3,7,2,2,0,1,2,3,2,2,5,8,0,1,1,3,3,3,8,4,5,6,2,6,5,7,0,4,6,6,2,2,6,7,6,1,2,7,7,6,0,4,9,9,8,1,8,3,3,5,4,5,0,9,4,0,8,6,3,7,1,8,3,4,6,6,1};
        System.out.println(TrangularSum(arr));  // should output correct triangular sum
    }
}
