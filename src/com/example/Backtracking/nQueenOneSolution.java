package com.example.Backtracking;

import java.util.Scanner;

public class nQueenOneSolution {

    public static boolean checkPosition(char[][] board,int row,int col){
        //as we start from top to down in the row, we need not check the current position
        //as we place single queen in each row hence we not need to check left and right.
        //the positions we need to check are vertically upward, diagonally top left and diagonally top right.

        //check at the vertically upward
        for(int i=row;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // check at the diagonally left (upward)
        for(int i=row,j=col; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //check diagonally right (upward)
        for(int i=row,j=col; i>=0 && j< board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char[][] board){
        System.out.println("----------Chess Board----------");
        for(int i = 0;i<board.length;i++){
            for(int j = 0; j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean nQueen(char[][] board,int row){

        if(row>=board.length){
            //printBoard(board);
            return true;
        }
        for(int j = 0; j<board.length;j++){
            if(checkPosition(board,row,j)){
                board[row][j] = 'Q';
                if(nQueen(board,row+1)){
                    return true;
                }
                board[row][j] = 'X';
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of chess-board: ");
        int n = sc.nextInt();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                board[i][j] = 'X';
            }
        }
        if(nQueen(board,0)){
            System.out.println("Solution is possible");
            printBoard(board);
        } else {
            System.out.println("Solution is not possible");
        }
    }
}
