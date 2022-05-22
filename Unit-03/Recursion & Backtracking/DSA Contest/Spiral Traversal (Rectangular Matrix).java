/*Description

You are given a matrix of size N x M.

Print the spiral traversal of the matrix.

Refer the image given below, for better understanding.

Screenshot (116).png


Input
The first line of the input contains T, the number of test cases.

The first line of each test case contains N and M, the number of rows and columns in the given matrix.

The next N lines contain M values each denoting the elements of the matrix.

Constraints

1 <= T <= 10

1 <= N, M <= 200

1 <= A[i][j] <= 200


Output
For each test case, print the spiral traversal of the matrix, on a single line, on a new line.


Sample Input 1 

2
3 4
1 2 3 4
5 6 7 8
9 10 11 12
4 3
1 2 3
4 5 6
7 8 9
10 11 12
Sample Output 1

1 5 9 10 11 12 8 4 3 2 6 7 
1 4 7 10 11 12 9 6 3 2 5 8 
Sample Input 2 

1
4 3
1 10 9
2 11 8
3 12 7
4 5 6 
Sample Output 2

1 2 3 4 5 6 7 8 9 10 11 12 
Hint

The spiral traversal of the elements given in the matrix, is printed in the sample output.*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int tc=s.nextInt();
        for(int l=0;l<tc;l++){
            int row=s.nextInt();
            int col=s.nextInt();
            int arr[][]=new int[row][col];
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    arr[i][j]=s.nextInt();
                }
            }
            int minr=0,minc=0,maxr=arr.length-1,maxc=arr[0].length-1;
            int count=0;
            int total=row*col;
            while(count<total){
                //left wall
                for(int i=minr,j=minc;i<=maxr&&count<total;i++){
                    System.out.print(arr[i][j]+" ");
                    count++;
                }
                minc++;
                //bottom wall
                for(int i=maxr,j=minc;j<=maxc&&count<total;j++){
                    System.out.print(arr[i][j]+" ");
                    count++;
                }
                maxr--;
                // right wall
                for(int i=maxr,j=maxc;i>=minr&&count<total;i--){
                    System.out.print(arr[i][j]+" ");
                    count++;
                }
                maxc--;
                //top wall
                for(int i=minr,j=maxc;j>=minc&&count<total;j--){
                    System.out.print(arr[i][j]+" ");
                    count++;
                }
                minr++;
            }
            System.out.println();
        }
    }
}

//import java.io.*;
// import java.util.*; 
// import java.lang.*; 
// class Main{ 
//     public static void solve (int [][] arr , int n, int m){
//         int top = 0; 
//         int left =0; 
//         int right = m-1;
//         int bottom = n-1; 
//         int size = n*m;
//         int count = 0;
//         while (count < size){ 
//         for ( int i = top ; i <= bottom && count < size ; i++){
//             System.out.print(arr[i][left] + " " ); 
//             count++ ; 
//           }
//             left++ ; 
//         for (int i = left ; i<=right && count < size ; i++){
//             System.out.print(arr[bottom][i] + " " ); 
//             count++ ; 
//         } 
//         bottom--;
//         for (int i = bottom ; i>=top && count < size ; i--){ 
//             System.out.print(arr[i][right] + " " ) ; 
//             count++ ; 
//         }
//         right-- ;
//         for ( int i = right ; i >= left && count < size; i--){
//         System.out.print(arr[top][i] + " "); 
//         count++ ; 
//           }
//             top++ ; 
//           }
//         }
       
//     public static void main (String [] args){
//         Scanner s = new Scanner (System.in); 
//         int t = s.nextInt(); 
//         while (t--!= 0){ 
//             int n = s.nextInt();
//             int m = s.nextInt(); 
//             int [][] arr = new int [n][m] ; 
//             for ( int i = 0 ; i < n ; i++){
//                 for ( int j = 0 ; j < m ; j++) arr[i][j] = s.nextInt(); 
//             }
//           solve(arr,n,m);
//         System.out.println();
//         }
//     }
// }
