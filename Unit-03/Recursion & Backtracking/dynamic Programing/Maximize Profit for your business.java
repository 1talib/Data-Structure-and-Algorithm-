/*
Description

You are given n rods of certain lengths with price of all. If you have to sell certain given length of rod(say l). How should you sell in order to make maximum profit. Say you have rod of length 1m,2m,3m and 4m that you can sell for rupees 2,5,7 and 8 respectively. Which rods should you sell if you have to sell total of 5 m and what is the maximum profit that you can make?


Input
Input Format

First line contains 2 space separated integers which represents number of rods n that you have and total length of rod that you can sell respectively

Second line contains n space separated integers which is the price of n rods where ith index represents price of rod of i length

Constraints

n, l <= 1000


Output
Output Format

Output the maximum profit that you can make


Sample Input 1 

4 5
2 5 7 8
Sample Output 1

12
Hint

Sample 1 Explanation
To maximize profit by selling 5m rods, you can sell 2 rods (one of length 2m and other of length 3m) => this way you have profit of 12*/
import java.util.*;
public class Main{
     public static long profit(int[]weight,int[]val,int n,int weCan,long[][]dp){
         if (n==0){ 
             return 0; 
         }
        if (weCan == 0 || weCan < 0){ 
        return 0; 
        }
        if(dp[n][weCan] != -1){
        return dp[n][weCan]; 
        }
        if (weight[n-1] > weCan){
        return profit(weight,val,n-1,weCan,dp);
        } 
        long sell = val[n-1] + profit(weight,val,n,weCan-weight[n-1],dp); 
        long notSell = profit(weight,val,n-1,weCan,dp);
        dp[n][weCan] = Math.max(sell,notSell);
        return dp[n][weCan];
         }
        public static void main(String[]args){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int weCan = sc.nextInt();
        int []val = new int[n];
        for (int i = 0; i < n; i++){ 
        val [i] = sc.nextInt(); 
        } 
        int []weight = new int[n]; 
        for (int i = 0; i < n; i++){
            weight [i] = i + 1; 
        }
        long [][]dp = new long[n + 1][weCan+1]; 
        for (int i = 0; i <= n; i++){ 
        for (int j = 0; j <= weCan; j++){
            dp[i][j]= -1;
           }
        }
        long ans = profit(weight,val,n,weCan,dp);
        System.out.println(ans);
        }
     }
        
