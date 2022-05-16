/*
Description

Given a string, S. Find the length of the string using recursion.

Note: You are not allowed to use the length built-in property.


Input
Input Format

The single line  consists of string S

Constraints

1<= S length <= 200


Output
Print length of the given string S.


Sample Input 1 

masaischool
Sample Output 1

11*/
import java.util.*;
public class Main {
    public static int LR(String str) {
        if (str.equals("")) {
            return 0 ;
        } else {
            return LR(str.substring(1)) + 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(LR(str));
         }
    }
