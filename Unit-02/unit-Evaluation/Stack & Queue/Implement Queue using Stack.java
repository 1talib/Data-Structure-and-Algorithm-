/*
Description

Complete the function of push and pop and front for a queue, stack object names are S1 and S2.

Expected Time complexity is O(N) for push and O(1) for pop and front.


Input
This is a function complete problem. You just have to complete the function. The input format given below is just for your understanding.

The first line of the input contains Q, the number of queries to be executed.

Each query X is of type X = 0, X = 1 or X = 2.

Query X = 0 indicates, an element Y to be pushed into the queue.

Query X = 2 indicates, an element to be removed from the queue.

Query X = 1 indicates, an element to be peeked from the queue.


Output
For each query of type X = 1, print the value at the front of the queue.


Sample Input 1 

6
0 1
0 2
0 3
1 
2
1
Sample Output 1

1
2*/
import java.util.Stack;
class Solution{
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public void add(int data){
        while (!stack1.empty()) stack2.push(stack1.pop());
        stack1.push(data);
        while (!stack2.empty()) stack1.push(stack2.pop());
    }
    public int remove(){
        int x=-1;
        if(!stack1.empty()){
            x= stack1.pop();
        }
        return x;
    }
    public int front(){
        int x=-1;
        if(!stack1.empty()){
            x= stack1.peek();
        }
        return x;
    }
}
