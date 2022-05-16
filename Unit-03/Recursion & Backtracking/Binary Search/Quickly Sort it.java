/*
Description

You are given an array of N integers. Write QUICK SORT ALGORITHM to sort the numbers in ascending order

DO NOT USE ANY BUILTIN FUNCTION TO SORT

ALSO, YOU MUST NOT USE ANY OTHER ALGORITHM


Input
Input Format

First line contains N

Second line contains N space separated integers

Constraints

N < 1000


Output
Output Format

Print the sorted numbers separated by space


Sample Input 1 

5
3 5 0 9 8
Sample Output 1

0 3 5 8 9
*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        quick(arr, 0, n - 1);
       printArray(arr);
    }
    private static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
    }
    static void quick(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = sortingAlgo(arr, low, high);
            quick(arr, low, pivot - 1);
            quick(arr, pivot + 1, high);
        }
    }
    static int sortingAlgo(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
           if (arr[j] < pivot) {    
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
