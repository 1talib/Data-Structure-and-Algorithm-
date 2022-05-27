/*
Description

Given an array A with n integers, find out whether the count of odd elements is odd.

If exists, then print "Yes" else "No".


Input
The first line of the input contains one integer t (1 ≤ t ≤ 1000) — the number of test cases. Then t test cases follow.

The first line of each test case contains a single integer n (1 ≤ n ≤ 1000) — the number of elements in the array A.

The second line of each test case contains n integers (1 ≤ Ai ≤1000).


Output
For each test case, print the answer.


Sample Input 1 

3
1
1
2
1 101
2
1 200
Sample Output 1

Yes
No
Yes*/
public static void oddsOfOdds(int n,int[] arr){
    //write your code here
      int sum = 0;
     for(int i=0;i<n;i++){
          if(arr[i]%2==1){
           sum++;}}
     if(sum%2==1){
     System.out.println("Yes");}
     else{
     System.out.println("No");}}
         
