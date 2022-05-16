/*
Description

Ross is skilled in calculations, he can do most of the complex calculations in head but he is stuck with this quesiton and wants your help.

Ross wants to solve the given mathematical equation which states that, he needs to find the east non-negative integer Xo, that shall make the value of given equation atleast K i.e.,

A Xo^2 + B Xo + C >= K

He is given A,B,C and K, which form the above equation. He has to answer T independent test cases.

Output -1 if there is no possible positive value of Xo


Input
Input Format :

Number of test cases, space seperated values of A B C K respectively



Constraints :

- A, B, C <= 100000

- K <= 10000000000

- T <= 100000


Output
The value of Xo


Sample Input 1 

1
3 2 4 15
Sample Output 1

2 */
import java.io.*;
import java.util.*;
import java.lang.*;
class Main{
    public static long sum ( long a ,long b, long c, long val){
        long sum = a*val*val + b*val +c; 
        return sum ;
    }
    public static long solve ( long a, long b, long c, long k){
        if( k< c) return-1;
        long ans = -1;
        long low = 0;
        long high = k-c;
        while (low <= high){
            long mid = low + ( high-low)/2;
            long sum = sum (a,b,c,mid);
            if ( sum > k){
                ans=mid;
                high = mid -1;
            }else if ( sum  < k){
                low = mid +1;
            }else{
                return mid ;
            }
        }
        return ans ;
    }
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ( t--!=0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long k = sc.nextLong();
            System.out.println(solve(a,b,c,k));
        }
    }
}
