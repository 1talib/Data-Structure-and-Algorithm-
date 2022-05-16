/*
Description

Given a sorted(increasing order) array of length n and is rotated by some value beforehand. Find the index of the target element  K in the rotated array in O(logn) time. If not found print -1.





In a sorted & rotated array,  we rotate an ascending order sorted array at some pivot unknown to you beforehand. So for instance, 1 2 3 4 5 might become 3 4 5 1 2.

Please note that the linear search approach with the time complexity of O(n) can easily be applied. But you are expected to solve it in O(log n) time complexity

Note: Array contains all distinct elements.


Input
Input Format

First line consists of n and k separated by space.

Second line consists of n integers separated by spaces

Constraints

1 <= n <= 50

k <= 50






Output
Print index of the target element


Sample Input 1 

5 1
3 4 5 1 2
Sample Output 1

3
Sample Input 2 

6 6
3 4 7 9 1 2
Sample Output 2

-1 
*/
import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
    public static int search(int[] arr,int low, int high, int k){
        int ans = -1;
        while (low <= high){
            int mid = low + ( high-low)/2;
            if (arr[mid] == k) return mid ;
            else if (arr[mid] > k ) high = mid-1;
            else {
                low = mid +1;
            }
        }
        return ans ;
    }
    public static int solve ( int [] arr){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low +(high -low)/2;
            if (arr[mid] <arr[high]) high = mid;
            else if (arr[mid] > arr[high]) low = mid +1;
        else {high--;
    }
}
return low;
}
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] arr = new int[n];
for ( int i = 0; i< n; i++) arr[i] = sc.nextInt();
int mid = solve (arr);
if ( k>= arr[0] && k<= arr[mid-1] ) System.out.println(search(arr,0,mid-1,k));
else{
    System.out.println(search(arr,mid,arr.length-1,k));
     }
   }
  }
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
//         System.out.println(res(n, arr, k));
//       }
//     static int res(int n, int[] arr, int k) {
//         int low = 0, high = n - 1;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (arr[mid] == k) return mid;
//             else if (arr[low] <= arr[mid]) {
//       //  low to mid is sorted
//                 if (k >= arr[low] && k <= arr[mid])
//                     high = mid - 1;
//                 else
//                     low = mid + 1;
//             } else if (arr[mid] <= arr[high]) {
//       //  mid to high is sorted
//                 if (k > arr[mid] && arr[high] >= k)
//                     low = mid + 1;
//                 else
//                     high = mid - 1;
//             }
//         }
//         return -1;
//     }
// }
