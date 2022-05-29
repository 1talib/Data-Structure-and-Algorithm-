/*Description

You are given a number stored in a variable with the nameN

Print the required pattern, such that for all numbers in the range[1, N], includingN, if the number iseven, print a single#, else printN*without space, on a new line

For example, consider the value stored inN = 5. Therefore, the required output is

*****
#
*****
#
*****


Input
The first and the only line of the input contains the value stored inN

Output
Print the required pattern as shown in the problem statement

Sample Input 1 

5
Sample Output 1

*****
#
*****
#
*****
Hint

In the sample inputN = 5. Therefore, the required output is

*****
#
*****
#
*****
*/
public static void starsAndHashes(int n){
    //write your code here
     for (int i=1;i<=n; i++){
         if(i%2!=0){
        for (int j=0;j<n;j++){
            System.out.print("*");}}
            else{
            System.out.print("#");}
        
        System.out.println();
    }
  }
