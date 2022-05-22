/*Description

You are given n strings indexed from 1,2,..,n each having length not more than 10. A string is strong if the first and the last characters of the string is a vowel.

You are very curious and so you have q queries each having two integers - start index and end index [si,ei].

You have to answer the number of strings that are strong in that given interval for each query.

Please see the sample I/O for more understanding.


Input
The first line of the input contains one integer n (1 ≤ n ≤ 100000) — the number of strings.

The second line of the input contains n strings separated by space. (1 ≤ length of each string ≤ 10).

The third line of the input contains one integer q (1 ≤ q ≤ 100000) — The number of queries.

The next q lines of each test case contain 2 integers si and ei (1 ≤ si ≤ ei ≤ n) - the indexes (start and end).


Output
For each query, print the answer in a new line: The number of strong strings in that interval (both inclusive).


Sample Input 1 

5
aba suna oua tes aba
5
1 5
2 4
1 3
3 5
5 5
Sample Output 1

3
1
2
2
1*/
import java.util.*;
import java.lang.*; 
import java.io.*; 
class Main { 
    public static boolean vowel (char c){ 
     if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') return true;
     return false ; 
     } 
     public static void main (String[] args){ 
         Scanner s = new Scanner (System.in) ; 
         int n = s.nextInt();
         String a[] = new String[n] ; 
         for ( int i = 0 ; i < a.length ; i++){
             a [i] = s.next();
             } 
            int [] dp = new int [n+1];
            dp [0] = 0; 
            int temp = 0;
            for ( int i = 0; i < a.length; i++){
                temp = vowel(a[i].charAt(0)) && vowel(a[i].charAt(a[i].length()-1)) ? 1 : 0;
         dp[i+1] = dp[i] + temp;
         } 
         int q = s.nextInt(); 
         for (int i = 0; i<q; i++){
             int x = s.nextInt();
             int y = s.nextInt();
             System.out.println(dp[y] - dp[x-1]);
             }
          }
       }
// const findVowel = (array, n) => {
//   let flag = false,
//     flag2 = false;
//   if (
//     array[0] == "a" ||
//     array[0] == "e" ||
//     array[0] == "i" ||
//     array[0] == "o" ||
//     array[0] == "u"
//   )
//     flag = true;
//   if (
//     array[n - 1] == "a" ||
//     array[n - 1] == "e" ||
//     array[n - 1] == "i" ||
//     array[n - 1] == "o" ||
//     array[n - 1] == "u"
//   )
//     flag2 = true;
//   if (flag && flag2) return true;
//   return false;
// };

// const runProgram = (input) => {
//   input = input.trim().split("\n");
//   let array = input[1].trim().split(" ");
//   let count = 0,
//     res = [];
//   for (let i = 0; i < array.length; i++) {
//     if (findVowel(array[i], array[i].length)) {
//       count += 1;
//     }
//     res.push(count);
//   }
//   for (let i = 3; i < input.length; i++) {
//     let [a, b] = input[i].trim().split(" ").map(Number);
//     if (a == 1) {
//       console.log(res[b - 1]);
//     } else console.log(res[b - 1] - res[a - 1 - 1]);
//   }
// };
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
