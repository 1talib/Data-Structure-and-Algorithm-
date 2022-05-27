/*Description

You are give an array of integers of size N. You need to find and print maximum sum of contiguous sub array (containing atleast one integer) from this array.


Input
First line contains T, no of test cases.

First line of each test case contains N, size of array.

Second line of each test case contains N spaced integers.

Constraints

1 <= T <= 10

1 <= N <= 10^6

1 <= A[i] <= 10^6


Output
For each test case print the maximum sum of contiguous array, on new line


Sample Input 1 

2
5
1 2 0 4 5
5
3 -4 1 2 -1
Sample Output 1

12
3*/
import java.io.*;
import java.util.*;
public class Main{
    
public static void main(String[] args){ 
    Scanner sc = new Scanner(System.in); 
    int t = sc.nextInt(); 
    for (int j = 1; j <= t; j++){
    int n = sc.nextInt();
    int ar[] = new int[n];
    for (int i = 0; i < n; i++) ar[i] = sc.nextInt(); 
    System.out.println(maxSubArraySum(ar)); 
          } 
     }
    static int maxSubArraySum(int a[]){ 
    int size = a.length;
    int cursum = 0, maxsum = Integer.MIN_VALUE; 
    for (int i = 0; i < size; i++){
        cursum = cursum + a[i]; 
        if (maxsum < cursum) maxsum = cursum; 
        if (cursum < 0) cursum = 0;
            }
        return maxsum;
      }
 }
  
