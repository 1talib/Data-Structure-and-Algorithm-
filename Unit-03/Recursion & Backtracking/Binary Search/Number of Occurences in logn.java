/*
Description

You are given n different numbers and an integer k. Write a program that finds number of times k is present in log(n) time complexity.

NOTE: YOU MUST NOT USE BRUTE FORCE SOLUTION

WE KNOW THAT YOU KNOW BRUTE FORCE SOLUTION AND WANT YOU TRY THE LOGN SOLUTION

USING BRUTE FORCE/LINEAR SEARCH IN THIS CASE WOULD LEAD TO DISQUALIFICATION


Input
Input Format :

First line contains N and K

Second line contains N space separated sorted integers

Constraints :

N<100


Output
Print number of times that number is present in the given list


Sample Input 1 

6 3
2 3 3 3 6 9
Sample Output 1

3 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(print(n, arr, k));
    }
    static int print(int n, int[] arr, int k) {
        if (LB(n, arr, k) == -1) return 0;
        return (UB(n, arr, k) - LB(n, arr, k)) + 1;
    }
    static int LB(int n, int[] arr, int k) {
        int start = 0, end = arr.length - 1, result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == k) {
                result = mid;
            }
            if (arr[mid] >= k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
    static int UB(int n, int[] arr, int k) {
        int start = 0, end = arr.length - 1, result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == k) {
                result = mid;
                start = mid + 1;
            }
            if (arr[mid] > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
}
