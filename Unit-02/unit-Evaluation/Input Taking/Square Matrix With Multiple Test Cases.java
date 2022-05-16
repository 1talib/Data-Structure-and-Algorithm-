/*Description

Square Matrix With Multiple Test Cases


Input
The first line of the input containsT, the number of test cases

The first line of each test case containsN, the dimensions of the matrix

The nextNlines containNspace separated integers, denoting the elements of the matrix


Output
Print all the elements of the matrix row by row, by adding 1 to each element, on a new line, as shown in the sample output

Sample Input 1 

2
3
1 2 3
4 5 6
7 8 9
2
1 2
3 4
Sample Output 1

2 3 4
5 6 7
8 9 10
2 3 
4 5*/
import java.util.*;
class Main {
public static void main( String[] args ){
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    while(n>0){
    int t = sc.nextInt();
    int [][] arr = new int [t][t];
 for (int i = 0; i<t; i++){
  for (int j = 0; j<t; j++){
    arr[i][j] = sc.nextInt();
    System.out.print(arr[i][j]+1+" ");}
       System.out.println();
        }
        n = n-1;
      } 
   }
}
