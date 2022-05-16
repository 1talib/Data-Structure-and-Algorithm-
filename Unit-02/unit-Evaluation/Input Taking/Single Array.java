/*Description

Single Array


Input
The first line containsNthe size of the array

The next line containsNspace separated integers, denoting the elements of the array


Output
Print the elements of the array on a single line, by adding 1 to each element


Sample Input 1 

5
1 2 3 4 5
Sample Output 1

2 3 4 5 6*/
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int [] arr= new int [size];
    for ( int i = 0; i<size;i++){
      arr[i] = sc.nextInt();
      System.out.print(arr[i]+1+" ");
       }
     }
  }
