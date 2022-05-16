/*Description

You are given N numbers. Your task is to write MERGE SORT sorting algorithm (from scratch) to sort those N numbers.

USING ANY OTHER ALGORITHM OR IN BUILT FUNCTION WOULD LEAD TO DISQUALIFICATION FROM NEXT HACKERRANK CONTEST


Input
Input Format:

First line of input contains N

Next line contains N space separated integers.

Constraints:

N < 1000000


Output
Output the sorted form of provided numbers


Sample Input 1 

5
3 5 0 9 8
Sample Output 1

0 3 5 8 9*/

import java.util.Scanner;
class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int[] arr = new int[len];
    for(int i=0; i<len; i++) arr[i] = sc.nextInt();
    
    mergeSort(arr,0,len-1);
    
    for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
  }
  public static void mergeSort(int[] arr, int left , int right){
    if(left<right){
      int mid = (left+right)/2;
      
      
      mergeSort(arr,left,mid);
      mergeSort(arr,mid+1,right);
      merge(arr,left,mid,right);
    }
  }
  
  public static void merge(int[] arr, int left , int mid , int right){
    int n1 = mid-left+1;
    int n2 = right-mid;
    
    
    int[] L = new int[n1];
    int[] R = new int[n2];
    
    for(int i=0; i<n1; i++) L[i] = arr[left+i];
    for(int i=0; i<n2; ++i) R[i] = arr[mid+1+i];
    
    int i=0, j=0, k=left;
    
    while(i<n1 && j<n2){
      if(L[i] <= R[j]){
        arr[k] = L[i];
        i++;
      }
      else {
        arr[k] = R[j];
        j++;
      }
      k++;
    }
    while(i<n1){
      arr[k] = L[i];
      i++; 
      k++;
    }
    
    while(j<n2){
      arr[k] = R[j];
      j++;
      k++;
    }
  }
}
// import java.lang.*;
// import java.io.*;
// import java.util.Scanner;
// class Main
// {
//    public static  void merge(int arr[], int l, int m, int r)
//     {
//         int n1 = m - l + 1;
//         int n2 = r - m;
//         int L[] = new int[n1];
//         int R[] = new int[n2];
//         for (int i = 0; i < n1; ++i)
//             L[i] = arr[l + i];
//         for (int j = 0; j < n2; ++j)
//             R[j] = arr[m + 1 + j];
//         int i = 0, j = 0;
//         int k = l;
//         while (i < n1 && j < n2){
//             if (L[i] <= R[j]){
//                 arr[k] = L[i];
//                 i++;
//             } 
//             else {
//                 arr[k] = R[j];
//                 j++;
//             }
//             k++;
//         }
//         while (i < n1) {
//           arr[k] = L[i];
//             i++;
//             k++;
//         }
//         while (j < n2) {
//             arr[k] = R[j];
//             j++;
//             k++;
//         }
//     }
//    public static void mergeSort(int arr[], int l, int r)
//     {
//         if (l < r) {
//             int m = l + (r-l)/2;
//             mergeSort(arr, l, m);
//             mergeSort(arr, m + 1, r);
//             merge(arr, l, m, r);
//         }
//     }
//     static void printArray(int arr[])
//     {
//         int n = arr.length;
//         for (int i = 0; i < n; ++i)
//         System.out.print(arr[i] + " ");
//         System.out.println();
//     }
//     public static void main(String [] args){
//     Scanner sc = new Scanner(System.in);
//     int len = sc.nextInt();
//     int[] arr = new int[len];
//     for(int i=0; i<len; i++) arr[i] = sc.nextInt();
//     mergeSort(arr,0,len-1);
//     for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
//   }
// }   
