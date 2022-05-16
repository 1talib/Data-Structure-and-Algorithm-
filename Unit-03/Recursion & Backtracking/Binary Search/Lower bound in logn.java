/*
Description

You are given n different numbers and an integer k. Write a program that finds lower bound of k in log(n) time complexity. Lower bound of a number k in a sorted list is the index of the first number which is same as k, in case the number is not present, print -1 (here the answer is given considering index to be starting from 0)

NOTE: YOU MUST NOT USE BRUTE FORCE SOLUTION.

WE KNOW THAT YOU KNOW BRUTE FORCE SOLUTION AND WANT YOU TO TRY THE LOGN SOLUTION.

USING BRUTE FORCE/LINEAR SEARCH, IN THIS CASE, WOULD LEAD TO DISQUALIFICATION.


Input
Input Format

First line contains N and K

Second line contains N space separated sorted integers

Constraints

N<100


Output
Output lower bound


Sample Input 1 

5 2
1 1 2 2 5
Sample Output 1

2
Sample Input 2 

5 3
1 1 2 2 5
Sample Output 2

-1 */
import java.util.Scanner;
public class Main {
    static int lowerBound(int arr[], int low, int high, int k, int ans)
    {
        if (low<=high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k){
                return lowerBound(arr, low, mid - 1, k,mid);
            }
            else if (arr[mid] > k){
                return lowerBound(arr, low, mid - 1, k,ans);
            }
            else {
                return lowerBound(arr, mid + 1, high, k,ans);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(lowerBound(arr,0, arr.length-1,k,-1));
    }
}
