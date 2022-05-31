/*
Description

Given n passengers who are going to board the ship for a journey. You are the captain of the ship and are responsible for the safety of the passengers.

You have an array W of size n which has weights of all the passengers. For ensuring the safety of the passenger, you are required to calculate the minimum number of lifeboats needed for the journey.

Each lifeboat can carry at most 2 people at the same time, provided the sum of the weights of those people is within the limit k. (Max holding capacity of a lifeboat).

It is ensured that each person can be carried by a lifeboat.


Input
The first line of the input contains one integer t (1 ≤ t ≤ 10) — the number of test cases. Then t test cases follow.

The first line of each test case contains 2 integers n and k (1 ≤ n, k ≤ 100000) — The number of people and the weight limit of a boat respectively.

The second line of each test case contains n integers (1 ≤ Wi ≤ k). The weight of each individual person.


Output
For each test case, print the answer: The number of lifeboats required.


Sample Input 1 

2
4 5
3 5 3 4
4 3
1 2 2 3
Sample Output 1

4
3*/
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i<t; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int [] arr = new int [n];
         for (int i1 = 0; i1<n; i1++){
             arr[i1] = sc.nextInt();
        }
        System.out.println(solve(arr, n, k));
       }
    }
    public static int solve( int arr[], int n, int k){
        Arrays.sort(arr);
        int weight = 0;
        int ans = 0;
        int i = 0; 
        int j = n-1;
        while(i <= j){
            weight = arr[i] + arr[j];
            if(weight<=k){
                i++;
              }
            j--;
            ans++;
        }
        return ans;
    }
}
// const findBoat = (array, n, k) => {
//   array.sort((a, b) => a - b);
//   let i = 0,
//     j = n - 1,
//     count = 0;
//   while (i <= j) {
//     count++;
//     if (array[i] + array[j] <= k) i++;
//     j--;
//   }
//   console.log(count);
// };
// const runProgram = (input) => {
//   input = input.trim().split("\n");
//   let cases = +input[0],
//     line = 1;
//   for (let i = 0; i < cases; i++) {
//     let [n, k] = input[line++].trim().split(" ").map(Number);
//     let array = input[line++].trim().split(" ").map(Number);
//     findBoat(array, n, k);
//   }
// };
// if (process.env.USERNAME === "") {
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
