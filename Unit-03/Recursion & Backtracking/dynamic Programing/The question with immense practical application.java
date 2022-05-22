/*
Description

The solution to this question is a very popular algorithm used for:

Spell correction and suggestion by search engines
Computational Biology
Machine Translation
Information Extraction
Speech Recognition
NLP
Needleman‐Wunsch Algorithm, etc. to name a few
"Edit distance" (also known as Levenshtein distance) measures the minimum number of simple changes to move from one string to another. Possible changes include the insertion of a single character, the deletion of a single character, or the substitution from one character to another. Your program must calculate the edit distance between pairs of strings.


Input
Input Format

First line contains the number of test cases.

Each test case is presented on subsequent pairs of lines with a string on each line. Strings will consist of non-whitespace printable characters.

Constraints

Length of both strings <= 2000






Output
The edit distance of each test case should be output, one value per line.


Sample Input 1 

3
abcde
abde
abde
abcde
abcde
abxde
Sample Output 1

1
1
1*/
import java.util.*; 
  class Main{ 
public static void main(String args[]){ 
    Scanner sc = new Scanner(System.in); 
    int t = sc.nextInt();
    while(t-->0){
        String s1 = sc.next(); 
        String s2 = sc.next (); 
        int a = s1.length(); 
        int b = s2.length(); 
        int dp[][] = new int[a+1][b+1];
        for (int i=0; i<=a; i++){ 
        for (int j=0; j<=b; j++){ 
        dp[i][j] = -1;
             }
           }
        System.out.println(strChk(s1, s2, a, b, dp));
        }
    }
    public static int strChk(String s1, String s2, int a, int b, int dp[][]){ 
       if(a==0) 
       return b; 
       if(b==0) 
       return a; 
       if(dp[a][b] != -1) 
        return dp[a][b]; 
         if (s1.charAt(a-1) == s2.charAt(b-1)) 
        return strChk (s1, s2, a-1, b-1, dp);
        dp[a][b] = 1 + minIt(strChk(s1, s2, a, b-1, dp), // Insert element 
        strChk(s1, s2, a-1, b, dp), // Remove elemrnt
        strChk(s1, s2, a-1, b-1, dp));//replace element 
           return dp[a][b]; 
        }
          public static int minIt (int a, int b, int c){
           int temp  = Math.min(a, b); 
           return Math.min(temp, c); 
     }
}

// function runProgram(input){
//     input =input.trim().split("\n");
//     let tc=+input[0];
//     for(let i=1;i<=tc*2;i+=2){
//         let str1=input[i];
//         let str2=input[i+1];
//         let m=str1.length;
//         let n=str2.length;
//         let dp = new Array(m + 1);
//         for(let i=0;i<m+1;i++)
//         {
//             dp[i]=new Array(n+1);
//             for(let j=0;j<n+1;j++)
//             {
//                 dp[i][j]=-1;
//             }
//         }
//         console.log(minDis(str1,str2,m,n,dp));
//     }
// }
// function minDis(s1,s2,n,m,dp)
// {

//   if(n === 0)  
//     return m;
//   if(m === 0)  
//     return n;
 
//   if(dp[n][m] != -1)  
//     return dp[n][m];
//   if(s1[n - 1] == s2[m - 1])
//   {         
//     if(dp[n - 1][m - 1] == -1)
//     {             
//       return dp[n][m] = minDis(s1, s2, n - 1, m - 1, dp);         
//     }      
//     else
//       return dp[n][m] = dp[n - 1][m - 1]; 
//   }
    
  
//   else
//   {         
//     let m1, m2, m3;     
//     if(dp[n-1][m] != -1)
//     {  
//       m1 = dp[n - 1][m];    
//     }         
//     else
//     { 
//       m1 = minDis(s1, s2, n - 1, m, dp);    
//     }          
              
//     if(dp[n][m - 1] != -1)
//     {              
//       m2 = dp[n][m - 1];          
//     }          
//     else
//     {  
//       m2 = minDis(s1, s2, n, m - 1, dp);    
//     }                                 
     
//     if(dp[n - 1][m - 1] != -1)
//     {  
//       m3 = dp[n - 1][m - 1];    
//     } 
//     else
//     { 
//       m3 = minDis(s1, s2, n - 1, m - 1, dp);     
//     }   
//     return dp[n][m] = 1 + Math.min(m1, Math.min(m2, m3));      
//   }
// }
// // function for find min
// function min(x,y,z){
//     if(x<y && x<z){
//         return x;
//     }else if(y<x && y<z){
//         return y;
//     }else{
//         return z;
//     }
// }
// if (process.env.USER === "") {
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
