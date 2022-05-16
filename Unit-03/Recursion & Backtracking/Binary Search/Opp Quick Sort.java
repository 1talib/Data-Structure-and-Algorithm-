/*
Description

Given a list of n integers. Write a program for quick sort algorithm such that it reverses the list in descending order.  You must not write any other sorting algorithm



Input
First line contains n which is the number of elements present in the array

Second line contains n space-separated integers


Output
Output the elements present in the array sorted in descending order



Sample Input 1 

5
2 3 1 4 5
Sample Output 1

5 4 3 2 1 */
import java.io.*;
import java.lang.*;
import java.util.*;
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
        Random random = new Random();
        int index = random.nextInt(high-low) + low;
         swap(arr,low,index);
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
        if (arr[j] > pivot) {    
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
