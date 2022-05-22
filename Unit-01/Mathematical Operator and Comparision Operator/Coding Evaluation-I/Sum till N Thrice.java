/*Description

You are given a numberNstored in a variable with the nameN

You have to find the sum of firstNnatural numbers in the range of1 to N, including the value stored inNitself, but each number should be added thrice

For example, consider the value stored inN = 3, therefore, the sum of firstNnatural numbers issum = 1 + 2 + 3, but each number has to be added thrice

Therefore,sum = 1 + 1 + 1 + 2 + 2 + 2 + 3 + 3 + 3 = 18, which is the required answer


Input
The first and the only line of input contains the value stored inN

Output
Print the value ofsumas shown in the problem statement

Sample Input 1 

3
Sample Output 1

18
Hint

In the sample test case, the value stored inN = 3, therefore, the sum of firstNnatural numbers issum = 1 + 2 + 3, but each number has to be added thrice

Therefore,sum = 1 + 1 + 1 + 2 + 2 + 2 + 3 + 3 + 3 = 18, which is the required answer*/
public static void sumTillNThrice(int n){
    //write your code here
    int sum = 0;
    for(int i=0;i<=n;i++){
       sum = sum+i*3;}
     System.out.println(sum);}
