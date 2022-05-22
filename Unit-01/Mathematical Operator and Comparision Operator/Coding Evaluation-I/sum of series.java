/*
Description

Given two integers N, X. Find the value of the series: 1 + x + x*x  + x*x*x + x*x*x*x +-------N the term

WhereN is the no. of term,

X contains the value of x.



Note : If N <= 0 or X <= 0 print -1



For Example

Give N = 3, X = 2

We need to find the sum of first N=3 terms, having value of X=2
First 3 terms in Expression = 1 + x + x*x = 1 + 2 + 2*2 = 7
Answer is 7 

Input
The first and the only line of the input contains N and X,

Constraints

1 <= N <= 20

1 <= X <= 10


Output
Print the value of the series1 + x*x  + x*x*x + x*x*x*x +-------N the term


Sample Input 1 

3 2
Sample Output 1

7
Hint

Give N = 3, X = 2

We need to find the sum of first N=3 terms, having value of X=2
First 3 terms in Expression = 1 + x + x*x = 1 + 2 + 2*2 = 7
Answer is 7*/
public static void sumOfSeries(int n,int x){
    //write your code here
    if (n <= 0 || x <= 0 ){
   System.out.println("-1");
    }
    else{
        int sum = 0;
        for(int i=0;i<n;i++){
            int ans=1;
            for(int j=0;j<i;j++){
                ans*=x;
            }
            sum += ans;
        }
         System.out.println(sum);
    }
  }
   
