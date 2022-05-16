/*Description

Given an array, A of m denominations of coins and given an amount n, find a number of unique ways to make the change from the given coin types.

Read the sample input explanation for better understanding.


Input
Input Format

The first line contains two space-separated integers describing the respective values of

n and m, where:

n is the required amount

m is the number of coin types

The second line containsan array of integers representing available denominations.

Constraints

1<= A[i] <=50

1 <= n <= 250

1 <= m <= 50

Each A[i] is gauranteed to be distinct




Output
Print the number of ways we can get a sum of nfrom the given infinite supply of mtypes of coins.


Sample Input 1 

4 3
1 2 3
Sample Output 1

4
Hint

Sample Input 1 Explanation

There are four ways to make the change for n = 4using coins with values given by:

A = [1,2,3] :

1 .{1,1,1,1}

2. {1,1,2}

3. {2,2}

4. {1,3}

thus we print 4 as answer.*/
import java.util.Scanner;
public class Main{
     public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in); 
      int n = sc.nextInt(); 
      int m = sc.nextInt();
      int[] arr = new int[m]; 
      long[][] dp = new long[m+1][n+1]; 
      for(int i=0;i<m;i++){ 
        arr[i]=sc.nextInt(); 
      }
        for (int i=0;i<=m;i++){ 
       for (int j=0;j<=n;j++){
         dp[i][j] = -1; 
          }
        }
    long ans = count (arr, n, m, dp);
    System.out.println(ans); 
     }
    public static long count (int[] arr, int n, int m, long[][] dp) {
        if (n==0) return 1; 
        if(n < 0 || m==0) return 0; 
        if (dp[m][n] != -1) { 
            return dp[m][n]; 
        } 
        dp[m][n]=count(arr, n-arr[m-1], m, dp) + count(arr, n, m-1, dp);
        return dp[m][n];
        }
    }
