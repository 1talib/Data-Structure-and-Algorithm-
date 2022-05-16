/*Description

Given an array of non-negative integers, and a value 'sum', determine if there is a subset of the given set (array) with sum equal to given sum.

If there is a subset whose sum is equal to the required sum then print "yes" else print "no" without quotes.


Input
Input Format :

The first line of input contains an integer N - denoting size of the array.

The second line contains the N space seperated integers.

The third line of input will contain S - the required Sum value.

Constraints :

1<=n<= 18

1<=A[i]<=10^9


Output
Print "yes" or "no" without quotes.


Sample Input 1 

9
1 2 3 4 5 6 7 8 9
5
Sample Output 1

yes */
import java.util.Scanner;
public class Main{
    static boolean isExits = false;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();

        boolean isSumExitsOrNot = checkSum(arr, k, 0, 0);
        if (isSumExitsOrNot) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    private static boolean checkSum(int[] arr, int k, int sum, int pos) {
        if (sum == k) {
            isExits = true;
        }
        if (pos == arr.length) {
            return isExits;
        }

        for (int i = pos; i < arr.length; i++) {
            checkSum(arr, k, sum, i + 1);
            checkSum(arr, k, sum + arr[i], i + 1);
        }
        return isExits;
    }
}
// import java.io.*;
// import java.util.*;
// import java.lang.*;
// class Main{ 
//     static boolean flag = false;
//     public static void solve(int[] arr,int k, int sum, int cur){
//         if (sum == k){
//          flag = true;
//         }
//     if (cur == arr.length){ 
//             return ;
//     }
//     for (int i = cur;i<arr.length;i++){
//     solve(arr, k, sum,i+1); 
//     solve(arr,k, sum + arr[i],i+1);
//     }
//   }
//     public static void main(String[] args){
//     Scanner s = new Scanner (System.in); 
//     int n = s.nextInt(); 
//     int[] arr = new int[n]; 
//     for (int i=0;i<n;i++) arr[i] =s.nextInt(); 
//     int k = s.nextInt(); 
//     solve(arr,k,0,0); 
//     if (flag) System.out.println("yes"); 
//     else{
//         System.out.println("no");
//          }
//        }   
//     }
