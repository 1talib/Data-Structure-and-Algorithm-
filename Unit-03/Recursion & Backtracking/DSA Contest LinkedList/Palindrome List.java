/*Description

Given a singly linked list, determine if it is a palindrome.
No need to take any input, You'll be given the pointer to the head of the linked list,Complete the function belowand return true if it's a palindrome and false if otherwise.


Input
This is a function complete problem.

Refer to sample input for understanding

The first line contains the number of nodes (n)

Next n lines contains the nodes of the linked list.

n <= 1000

list[i] <= 1000


Output
Complete the function


Sample Input 1 

3
1
2
1
Sample Output 1

true*/
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
class Solution { 
    public static boolean check(List <Integer> list){
        int k = list.size()-1; 
        int i = 0; 
        while (i <= k){ 
        if (list.get (i) != list.get(k)) return false;
        i++; 
        k--; 
          } 
        return true;
       } 
    public static boolean detectPalindrome(Node a){
        List<Integer>list = new ArrayList<>(); 
        while (a != null){ 
        list.add(a.data); 
        a = a.next; 
              } 
        return check(list); 
         }
    }
// class Solution{
//   public static boolean detectPalindrome(Node a){
//     //complete this function.
    
//     Node pre=null;
//     Node temp=a;
//     Node current=a;
//     Node future=null;
    
//     while(temp!=null){
//       future=temp.next;
//       temp.next=pre;
//         pre=temp;
//       temp=future;
//     }
    
//     while(current!=null){
//       if(current.data != pre.data) return false;
//       current=current.next;
//       pre=pre.next;
//     }
//     return true;
//   }
// }
