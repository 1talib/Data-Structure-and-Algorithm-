/*
Description

There is a coding Tournament where 4 clubs are going to compete. Since the team selection is very critical in this competition,Rohit asked Harshit to help him in the team selection process.

There is a long queue of students from four clubs. Each student of a club have a different roll number. Whenever a new student will come, he will search for his clubmate from the end of the queue. As soon as he will find any of the club-mate in the queue, he will stand behind him, otherwise he will stand at the end of the queue. At any moment Harshit will ask the student, who is standing in front of the queue, to come and give his name and Harshit will remove him from the queue. There are Q operations of one of the following types:

E a b: A new student of club a whose roll number is b will stand in queue according to the method mentioned above.

D: Harshit will ask the student, who is standing in front of the queue, to come and put his name and Harshit will remove him from the queue


Input
Input Format :

First line contains an integer Q denoting the number of operations.

Next Q lines will contains one of the 2 types of operations.



Constraints :

Number of dequeue operations will never be greater than enqueue operations at any point of time.

1<=Q<=100000

1<=a<=4

1<=b<=50000


Output
For each 2nd (D) type of operation, print two space separated integers, the front student's club and roll number.


Sample Input 1 

5
E 1 1
E 2 1
E 1 2
D
D
Sample Output 1

1 1
1 2
Hint

Explanation :

E 1 1( This meansE club_Number roll_Number)

The 2 types of operations are :

E club_Number roll_Numbe:Insert in the queue
If the same club member already present in the queue, then insert the new entry  next to that
Otherwise, Insert at the last
D:Print and Remove the front of the queue


Test Case Explanation :

E 1 1     ===>  Insert in the Queue = [ (1,1) ]

E 2 1    ===>   Since Club Member 2 is not present in the queue, Then in this case , insert this entry in last  Queue = [(1,1) , (2,1) ]

E 1 2    ===>   Since Club Member 1 is already present, In this case insert the entry next to it Queue =[(1,1) , (1,2) ,(2,1) ]

D         ====>  Remove Front of queue and print  (1,1)  Now, Queue = [(1,2) ,(2,1) ]

D         ====>Remove Front of queue and print  (1,2)  Now, Queue = [(2,1) ]



Thus Final Output is :

(1,1)

(1,2)*/
// import java.util.LinkedList;
// import java.util.Queue;
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         Queue<Integer> club1 = new LinkedList<>();
//         Queue<Integer> club2 = new LinkedList<>();
//         Queue<Integer> club3 = new LinkedList<>();
//         Queue<Integer> club4 = new LinkedList<>();
//         Queue<Integer> allQueue = new LinkedList<>();
//         for (int i = 0; i < t; i++) {
//             String str = sc.next();
//             if (str.equals("E")) {
//                 int club = sc.nextInt();
//                 if (club == 1) {
//                     club1.add(club);
//                     club1.add(sc.nextInt());
//                     if (!allQueue.contains(club)) {
//                         allQueue.add(club);
//                     }
//                 } else if (club == 2) {
//                     club2.add(club);
//                     club2.add(sc.nextInt());
//                     if (!allQueue.contains(club)) {
//                         allQueue.add(club);
//                     }
//                 } else if (club == 3) {
//                     club3.add(club);
//                     club3.add(sc.nextInt());
//                     if (!allQueue.contains(club)) {
//                         allQueue.add(club);
//                     }
//                 } else if (club == 4) {
//                     club4.add(club);
//                     club4.add(sc.nextInt());
//                     if (!allQueue.contains(club)) {
//                         allQueue.add(club);
//                     }
//                 }
//             } else {
//                 if (!allQueue.isEmpty()) {
//                     if (allQueue.peek() == 1) {
//                         System.out.print(club1.poll() + " ");
//                         System.out.println(club1.poll());
//                         if (club1.isEmpty()) {
//                             allQueue.poll();
//                         }
//                     } else if (allQueue.peek() == 2) {
//                         System.out.print(club2.poll() + " ");
//                         System.out.println(club2.poll());
//                         if (club2.isEmpty()) {
//                             allQueue.poll();
//                         }
//                     } else if (allQueue.peek() == 3) {
//                         System.out.print(club3.poll() + " ");
//                         System.out.println(club3.poll());
//                         if (club3.isEmpty()) {
//                             allQueue.poll();
//                         }
//                     } else if (allQueue.peek() == 4) {
//                         System.out.print(club4.poll() + " ");
//                         System.out.println(club4.poll());
//                         if (club4.isEmpty()) {
//                             allQueue.poll();
//                         }
//                     }
//                 }
//             }
//         }
//     }
// }
import java.util.Scanner;
import java.lang.*;
import java.util.*;
class Main{
    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Queue<Integer> club1 = new LinkedList<>();
        Queue<Integer> club2 = new LinkedList<>();
        Queue<Integer> club3 = new LinkedList<>();
        Queue<Integer> club4 = new LinkedList<>();
        Queue<Integer> allQueue = new LinkedList<>();
        for ( int i = 0; i< num; i++){
            char X = sc.next().charAt(0);
            if ( X == 'E'){
                int C = sc.nextInt();
                int R = sc.nextInt();
         if ( allQueue.isEmpty()|| !allQueue.contains(C)) allQueue.add(C);
                if ( C == 1) club1.add(R);
                else if ( C == 2) club2.add(R);
                else if ( C == 3) club3.add(R);
                else{
                    club4.add(R);
                }
            }else{
                if ( allQueue.peek() == 1){
                    System.out.println(1 + " " + club1.remove());
                    if ( club1.isEmpty()) allQueue.remove();
                }else if (allQueue.peek()==2){
                    System.out.println(2 + " " + club2.remove());
                    if (club2.isEmpty()) allQueue.remove();
                }else if (allQueue.peek() == 3){
                    System.out.println(3 + " " + club3.remove());
                    if (club3.isEmpty()) allQueue.remove();
                }else{
                    System.out.println(4 + " " + club4.remove());
                    if ( club4.isEmpty()) allQueue.remove();
                }
            }
        }
    }
}

