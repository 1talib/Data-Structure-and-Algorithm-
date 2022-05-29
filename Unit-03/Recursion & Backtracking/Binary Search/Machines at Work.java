/*
Description

You are planning production for an order. You have a number of machines that each have a fixed number of days to produce an item. Given that all the machines operate simultaneously, determine the minimum number of days to produce the required order.

For example, you have to produce goal = 10 items. You have three machines that take machines = [2,3,2] days to produce an item. The following is a schedule of items produced:

Day Production  Count

2   2               2

3   1               3

4   2               5

6   3               8

8   2              10

It takes 8 days to produce 10 items using these machines.


Input
Input Format

The first line consist of two integers n and goal, the size of machine and the target production.

The next line contains n space-separated integers, machines[i].

Constraints

n <= 100000

goal <= 1000000000

machines[i] <= 1000000000




Output
Output Format

Print the minimum time required to produce items considering all machines work simultaneously.


Sample Input 1 

2 5
2 3
Sample Output 1

6
*/
import java.io.*; 
import java.lang.*; 
import java.util.*;
    class Main{ 
    public static void main(String[] args){ 
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); 
        int k = s.nextInt(); 
        int []a = new int[n]; 
        for (int i = 0; i < n; i++) a[i] = s.nextInt();
        Arrays.sort(a);
        int high = a[0]*k, low = 1, ans = Integer.MAX_VALUE; 
        while (low <= high){
       int mid = low + (high - low) / 2, curr = 0; 
        for (int i = 0; i < n; i++ ){ 
            curr += mid/a[i]; 
        } 
        if(curr >= k){
        ans = mid;
        high = mid - 1; 
        }else 
        low = mid + 1; 
        } 
    System.out.println(ans);
      }
    }

