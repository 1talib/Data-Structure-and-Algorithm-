/*Description

Akash threw three dice, and they showed three numbers a, b, and c.

If there are two same numbers among a, b, and c, print the remaining number. Otherwise, print 0.


Input
Input Format

The first line contains three integers a, b, and c.

Constraints

1 <= a, b, c <= 6


Output
Print the number according to given conditions.


Sample Input 1 

2 5 2
Sample Output 1

5
Sample Input 2 

4 5 6
Sample Output 2

0
Sample Input 3 

1 1 1
Sample Output 3

1
Hint

For the first sample,

The first and third dice both showed 2, so we should print the number on the remaining dice, which is 5.

For the second sample,

Any two numbers are different, so we should print 0.

For the third sample,

Any two numbers are the same. Whichever two dice we choose, the number on the remaining dice will be 1.*/
public static void oddOneOut(int a,int b,int c){
    //write your code here
    if(a==b){
        System.out.print(c);}
     else if(b==c){
        System.out.print(a);}
     else if(c==a){
    System.out.print(b);}
    else {
        System.out.print(0);}}
