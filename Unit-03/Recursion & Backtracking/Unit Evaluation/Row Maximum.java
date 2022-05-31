/*Description

Given a matrix A of size n and m, you have to print the array of size n each element representing the maximum of ith row of the matrix A.


Input
Input Format

First-line contains 2 integers n and m representing the number of rows and columns respectively of 2D array arr.

Following n lines contains m-integers.

Constraints

1 <= n <= 100

1 <= m <= 100

1 <= arr[i][j] <= 10^4


Output
Print the required array.


Sample Input 1 

3 3
1 2 3
4 5 6
7 8 9
Sample Output 1

3 6 9
Hint

Maximum of first row = 3

Maximum of second row = 6

Maximum of third row = 9*/

import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] matrix = new int[n][m];
        for (int i = 0; i<n; i++){
         for (int j = 0; j<m; j++){ 
             matrix[i][j] = sc.nextInt();
          }
       }
      for (int i = 0; i<n; i++){
      int maxNum = 0;
      for (int j = 0; j<m; j++){
         if(matrix[i][j] > maxNum){
            maxNum = matrix[i][j];
           }
       }
    System.out.print(maxNum+" ");
    }
  }
}
