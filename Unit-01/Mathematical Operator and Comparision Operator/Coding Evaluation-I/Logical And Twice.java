/*
Description

You are given two numbers stored in variables with the name,a and b

Print the result of the following operation

a > 25 && b > 20 && a != b

Input
The first and the only line of the input contains two values stored ina and brespectively


Output
Print the result of the operation, as shown in the problem statement


Sample Input 1 

26 21
Sample Output 1

true
Sample Input 2 

28 28
Sample Output 2

false
Hint

For Sample Test Case 1 :

In the sample test case 1, the value stored ina = 26, andb = 21

The result of the operationa > 25 && b > 20 && a != b, will be true, as the value stored ina > 25, and the value stored inb > 20, anda != b

Hence, the outputtrue

For Sample Test Case 2 :

In the sample test case 2, the value stored ina = 28, andb = 28

The result of the operationa > 25 && b > 20 && a != b, will be false, as the value stored ina > 25, and the value stored inb > 20, buta != b, 28 != 28is false

Hence, the outputfalse*/
public static void logicalAndTwice(int a,int b){
    //write your code here
    if (a>25&&b>20&&a!= b){
       System.out.println(true);   
    } else{
        System.out.println(false);  
   }
 }
