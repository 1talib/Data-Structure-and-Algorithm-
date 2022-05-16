/*
Description

India and New Zealand are going to be playing in the final of the World Test Championship, and Virat Kohli, the captain of the Indian Cricket Team, desperately wants to win the game

Now Virat Kohli is very superstitious. He has a superstitious that if the sum of the jerseys of the captain and the vice - captain of the team is exactly equal toK, the team wins one hundred percent.

Now, he has N jersey numbers given in the form of an array, and he has to find out if there are two jersey numbers, whose sum is equal toKor not. The jersey numbers have been kept in strictly increasing order. Help him, accomplish this task


Input
The first line of the input containsT, the number of test cases.

The first line of each test case, containsN, the number of Jerseys, andKis the required sum

The next line containsNspace separated integers, indicating the jersey numbers

1 <= T <= 10

2 <= N <= 1000, 2 <= B <= 3*10^5

1 <= Ai <= 10^5


Output
For each test case, printYes, if there are two jerseys for whom the sum of jersey numbers isK, else printNo, on a new line.


Sample Input 1 

2
5 31
10 11 13 17 21
5 44
10 11 13 17 21
Sample Output 1

Yes
No
Hint

In the first test case, the sum of jersey number 21 and that of 10 is equal to K = 31, therefore, the answer isYes

In the second test case, no two jerseys have the sum equal toK = 44. Therefore, the answer isNo.*/
import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
    public static int [] solve(int[] arr, int k){
        int low = 0;
        int high = arr.length-1;
        int [] ans = {-1,-1};
        while(low < high){
            int sum = arr[low] + arr[high];
            if (sum == k){
                ans[0] = low;
                ans[1] = high;
                return ans;
            }else if (sum > k) high --;
            else { 
                low++;
            }
        }
        return ans ;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int [] arr = new int[n];
            for(int i=0; i<n; i++) arr [i] = sc.nextInt();
                int [] ans = solve(arr,k);
      if (ans [0] == -1 && ans[1] == -1) System.out.println("No");
         else {
             System.out.println("Yes");
            }
        }
      }
    }

// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int tc = sc.nextInt();
//         for(int n = 0; n < tc; n++){
//             int N = sc.nextInt();
//             int K = sc.nextInt();
//             int arr[]=new int[N];
//             for(int i=0; i<N; i++){
//                 arr[i]=sc.nextInt();
//             }
//             int start=0, end=N-1, count=0;
//             while(start<end){
//                 int sum = arr[start]+arr[end]; 
//                 if(sum < K){
//                     start++;
//                 }
//                 else if(sum>K){
//                     end--;
//                 }
//                 else{
//                     end--;
//                     start++;
//                     count++;
//                 }
//             }
//             if(count>0){
//                 System.out.println("Yes");
//             }
//             else{
//                 System.out.println("No");
//             }
//         }
//     }
// }

