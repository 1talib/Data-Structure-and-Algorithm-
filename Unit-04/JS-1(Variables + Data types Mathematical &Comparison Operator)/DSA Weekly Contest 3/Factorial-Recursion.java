/*Description

The factorial of a positive integer N is the product of all positive integers less than or equal to n:

Given a number N your task is to write a program that calculates factorial of N


Input
Input Format

First and the only line contains N



Constraints

N<15


Output
Output the factorial value of N


Sample Input 1 

5
Sample Output 1

120
Hint

Sample Explanation

Factorial of 5 = 5*4*3*2*1 = 120*/

import java.util.Scanner;
public class Main{  
    static int factorial(int n){      
          if (n == 1)      
            return 1;      
          else {     
            return(n * factorial(n-1));}      
    }      
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(factorial(num));
    }
}  

// function runProgram(input){
//     var N = Number(input)

//     function factorial(n){
//         if(n > 1){
//             return n * factorial(n-1)
//         }
//         else{
//             return 1
//         }
//     }

//     console.log(factorial(N))
// }
// process.stdin.resume();
// process.stdin.setEncoding("ascii");
// let read = "";
// process.stdin.on("data", function (input) {
//     read += input;
// });
// process.stdin.on("end", function () {
//     read = read.replace(/\n$/,"")
//   runProgram(read);
// });
// process.on("SIGINT", function () {
//     read = read.replace(/\n$/,"")
//     runProgram(read);
//     process.exit(0);
// });
