/*Description

Given a non-empty, singly linked list with the head nodehead, return a middle node of the linked list.

If there are two middle nodes, return the second middle node.

Complete the functionbelow, no need to take any input.


Input
This is a function complete problem.

Refer to sample input for understanding

The first line contains the number of nodes (t)

Next t lines contains the node of the linked list

t <= 1000

list[i] <= 1000


Output
Complete the function


Sample Input 1 

3
1
2
3
Sample Output 1

2*/
/*
class Node{
	int data;
	Node next;

	Node(){
		this.data = 0;
		this.next = null;
	}
	Node(Node next,int data){
		this.data = data;
		this.next = next; 
	}
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
*/
class Solution{
  public int middleNode(Node head){
    //write your code here.
    Node start = head;
    int length = 0;
    while(start.next!=null){
    length++;
      start = start.next;
    }
    length++;
    int half = length/2;
    while (half--> 0){
    head = head.next;
  }
  return head.data;
  }
}
