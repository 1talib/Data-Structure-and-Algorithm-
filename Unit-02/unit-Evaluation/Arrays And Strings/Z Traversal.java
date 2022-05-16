/*Description

Given a square matrix of size N x N. Print the Z traversal of the matrix. Refer the figure given below for better understanding.

Image


Input
The first line of the input contains T, the number of test cases. The first line of each test case contains N, the dimension of the square matrix.

Next N lines contains N space separated integers, denoting the values of the matrix.

Constraints

1 <= T <= 10

1 <= N <= 500

1 <= A[i][j] <= 1000


Output
For each test case, print the elements that occur in the Z traversal of the matrix, on a new line.


Sample Input 1 

1
3
1 2 3
4 5 6
7 8 9
Sample Output 1

1 2 3 5 7 8 9 */
public static void zTraversal(int N, int matrix[][]){
    //write your code here
        for (int i = 0; i < N ; i++) {
            System.out.print(matrix[0][i] + " ");}
        int x = 1, y = N-2;
        while(x < N) {
        System.out.print(matrix[x][y] + " ");
            x++;
            y--;}
        for (int i = 1; i < N; i++){
            System.out.print(matrix[N-1][i] + " ");}
          System.out.println();
        }
 
