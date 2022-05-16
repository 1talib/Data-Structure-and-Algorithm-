/*
Description

Sudoku

Sudoku is one of the most popular puzzle games of all time. The goal of Sudoku is to fill a 9×9 grid with numbers so that each row, column and 3×3 section contain all of the digits between 1 and 9.

How to play Sudoku

The goal of Sudoku is to fill in a 9×9 grid with digits so that each column, row, and 3×3 section contain the numbers between 1 to 9. At the beginning of the game, the 9×9 grid will have some of the squares filled in. Your job is to use logic to fill in the missing digits and complete the grid. Don’t forget, a move is incorrect if:

Any row contains more than one of the same number from 1 to 9
Any column contains more than one of the same number from 1 to 9
Any 3×3 grid contains more than one of the same number from 1 to 9
You are given a 2d array (basically 9 rows containing 9 numbers in each row). The numbers can be in the range of [0-9] (both inclusive). The presence of 0 in the matrix implies that particular cell is empty in the given sudoku.

Write an algorithm that takes the 2d array (sudoku) in input and generates the filled sudoku in output


Input
The input has 9 lines and each line has 9 space separated integers between [0-9]


Output
Print the filled sudoku. Instead of the 0 present in the input, replace it with any other value from [1-9] that is correct for the sudoku

**If there is no solution for the given sudoku, print -1 only**


Sample Input 1 

0 4 0 0 0 0 1 7 9 
0 0 2 0 0 8 0 5 4 
0 0 6 0 0 5 0 0 8 
0 8 0 0 7 0 9 1 0 
0 5 0 0 9 0 0 3 0 
0 1 9 0 6 0 0 4 0 
3 0 0 4 0 0 7 0 0 
5 7 0 1 0 0 2 0 0 
9 2 8 0 0 0 0 6 0
Sample Output 1

8 4 5 6 3 2 1 7 9 
7 3 2 9 1 8 6 5 4 
1 9 6 7 4 5 3 2 8 
6 8 3 5 7 4 9 1 2 
4 5 7 2 9 1 8 3 6 
2 1 9 8 6 3 5 4 7 
3 6 1 4 2 9 7 8 5 
5 7 4 1 8 6 2 9 3 
9 2 8 3 5 7 4 6 1 
*/
//  function runProgram(input) {
//     input = input.split('\n');
//     var arr = [];
//     for (var i = 0; i < input.length; i++) {
//         arr[i] = [];
//         arr[i] = input[i].trim().split(" ").map(Number);
//     }
//     if (solve(arr) === false)
//         console.log("-1");
//     else
//         for (var i = 0; i < arr.length; i++) {
//             console.log(arr[i].join(" "));
//         }
        
// }

// function possible(board, y, x, n) {
//   for (let i = 0; i < 9; i++) {
//     if (board[y][i] === n || board[i][x] === n) {
//       return false;
//     }
//   }

//   const xSquare = Math.floor(x / 3) * 3;
//   const ySquare = Math.floor(y / 3) * 3;

//   for (let i = 0; i < 3; i++) {
//     for (let j = 0; j < 3; j++) {
//       if (board[ySquare+i][xSquare+j] === n) {
//         return false;
//       }
//     }
//   }

//   return true;
// }
// function solve(board) {
//   for (let y = 0; y < 9; y++) {
//     for (let x = 0; x < 9; x++) {
//       if (board[y][x] === 0) {
//         for (let n = 1; n <= 9; n++) {
//           if (possible(board, y, x, n)) {
//             board[y][x] = n;
            
//             if (solve(board)) return board;
//           }
//         }
        
//         board[y][x] = 0;
//         return false;
//       }
//     }
//   }
  
//   return board;
// }
// process.stdin.resume();
// process.stdin.setEncoding("ascii");
// let read = "";
// process.stdin.on("data", function (input) {
//     read += input;
// });
// process.stdin.on("end", function () {
//     read = read.replace(/\n$/, "");
//     read = read.replace(/\n$/, "");
//     runProgram(read);
// });
import java.io.*;
import java.lang.*;
import java.util.*;
class Main{
    public static boolean sa(int[][] arr, int t , int z, int i ){
        for( int j = 0; j < 9; j++){
            if ( arr[t][j] == i) return false;
    }
    for ( int j = 0; j < 9; j++){
        if ( arr [j][z] == i) return false;
    }
    int rowstart = t - (t%3), colstart = z - (z%3);
    for ( int j = rowstart ; j < rowstart+3; j++){
     for ( int k = colstart ; k < colstart+3; k++){
         if (arr[j][k] == i) return false;
        }
    }
    return true;
    }
    public static boolean ans (int [][] arr){
        int t = -1, z = -1, empty = 0;
         for( int i = 0; i < 9; i++){
         for ( int j = 0; j < 9; j++){
             if (arr[i][j] == 0){
                 t=i;
                 z=j;
                 empty = 1;
                 break;
              }
          }
          if ( empty == 1 ) break;
         }
         if ( empty == 0) return true;
          for( int i = 1; i <=9; i++){
              if (sa (arr, t, z, i)){
                  arr [t][z] = i;
                  if (ans (arr)) return true;
                  else arr [t][z]= 0;
              }
          }
          return false ;
    }
    public static void main ( String [] args ){
        Scanner sc = new Scanner( System.in);
        int [][] board = new int [9][9];
        for ( int i = 0 ; i < 9 ; i++){
            for ( int j = 0 ; j < 9 ; j++){
            board [i][j] = sc.nextInt();
        }
    }
    if (ans (board)){
       for ( int i = 0 ; i < 9 ; i++){
            for ( int j = 0 ; j < 9 ; j++){
           System.out.print(board[i][j] + " ");    
          }
          System.out.println();
       }
     }
    else{
        System.out.println(-1);
    }
  }
}

