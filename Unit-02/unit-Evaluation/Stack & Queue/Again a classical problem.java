/*
Description

A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].

Two brackets are considered to be a matched pair if the opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. There are three types of matched pairs of brackets: [], {}, and ().

A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, {[(])} is not balanced because the contents in between { and } are not balanced. The pair of square brackets enclose a single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].

By this logic, we say a sequence of brackets is balanced if the following conditions are met:

It contains no unmatched brackets.

The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.

Given a string, you have to comment if it is balanced or not


Input
Input Format

First line of input contains t which is the number of test cases present in the question

Each test case has a string

Constraints

t < 100

length of string < 100


Output
Print "balanced" if the string is balanced, otherwise print "not balanced" in case the string is not balanced


Sample Input 1 

3
{([])}
()
([]
Sample Output 1

balanced
balanced
not balanced
*/
import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            String Str = sc.next();
            char[] arr = Str.toCharArray();
            Stack<Character> stack = new Stack<>();
            boolean match = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == '(' || arr[j] == '{' || arr[j] == '[') {
                    stack.push(arr[j]);
                } else {
                    if (stack.isEmpty()) {
                        match = false;
                        break;
                    }
                    if (stack.peek() == '(' && arr[j] == ')') {
                        stack.pop();
                    } else if (stack.peek() == '{' && arr[j] == '}') {
                        stack.pop();
                    } else if (stack.peek() == '[' && arr[j] == ']') {
                        stack.pop();
                    } else {
                        match = false;
                        break;
                    }
                }
            }
            if (match) {
                if (stack.isEmpty()) {
                    System.out.println("balanced");
                } else {
                    System.out.println("not balanced");
                }
            }
            if (!match) {
                System.out.println("not balanced");
            }
        } 
    }
}
