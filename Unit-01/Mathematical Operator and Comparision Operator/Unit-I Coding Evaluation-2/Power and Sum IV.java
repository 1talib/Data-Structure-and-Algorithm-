/*Description

You are given two numbers stored in variables with the nameNandMrespectively
You have to find the value ofsum, such thatsum = N^4 + M^4
For example, consider the value stored inN = 2, andM = 3
Therefore,N^4 = 2*2*2*2 = 16, andM^4 = 3*3*3*3 = 81
Therefore,sum = 16 + 81 = 97, which is the required answer

Input
The first and the only line of the input contains the value stored inNandMrespectively

Output
Print the value ofsumas shown in the problem statement

Sample Input 1 

2 3
Sample Output 1

97
Hint

In the sample test case, the value stored inN = 2, andM = 3

Therefore,N^4 = 2*2*2*2 = 16, andM^4 = 3*3*3*3 = 81
Therefore,sum = 16 + 81 = 97, which is the required answer*/
public static void powerAndSum(int n,int m){
    //write your code here
    System.out.println(n*n*n*n+m*m*m*m);
  }
