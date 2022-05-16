/*
Description

Square Matrix - Single Test Case


Input
The first line of the input containsN, the dimensions of the square matrix

The nextNlines containsNspace separated integers, denoting the elements of the matrix


Output
Print the elements of the matrix row by row, by adding 1 to each element, as shown in the sample test case

Sample Input 1 

3 
1 2 3
4 5 6
7 8 9
Sample Output 1

2 3 4
5 6 7
8 9 10*/
import java.util.*;  
class Main {
public static void main( String[] args ){
    Scanner scn= new Scanner(System.in);
    int n = scn.nextInt();
    int [][] arr = new int [n][n];
 for (int i = 0; i<n; i++){
  for (int j = 0; j<n; j++){
    arr[i][j] = scn.nextInt();
    System.out.print(arr[i][j]+1+" ");}
       System.out.println();
     }  
   } 
}
