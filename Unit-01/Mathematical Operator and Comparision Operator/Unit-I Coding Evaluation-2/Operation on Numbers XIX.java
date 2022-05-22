/*Description

You are given a number stored in a variable with the nameN

You have to do the following operations on the number stored in a variable with the nameN

1. Multiply the number with 10
2. Divide it by 5 to the number
3. Subtract 11 from the number
Print the result obtained after the three operations

For example, consider the value stored inN = 5. So, the result of the 3 operations with the following numbers

Step 1 : 5 * 10 = 50

Step 2 : 50 / 5 = 10

Step 3 : 10 - 11 = -1
Therefore, the final output of the number is-1

Input
The first and the only line of the input contains the value stored in the variableN

Output
Print the output after the operations described in the problem description

Sample Input 1 

5
Sample Output 1

-1
Hint

The value stored inN = 5. So, the result of the 3 operations with the following numbers
Step 1 : 5 * 10 = 50

Step 2 : 50 / 5 = 10

Step 3 : 10 - 11 = -1
Therefore, the final output of the number is-1*/
   public static void operationOnNumbers(int n){
    //write your code here
    System.out.println(n*10/5-11);
  }
