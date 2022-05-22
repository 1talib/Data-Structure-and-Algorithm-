/*
Description

You are given a number stored in a variable with the nameN, and another number stored in a variable with the nameM

You have to perform the following operations on the value stored inN

1. Multiply the value stored in N with 8
2. Add 6 to the value stored in N 
3. Subtract 15 from the value stored in N

You are given another number stored in the variableM

If the value ofNafter performing the above operations is greater thanM, printGreater!, else if the value is equal, printEqual, else printLesser!

For example, consider the value stored inN = 2, and the value stored inM = 6

Then, after performing the above operation, the value stored inNbecomes

1. N = N * 8 = 16
2. N = N + 6 = 22
3. N = N - 15 = 7

Now, the value stored inMis 6, which is lesser than the value stored inN. Therefore, the output isGreater!


Input
The first and the only line of the input contains the value stored inNandM

Output
Print the output according to the condition shown in the problem statement

Sample Input 1 

2 6
Sample Output 1

Greater!
Hint

In the sample test case, consider the value stored inN = 2, and the value stored inM = 6

Then, after performing the above operation, the value stored inNbecomes
1. N = N * 8 = 16
2. N = N + 6 = 22
3. N = N - 15 = 7

Now, the value stored inMis 6, which is lesser than the value stored inN. Therefore, the output isGreater!*/
public static void operationOnNumbers(int n,int m){
    //write your code here
    int N = n*8+6-15;
    if(N>m){
        System.out.println("Greater!");
    }
    else if(N==m){
        System.out.println("Equal");
  }
  else {
        System.out.println("Lesser!");
    }
  }
