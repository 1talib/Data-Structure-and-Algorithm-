/*
Description

You have N friends whom you want to take to your birthday party. You know the amount you will have to spend on each of your friend. You have R amount of money with you. You will take any K out of N friends to party such that the sum of total expenses on those K friends is exactly equal to R rupees. Else in any other condition you won't take anyone to party. You have to find if it is possible to take them on party or not.

For instance, suppose you have 5 friends on whom you will have to spend 3,5,2,9,8 rupees respectively and you have 16 rupees, then yes it is possible to take them to party as 3+5+8 = 16. So, exact expenditure is possible.


Input
Input Format

First line contains 2 space separated integers that is N and R

Second line contains N space integers which are the expenses of each friend

Constraints

N < 1000

R < 1000


Output
Output Format

Output "Party" if it is possible to take them to party.

Else print "No Party"




Sample Input 1 

6 9
3 34 4 12 5 2
Sample Output 1

Party*/
import java.util.*; 
class Main{
    public static int sole (int [] arr , int i , int k , int [][] dp){ 
        if (k==0){ 
            return 1;
        }
         if (k < 0 || i == arr.length){
                return 0 ;
                }
            if (dp[i][k] != -1){
            return dp[i][k] ;
             } 
        int ans = sole ( arr , i+1 , k , dp ) ;
        ans = Math.max ( ans , sole (arr , i+1 , k-arr[i] , dp)); 
        dp [i][k] = ans ;
        return ans ;
        }
        public static void main (String [] args){
            Scanner sc = new Scanner (System.in) ; 
            int n = sc.nextInt (); 
            int k = sc.nextInt (); 
            int [] arr = new int [n] ;
            for (int i = 0 ; i < n ; i++){ 
                arr [i] = sc.nextInt ();
                } 
                int [][] dp  = new int[n+1][k+1]; 
                for ( int i = 0 ; i <= n ; i++ ){ 
                 for ( int j  = 0; j<k+1; j++ ){ 
                dp [i][j] = -1;
                }
            } 
         int ans = sole (arr, 0, k, dp); 
         if (ans == 1){ 
              System.out.println("Party"); 
             }else{
         System.out.println ("No Party");
             }
        }
}
// function runProgram(input) {
//   input = input.trim().split("\n");
//   let [n, sum] = input[0].trim().split(" ").map(Number);
//   let array = input[1].trim().split(" ").map(Number);
//   let dp = Array(n + 1).fill(-1);
//   for (let i = 0; i < dp.length; i++) {
//     dp[i] = Array(sum + 1).fill(-1);
//   }

//   for (let i = 0; i <= n; i++) {
//     for (let j = 0; j <= sum; j++) {
//       if (i === 0) dp[i][j] = false;
//       if (j === 0) dp[i][j] = true;
//     }
//   }

//   for (let i = 1; i <= n; i++) {
//     for (let j = 1; j <= sum; j++) {
//       if (array[i - 1] <= j) {
//         dp[i][j] = dp[i - 1][j - array[i - 1]] || dp[i - 1][j];
//       } else dp[i][j] = dp[i - 1][j];
//     }
//   }

//   let x = dp[n][sum];
//   x ? console.log("Party") : console.log("No Party");
// }
// if (process.env.USERNAME === "") {
// } else {
//   let read = "";
//   process.stdin.on("data", function (input) {
//     read += input;
//   });
//   process.stdin.on("end", function () {
//     runProgram(read);
//   });
// }
