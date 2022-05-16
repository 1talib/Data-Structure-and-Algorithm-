/*Description

Given an array of length n, and it is sorted and rotated at some unknown point, find the minimum element in it.



In a sorted & rotated array,  we rotate an ascending order sorted array at some pivot unknown to you beforehand. So for instance, 1 2 3 4 5 might become 3 4 5 1 2.

Please note that the linear search approach with the time complexity of O(n) can easily be applied. But you are expected to solve it in O(log n) time complexity


Input
Input Format

First line Consists of integer n.

Second line consists of n integers separated by spaces.

Constraints

1 <= n <= 10^6


Output
Print minimum element.


Sample Input 1 

10
4 6 7 9 10 -1 0 1 2 3
Sample Output 1

-1*/
import java.io.*;
import java.lang.*;
import java.util.*;
 class Main{
     public static int solve ( int[] arr){
         int low = 0, high = arr.length-1 ;
         while( low <= high){
             int mid = low + ( high-low)/2;
             if (arr[mid] < arr[high]){
                 high = mid;
             }
           else if (arr[mid] > arr[high]){
                 low = mid +1;
             }
             else{
                 high--;
             }
         }return low;
     }
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int [] arr = new int [n]; 
         for ( int i = 0; i < n; i++) arr[i] = sc.nextInt();
             int mid = solve(arr);
             if ( mid== arr.length-1)
             System.out.println(arr[0]);
            else System.out.println(arr[mid]);
           
         }
     }
