/*
Description

You have a restaurant at a beachside which has N dining tables. Each dining table has only one chair so each table can accommodate only one person. These dining tables are along a straight line parallel to the beach at positions x1,...,xN.

C customers are currently queued up outside the restaurant since you have reopened the restaurant after a long time due to the pandemic. You need to assign the dining tables to the customers such that the minimum distance between any two customers is as large as possible in order to take care of the precautions considering the current pandemic situation. (Consider all C customers dine at the  same time)

Find the largest minimum distance possible.


Input
The first line of the input contains one integer t (1 ≤ t ≤ 10) — the number of test cases. Then t test cases follow.

The first line of each test case contains 2 integers N (2 ≤ N ≤ 100000) and c (2 ≤ C ≤ N).

The second line of each test case contains n integers (1 ≤ Xi ≤ 1000000000) - The elements of the array W.


Output
For each test case, print the answer: The largest minimum distance.


Sample Input 1 

2
5 2    
2 4 1 6 8
5 3
3 1 3 3 3
Sample Output 1

7
0*/
import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
public static void main(String[]args){
    Scanner s = new Scanner(System.in); 
    int t = s.nextInt();
    while (t--!= 0){ 
    int n = s.nextInt(); 
    int k = s.nextInt();
    int [] a = new int[n]; 
    for (int i = 0; i < n; i++) a[i] = s.nextInt();
    Arrays.sort(a);
    int high = Math.abs(a[0] - a[n - 1]), low = 0, ans = 0;
    while (low <= high){ 
       int mid = low + ( high - low)/2, last = a[0], c = 1;
      for ( int i = 1; i < n; i++){ 
        if (a[i] - last >= mid){ 
        last = a[i]; 
         c++;
            }
        } 
        if (c >= k ){ 
        ans = mid; 
        low = mid + 1;
        }else 
        high = mid - 1; 
     } 
    System.out.println(ans); 
           }
        }
    }
