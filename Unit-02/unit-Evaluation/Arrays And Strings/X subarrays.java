/*
Description

Given a array A having N positive integers. Count all the subarrays of A having length X, such that each subarray has no integer greater than K.


Input
First line: Single integer T denoting the number of test cases.
For each test case:
First line: Three space separated integers denoting the value of N, K and, X.
Next line : N single space separated integers denoting the elements of array A.
Constraints:
1 <= T<= 50
1<= N <= 1000000
1 <= A[ i ], K <= 100000
1 <= X <= N

Output
For each test case, print in a new line a single integer denoting the number of subarrays.


Sample Input 1 

1
5 3 2
1 3 2 5 1
Sample Output 1

2
Hint

Given for the only test case,
N = 5, K = 3, X = 2

The following subarrays of length 2 have no integer greater then 3 in them :
[ 1, 3 ], [ 3, 2 ].

No other subarray is possible.*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner talib = new Scanner(System.in);
        int test = talib.nextInt();
        while(test>0){
        int num = talib.nextInt();
        int Z = talib.nextInt();
        int y = talib.nextInt();
        int [] za = new int [num];
        for (int i = 0; i<num ; i++){
            za[i] = talib.nextInt();}
            int ans = 0, count = 0;
            for (int i = 0; i < y; i++){
                if (za[i] > Z){
                    count+=1;}
                    } 
                  if (count == 0){
                      ans +=1;
                  }
                   for (int i = y; i < num; i++){
                   if (za[i] > Z){
                    count+=1;}
                    if (za[i-y] > Z){
                    count-=1;}
                    if (count == 0){
                    ans+=1;}
                  }
           System.out.println(ans);
           test -= 1;}
    }
}
