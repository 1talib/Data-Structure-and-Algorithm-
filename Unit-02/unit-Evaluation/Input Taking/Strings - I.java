/*
Description

Single String, where the size of the string is given


Input
The first line of the input containsN, the size of the string

The next line contains the string itself


Output
Print the string given as input, in terms of output, as shown in the sample test case

Sample Input 1 

4
aman
Sample Output 1

aman*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String talib = scan.next();
        System.out.print(talib);
        }  
    }
