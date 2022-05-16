/*
Description

You are given an array and you have to find the sum of the absolute difference between consecutive elements of the array.

For instance, if the array is 3,5,6,1,8

Absolute of (3-5) = 2

Absolute of (5-6) = 1

Absolute of (6-1) = 5

Absolute of (1-8) = 7

------------------------

Sum of all absolute = 15

------------------------

**The only constraint is that you cannot write an iterative code. You have to write a recursive code only


Input
Input Format

There are several test cases. Each test case starts with **t** which is the total number of test cases present

Each test case has 2 lines:

Line 1 : Number of integers present in the array

Line 2 : The integers present in the array

Constraints

n <= 10000

arr[i] <= 15


Output
Output one number(the sum) per test case


Sample Input 1 

2
3
1 5 2
5
3 5 6 1 8
Sample Output 1

7
15*/
import java.util.*;
class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
            while(t-->0){
            int n = sc.nextInt();
            int [] arr = new int [n];
            for ( int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(add(arr,n));
        }
    }
    public static int add(int[] arr, int n ){
        if( n<= 1){
            return 0;
        }
        return add(arr, n-1)+(Math.abs(arr[n-1]-arr[n-2]));
    }
}
