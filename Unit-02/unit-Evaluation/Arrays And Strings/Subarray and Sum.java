/*
Description

Given an array of integers of length n and a positive integer K, the task is to find the count of the longest possible subarrays with the sum of its elements not divisible by K.


Input
Input Format

First line contains n and k separated by space

Second line contains strings of length n.

Constraints

1 <= n <=10^6

1 <= k <= 100


Output
Print count of sub arrays.


Sample Input 1 

4 3
2 3 4 6
Sample Output 1

1
Hint

Sample 1 Explanation

There is only one longest possible subarray of size 3 i.e. {3, 4, 6} having a sum 13, which is not divisible by K = 3.
*/
import java.util.*;
 class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int k = sc.nextInt();
        int[] A = new int[N];
        for (int low = 0; low < N; low++) {
            A[low] = sc.nextInt();}
        int mxln = 0, count = 0, flag = 0;
       for (int low = 0; low < N; low++){
            int sum = 0;
            for (int j = low; j<N; j++) {
                sum = sum + A[j];
            if (sum % k != 0) {
                int len = j-low+1;
                if(len == N){
                    flag = 1;
                    count = 1;
                    break;}
               if (len > mxln){
                   mxln = len;
                   count = 1;
               }else if ( len == mxln){
                   count +=1;
                       }
                    }
                 }
                   if ( flag == 1){
                       break;
                   }
               }
                System.out.println(count);
            }
        }
