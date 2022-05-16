/*
Description

Given two integers a and b, we need to find the value of a^b recursively.

Expected Time Complexity - O(logb).


Input
The first line of the input contains two integers a and b (1 ≤ a ≤ 10) and (0 ≤ b ≤ 9).


Output
For each test case, print the answer: The value of a^b.


Sample Input 1 

2 4
Sample Output 1

16 */
// import java.util.Scanner;
// public class Main {
//     public static int Power(int a, int b) {
//         if (b == 0) {
//             return 1;
//         } else if (b == 1) {
//             return a;
//         } else {
//             return a * Power(a, b-1);
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.print(Power(a, b));
//     }
// }
import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
    public static int power (int t, int z, int res){
        if ( t == 0) return 0;
        if ( z == 0) return res;
        if( z%2 == 1 ){
        res *= t;
        z--;
       }
         z /= 2;
         t *= t;
      return power(t, z, res);
   }  
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(power(a, b, 1));
    
       }
    }

