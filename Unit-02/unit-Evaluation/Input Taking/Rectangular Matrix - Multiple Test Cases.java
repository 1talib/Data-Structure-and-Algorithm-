/*Description

Rectangular Matrix - Multiple Test Cases


Input
The first line of the input containsT, the number of test cases

The first line of each test case containsN, andMthe dimension of the matrix

The nextNlines containMelements each denoting the elements of the matrix


Output
For each test case, print the elements of the matrix row by row by adding 1 to each element, as shown in the sample test case

Sample Input 1 

2
3 4 
1 2 3 4
5 6 7 8 
9 10 11 12
2 3
1 2 3 
4 5 6
Sample Output 1

2 3 4 5
6 7 8 9
10 11 12 13
2 3 4
5 6 7*/
import java.util.*;  
class Main {
public static void main( String[] args ){
    Scanner scn= new Scanner(System.in);
    int t = scn.nextInt();
    for (int k = 0; k<t; k++){
    int N = scn.nextInt();
    int M = scn.nextInt();
    int [][]arr = new int[N][M];
  for (int i = 0; i<N; i++){
  for (int j = 0; j<M; j++){
    arr[i][j] = scn.nextInt();
    System.out.print(arr[i][j]+1+" ");}
      System.out.println();
     }
   } 
  }
}
