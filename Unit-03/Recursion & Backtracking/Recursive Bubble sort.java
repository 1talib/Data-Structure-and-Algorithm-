/*
Description

You are given an array ofNunsorted numbers. Your task is to write BUBBLE SORT using RECURSION such that numbers present in the array get sorted.

USING ANY OTHER ALGORITHM OR USING SORT FUNCTION WOULD LEAD TO DISQUALIFICATION.




Input
Input Format

First line of input contains N

Second line of input contains N numbers

Constraints

N < 500


Output
Output the numbers given after sorting it in increasing order


Sample Input 1 

5
3 5 0 9 8
Sample Output 1

0 3 5 8 9*/
import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
    public static void bubblesort(int [] arr, int n){
        if( n==arr.length-2) return;
        for (int j= 0; j<arr.length-n-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        bubblesort(arr,n+1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] arr = new int[num];
        for ( int i = 0; i<num; i++){
            arr[i] = sc.nextInt(); }
            bubblesort(arr,0);
            for ( int i = 0; i<num; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
