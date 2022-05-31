/*Description

Let's assume there are 365 days in a year. You are given a list of unique days sorted in ascending order that you want to travel on. There are three types of tickets available. Ticket for 1 day, a ticket for 7 days and a ticket for 30 days. A 1 day ticket lets you travel for 1 entire day. A 7 day ticket lets you travel 7 consecutive days and a 70 day ticket lets you travel 30 consecutive days. Given the list of days you want to travel and the costs of 1, 7, and 30 day tickets, what is the minimum cost you need to spend on tickets to be able to travel on all days in the given list of days

( If you buy a 7 day ticket on day 6, you can travel on days 6, 7, 8, 9, 10 ,11, 12)


Input
Input Format

First line contains T the number of test cases

Second line contains 3 space separated integers c1, c2, c3 - costs of 1 day, 7 day and 30 day tickets respectively

Third line contains n, the size of days array

Fourth line contains n space separated integers

Input Constraints

1 <= T <= 10

1 <= c1, c2, c3 <= 1000

1 <= n <= 365

1 <= days[i] <= 365

All values in the days array are unique and in increasing order


Output
Print a single line,  the minimum cost you need to spend on tickets to be able to travel on all days in the given days array


Sample Input 1 

2
1 3 7
5
1 2 3 4 5
2 3 6
3
8 15 17
Sample Output 1

3
5*/
import java.util.*;
class Main{
     static int mincost(int[] days, int[] cost) {
        int dp[]=new int[days.length+1];
        return find(days,cost,0,dp);
    }
    static int find(int[] days, int[] cost,int i,int dp[]){
        if(i>=days.length)
            return 0;
        if(dp[i]>0)
            return dp[i];
        int r1=cost[0]+find(days,cost,i+1,dp);
        int j=i;
        int next=days[i]+6;
        for(;j<days.length;j++)
        {
            if(days[j]>next)
                break;
        }
        int r2=cost[1]+find(days,cost,j,dp);
              j=i+1;
              next=days[i]+29;
        for(j=i+1;j<days.length;j++)
        {
            if(days[j]>next)
                break;
        }
        int r3=cost[2]+find(days,cost,j,dp);
        return dp[i]=Math.min(r1,Math.min(r2,r3));
    }
       public static void main(String[] args){
      Scanner s=new Scanner(System.in);
          int t=s.nextInt();
        while(t-->0){
            int cost[]=new int[3];
            for(int i=0;i<cost.length;i++){
                cost[i]=s.nextInt();
            }
            int length=s.nextInt();
            int days[]=new int[length];
            for(int i=0;i<length;i++){
                days[i]=s.nextInt();
            }
           System.out.println(mincost(days,cost)); 
        }
        
    }
}
