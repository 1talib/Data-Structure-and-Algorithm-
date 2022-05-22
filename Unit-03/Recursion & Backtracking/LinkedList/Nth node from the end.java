/*Description

Given a linked list consisting of nodesand given a number N. The task is to find the nth nodefrom the end of the linked list.

No need to take any input, just complete the function below and return the nth node.


Input
This is a function complete problem.

Refer to sample input for understanding

The first line contains the number nodes (t)

Next t lines contains the nodes of the linked list

Next line contains the number n

t <= 1000

list[i] <= 1000


Output
Complete the function


Sample Input 1 

3
1
2
3
1
Sample Output 1

3*/
/*
class Node{
  int data;
  Node next;
  
  Node(int data,Node next){
    this.data = data;
    this.next = next;
  }
  Node(int data){
    this.data = data;
    this.next = null;
  }
  Node(){
    this.data = 0;
    this.next = null;
  }
}
*/
class Solution{
  public int nthNode(Node head,int n){
    //write your code here.
     if ( head == null ) return -1 ; 
     Node temp = head ; 
     int count = 0 ;
     while(temp != null ){ 
        count++; 
        temp = temp.next; 
     } 
     count  = count - n; 
     temp = head; 
     while (count != 0){ 
    temp = temp.next; 
    count--; 
       }
  return temp.data ;
     }
  }
//   // two pointer approach
//     Node temp1=head;
//     Node temp2=head;
    
//     for(int i=0; i<n && temp1!=null; i++) temp1=temp1.next;
    
//     while(temp1 !=null){ 
//       temp1=temp1.next;
//       temp2=temp2.next;
//     }
//     return temp2.data;
//   }
// }

