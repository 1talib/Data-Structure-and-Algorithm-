/*
Description

Given a number, stored in the variable with the namenum

Print the multiplication table of the value stored innum

For example, if the value stored innumis 2, then the output should be

2
4
6
8
10
12
14
16
18
20
Print each number, on a new line


Input
The first and the only line of the input contains the value stored innum


Output
Print the multiplication table of the value stored innum, in the format as shown in the problem statement


Sample Input 1 

3
Sample Output 1

3
6
9
12
15
18
21
24
27
30
Hint

In the sample test case, the value stored innum = 3. Therefore, the multiplication table ofnumis printed

Therefore, the output is

3
6
9
12
15
18
21
24
27
30*/
public static void multiplicationTableN(int num){
    //write your code here
    for (int i = 1; i<=10; i++){
    System.out.println(num*i);
    }
  }
