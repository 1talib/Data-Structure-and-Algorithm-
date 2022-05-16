/*
Description

Given an array of integers and a number k, find the maximum sum of a subarray of size k.


Input
Input Format

First line consists of two integers n and k separated by space

Second line consists of n integers separated by spaces.

Constraints

1 <= n <= 10^7

1 <= k <= 10^6


Output
Print the maximum sum of a subarray of size k.


Sample Input 1 

10 3
-1 -1 -2 1 -2 4 1 9 3 9
Sample Output 1

21
*/
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[z];
        for ( int i = 0; i < z; i++){
        arr[i] = sc.nextInt();}
        int mx = 0, sum = 0;
        for ( int i = 0; i < t; i++){
        sum = sum + arr[i];}
    // if( sum > mx){
    //     mx = sum;}
          mx = Math.max(mx, sum);
        for( int i = t;  i < z; i++){
            sum = sum + arr[i];
            sum = sum - arr[i-t];
            //  if (sum > mx){
            //     mx = sum ;
            mx = Math.max(mx, sum);
              }
        System.out.println(mx);
      }
  }
