/*Description

You are given two numbers, stored in a variable with the names,a, b

You have to find the sum ofXandY, such that

1. X = (a*9) + (b*4)

2. Y = (a*5) + (b*7)

Find the value of sum, such thatsum = X + Y


Input
The first and the only line of the input contains the value stored in thea, b


Output
Print the value of the sum, as explained in the problem statement


Sample Input 1 

4 5
Sample Output 1

111
Hint

In the sample test case, the value stored ina = 4, b = 5

The value of

X = (4*9) + (5*4) = 36 + 20 = 56

Y = (4*5) + (5*7) = 20 + 35 = 55

Therefore, the value ofsum = 56 + 55 = 111, which is the required output*/
public static void sumTwoEquations(int a,int b){
    //write your code here
   int X = (a*9) + (b*4);
    int Y = (a*5) + (b*7);
    int sum = X+Y;
    System.out.print(sum);
  }
