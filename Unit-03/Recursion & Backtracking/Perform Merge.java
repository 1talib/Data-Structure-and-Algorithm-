/*Description

You are given two sorted arrays each of length N. Your task is to write a program that merges both the arrays such that the final array formed after merging is sorted.

Note: You must not use sort() function in your entire code


Input
Input Format :

First line contains N which is the number of integers present in both the arrays.

Second line contains N sorted integers which are elements of first array.

Third line contains N sorted integers which are elements of second array.



Constraints :

N < 1000


Output
Output the array formed after merging elements such that it is sorted


Sample Input 1 

4
1 5 7 9
2 4 6 8
Sample Output 1

1 2 4 5 6 7 8 9 */
import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int[] ar1 = new int[len];
    int[] ar2 = new int[len];
    for(int i=0; i<len; i++) ar1[i] = sc.nextInt();
    for(int i=0; i<len; i++) ar2[i] = sc.nextInt();
    int[] res = new int[len*2];
    merge(res,ar1,ar2);
    for(int i=0; i<res.length; i++) System.out.print(res[i]+" ");
  }
   public static void merge(int[] arr,int[] L, int[] R){
    int n1=L.length;
    int n2=R.length;
    int i=0, j=0, k=0;
    while(i<n1 && j<n2){
      if(L[i] <= R[j]){
        arr[k] = L[i];
        i++;
      }
      else {
        arr[k] = R[j];
        j++;
      }
      k++;
    }
    while(i<n1){
      arr[k] = L[i];
      i++; 
      k++;
    }
    
    while(j<n2){
      arr[k] = R[j];
      j++;
      k++;
    }
  }
}
