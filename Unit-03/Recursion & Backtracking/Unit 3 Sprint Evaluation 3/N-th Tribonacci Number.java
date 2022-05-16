/*
Description

The Tribonacci sequence Tn is defined as follows:

T0= 0, T1= 1, T2= 1, and Tn+3= Tn+ Tn+1+ Tn+2 for n >= 0.

Givenn, return the value of Tn mod 10^9+7.


Input
Input Format

The first line contains the number of testcase T

Then T lines follow, each containing an integer N

Constraints

1<=T<=10^5

1<=N<=50


Output
For each test case print the value of Tn in a new line


Sample Input 1 

1
4
Sample Output 1

4
Hint

T_3 = 0 + 1 + 1 = 2
T_4 = 1 + 1 + 2 = 4
*/
import java.util.*; 
class Main{ 
    public static void main(String[] args){ 
        Scanner sc=new Scanner(System.in); 
        int t=sc.nextInt(); 
        while(t-->0){ 
        int n=sc.nextInt(); 
        long fib = 0; 
        long []fibarr=new long[n+1]; 
        for(int i=0;i<n+1;i++){ 
        fibarr[i]=-1;
           } 
      System.out.println(trifib(n, fibarr, fib));
        }
    }
      public static long trifib(int n,long []fibarr,long fib){
          if(n==0){ 
            return 0; 
          }
        if(n==1 || n==2){ 
            return 1;
        }
        if(fibarr[n]!=-1){
        return fibarr[n]; 
            } 
        fib = trifib(n-1, fibarr, fib)+trifib(n-2, fibarr, fib)+trifib(n-3,fibarr, fib); 
        fibarr[n]=fib;
        return fib;
      }
}
