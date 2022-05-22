/*Description

Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.

Complete the function below and return the head of the new linked list.


Input
This is a function complete problem

To get a understanding of the input-

The first line contains the number of nodes in the first linked list (n1)

Next n1 lines contains the nodes of the first linked list

Next line contains the number of nodes in the second linked list (n2)

Next n2 lines contains the nodes of the second linked list

n1, n2 <= 1000

list[i] <= 1000


Output
Complete the function


Sample Input 1 

3
1
1
2
4
2
3
4
5
Sample Output 1

1 1 2 2 3 4 5*/
/*
class Node{
  int data;
  Node next;
  
  Node(int data){
    this.data = data;
    this.next = null;
  }
}
*/
class Solution{
  public Node mergeTwoLinkedList(Node a,Node b){
    if(a==null) return b;
    else if(b==null) return a;
    
    Node temp, head;
    
    if(a.data < b.data) {
      temp = head = a;
      a = a.next;
    } else {
      temp = head = b;
      b= b.next;
    }
    while(a!=null && b!=null) {
      if(a.data<b.data) {
        temp.next = a;
        a = a.next;
      } else {
        temp.next = b;
        b = b.next;
      }
      temp = temp.next;
    }
    if(a== null && b!=null) {
      temp.next = b;
    } else if(b==null && a!=null) {
      temp.next = a;
    }
    return head;
  }
}
