/*Description

Given the pointer to the head node of a linked list, change thepointers of the nodes so that their order is reversed. The head pointer given may be null meaning that the initial list is empty.

Complete thereversefunction in the editor below.

reversehas the following parameter:

LinkedListNode pointer head:a reference to the head of a list

Input
The first line contains an integer t, the number of test cases.

Each test case has the following format:

The first line contains an integer n, the number of elements in the linked list.
Each of the next n linescontains an integer, the data valuesof the elements in the linked list.

t <= 50

n <= 1000

list[i] <=1000


Output
For each test case print the updated Linked List


Sample Input 1 

1
5
1
2
3
4
5
Sample Output 1

5 4 3 2 1 */
/*
class Node{
  int data;
  Node next;
  
  public Node(int data,Node next){
    this.data = data;
    this.next = next;
  }
  public Node(int data){
    this.data = data;
    this.next = null;
  }
  public Node(){
    this.data = 0;
    this.next = null;
  }
}
*/
class Solution{
public static Node reverseLinkedList(Node a){ 
    Node current = a; 
    Node after = null; 
    Node before = null; 
    while (current != null){ 
     after = current.next; 
     current.next = before; 
     before  = current; 
     current = after; 
         } 
    return before;
      }
   }
// class Solution{
//   public static Node reverseLinkedList(Node a){
//     //write your code here.
    
//     Node temp=a;
//     Node previousNode=null;
//     Node currentNode=null;
    
//     while(temp!=null){
//       currentNode=temp;
//       temp=temp.next;
//       currentNode.next=previousNode;
//       previousNode=currentNode;
//       a=currentNode;
//     }
//     return a;
//   }
// }

