/*
Description

Rectangular Matrix - Single Test Case


Input
The first line of the input containsNandM, the dimensions of the matrix

The nextNline containsMspace separated integers, denoting the elements of the matrix


Output
Print the elements of the matrix, row by row, by adding 1 to each element, as shown in the sample input

Sample Input 1 

3 4
1 2 3 4
5 6 7 8
9 10 11 12
Sample Output 1

2 3 4 5
6 7 8 9
10 11 12 13*/
import java.util.*;  
class Main {
public static void main( String[] args ){
    Scanner scn= new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int [][]arr = new int[n][m];
    for (int i = 0; i<n; i++){
    for (int j = 0; j<m; j++){
    arr[i][j] = scn.nextInt();
    System.out.print(arr[i][j]+1+" ");}
      System.out.println();
     }  
   } 
}
