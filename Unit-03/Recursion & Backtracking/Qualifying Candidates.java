/*Description

Recently Masai School organized a contest for admissions and thousand of candidates appeared for it. You are responsible for declaring the results out. Given an array, A of size n which contains the score of the n candidates who appeared for the test. You are also provided with a cutoff rank from Masai School up to which they would be taking candidates in their courses. Find the number of students who will be selected from this contest.

Note that candidates with equal scores will have equal ranks, but the candidate with the next lowest score will be ranked based on the position within the list of all candidates' scores.

For example, if there are five candidates, and four candidates tie for first place, their ranks would be 1,1,1,1 and 5.


Input
The first line of the input contains one integer t (1 ≤ t ≤ 10) — the number of test cases. Then t test cases follow.

The first line of each test case contains 2 integers n and k (1 ≤ n ≤ 100000, 1 ≤ k ≤ n) — the number of candidates and the cutoff rank.

The second line of each test case contains n integers (1 ≤ Ai ≤ 100) - The elements of the array A.


Output
For each test case, print the answer: The number of candidates selected.


Sample Input 1 

1
5 3
2 2 2 2 1
Sample Output 1

4
Hint

There are five candidates, and four candidates tie for first place, their ranks would be 1,1,1,1 and 5. Hence 4 people qualify.*/
// import java.io.*;
// import java.lang.*;
// import java.util.*;
// class comp implements Comparator <Integer>{
//     public int compare (Integer a, Integer b){
//         return b - a ;
//     }
// }
// class Main{
//     public static int solve (Integer[] arr, int k){
//         int [] ans = new int[arr.length];
//         int count = 0;
//         ans [0] = 1;
//         for ( int i = 1; i < arr.length; i++){
//             if (arr[i] == arr[i-1]) ans[i] = ans [i-1];
//             else ans[i] = i+1;
//         }
//         for (int i = 0; i < ans.length; i++) if ( ans[i] <= k) count++;
//       return count; 
//     }
//     public static void main( String[] args){
//         Scanner sc = new Scanner (System.in);
//         int t = sc.nextInt();
//         while ( t--!=0){
//             int n = sc.nextInt();
//             int k = sc.nextInt();
//             Integer [] arr = new Integer[n];
//             for ( int i = 0; i < n; i++) arr[i] = sc.nextInt();
//             Arrays.sort(arr,new comp());
//             System.out.println(solve(arr, k));
//         }
//     }
// }
// function runProgram(input){
//     input = input.split("\n");
//     var t = +input[0];
//     var l = 0;
//     for(var i = 0; i<t; i++){
//         l++;
//         var x = input[l].split(" ");
//         var a = +x[0];
//         var b = +x[1];
//         l++;
//         var arr = input[l].split(" ").map(Number);
//         arr.sort(function(a, b) { return b-a;});
//         qualifying(arr,a,b); }
//      }
//       function qualifying(arr,a,b){
//       var val;
//       var count = 0;
//       var rank = 0;
//     for(var i = 0; i<a; i++){
//         if(arr[i]==val){
//             if(rank<=b){
//               count++;
//             }
//         }else{
//             rank = i+1;
//             if((rank)<=b){
//                 count++;
//             }
//         }
//         val = arr[i];
//     }
//     console.log(count);
// }
// if (process.env.USER === "Talib") {
//   runProgram(``);
// } else {
//   process.stdin.resume();
//   process.stdin.setEncoding("ascii");
//   let read = "";
//   process.stdin.on("data", function (input) {
//     read += input;
//   });
//   process.stdin.on("end", function () {
//     read = read.replace(/\n$/, "");
//     read = read.replace(/\n$/, "");
//     runProgram(read);
//   });
//   process.on("SIGINT", function () {
//     read = read.replace(/\n$/, "");
//     runProgram(read);
//     process.exit(0);
//   });
// }
import java.io.*;
import java.lang.*;
import java.util.*;
class comp implements Comparator <Integer>{
    public int compare (Integer a, Integer b){
        return b - a ;
    }
}
class Main{
    public static int solve (Integer[] arr, int k){
        int [] ans = new int[arr.length];
        int count = 0;
        ans [0] = 1;
        for ( int i = 1; i < arr.length; i++){
            if (arr[i] == arr[i-1]) ans[i] = ans [i-1];
            else ans[i] = i+1;
        }
        for (int i = 0; i < ans.length; i++) if ( ans[i] <= k) count++;
      return count; 
    }
    public static void main( String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while ( t--!=0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            Integer [] arr = new Integer[n];
            for ( int i = 0; i < n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr,new comp());
            System.out.println(solve(arr, k));
        }
    }
}
