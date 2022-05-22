/*Description

There are N buildings in Bangalore, numbered 1,2,…,N. For each i (1≤i≤N), the height of building i is hi.

After visiting Patna, Spiderman has come to visit Bangalore and as you know he has a superpower of jumping from one building to the other

He is initially on building 1. He will repeat the following action some number of times to reach building N:

If the spiderman is currently on building i, jump to one of the following: Building i+1,i+2,…,i+K. Here, a cost of |hi−hj| is incurred, where j is the building to land on.

(|hi - hj| is the absolute difference between the heights of buildings)

Find the minimum possible total cost incurred before the Spiderman reaches building N.


Input
Input Format

First line contains N and K

Second line contains n space separated integers representing h[i]

Constraints

2≤ N ≤100000

1≤ hi ≤10000

K <= 100




Output
Print the minimum possible total cost incurred.


Sample Input 1 

5 3
10 30 40 50 20
Sample Output 1

30
Sample Input 2 

10 4
40 10 20 70 80 10 20 70 80 60

Sample Output 2

40
Hint

Sample 1 Explanation

If we follow the path 1 → 2 → 5, the total cost incurred would be |10−30|+|30−20|=30.

Sample 2 Explanation

If we follow the path 1 → 4 → 8 → 10, the total cost incurred would be |40−70|+|70−70|+|70−60|=40.

*/
import java.util.*; 
class Main{ 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt(); 
        int k = sc.nextInt(); 
        int[] arr = new int[size]; 
        for(int i=0; i < size; i++){ 
          arr[i]=sc.nextInt(); 
        }
        int []dp = new int[arr.length]; 
        int a = ans(arr,k, arr.length-1,dp); 
        System.out.println(a); 
       }
        public static int ans(int[] arr,int k, int size,int[] dp){ 
        if(size==0){ 
            return 0; 
        }
            if(dp[size]!=0){
                return dp[size];
            }
        int mini=99999; 
        for(int i=1;i<=k;i++){ 
            if(size>=i){
     mini=Math.min(ans(arr,k,size-i,dp)+Math.abs(arr[size]-arr[size-i]),mini);
            }
    dp[size]=mini;
        }
    return dp[size];
      }
  }


// function runProgram(input) {
//  input = input.trim().split("\n")
//  var [n,k] = input[0].trim().split(" ").map(Number)
//  var arr = input[1].trim().split(" ").map(Number)
//  var dp = []
//  for(var i=0; i<n; i++){
//      dp.push(0)
//  }
//  spiderman(n,k,arr,dp)
// }

// function spiderman(n,k,arr,dp){
//   for(var i=n-1; i>=0; i--){
//      let minimum = 100000
//      var jump = 1
//      while(jump <= k && jump+i < n){
//         var j = i+jump
//         var val = Math.abs(arr[i]-arr[j]) + dp[j]
//         minimum = Math.min(minimum,val)
//         dp[i] = minimum
//         jump++
//      }
//   }
//     console.log(dp[0]);
//  }
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
