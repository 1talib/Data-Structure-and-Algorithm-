/*Description

You are the operations manager of Masai School, and N number of processes have to be executed by you.All the processes have a unique number assigned to them from1 to N.

You are given two arrays :

The first array denotes the calling order, in which the processes are being started.
The second array denotes theidealorder in which all the processes should have been executed.


Note : Executing a process, or changing the position takes 1 unit of time.

Note : You can remove the elements only from the front, and push the elements only from the back of the queue






Input
The first line contains, N, the number of processes to be executed.

The next line contains N space separated integers, denoting the order in which they are started.

The next line contains another N space separated integers, denoting the ideal order in which they should be condcuted.

Constraints

1 <= N <= 500

1 <= A[i] <= N


Output
Print a single integer, denoting the value, as mentioned in the question.


Sample Input 1 

3
3 2 1
1 3 2
Sample Output 1

5
Hint

There are3 processes, the calling order of the processes is:3 - 2 - 1.The ideal order is:1 - 3 - 2,i.e., process number 3 will only be executed after process number 1 has been completed; process number 2 will only be executed after process number 3 has been executed.

Iteration #1:Since the ideal order has process #1 to be executed firstly, the calling ordered is changed, i.e., the first element has to be pushed to the last place. Changing the position of the element takes 1 unit of time. The new calling order is: 2 - 1 - 3. Time taken in step #1: 1.

Iteration #2:Since the ideal order has process #1 to be executed firstly, the calling ordered has to be changed again, i.e., the first element has to be pushed to the last place. The new calling order is: 1 - 3 - 2. Time taken in step #2: 1.

Iteration #3:Since the first element of the calling order is same as the ideal order, that process will be executed. And it will be thus popped out. Time taken in step #3: 1.

Iteration #4:Since the new first element of the calling order is same as the ideal order, that process will be executed. Time taken in step #4: 1.

Iteration #5:Since the last element of the calling order is same as the ideal order, that process will be executed. Time taken in step #5: 1.

Total time taken: 5 units.*/
import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
   public static void main(String args [] ) throws Exception {
       Scanner sc = new Scanner (System.in);
       int n = sc.nextInt();
       int act[] = new int [n];
       for ( int i = 0; i < n ; i++){
           act[i] = sc.nextInt();
       }
       int ideal [] = new int[n];
       for (int i = 0; i<n; i++){
           ideal[i] = sc.nextInt();
       }
       int cost = 0;
       Queue < Integer > q = new LinkedList<>();
       for ( int i : act){
           q.add(i);
       }
       for (int i = 0; i<n;i++){
           if( q.peek() != ideal[i]){
               int temp = q.remove();
               q.add(temp);
               i--;
           }else{
               q.remove();}
           cost++;
       }
       System.out.println(cost);
   }  
}

// function runProgram(input){
//      input=input.trim().split('\n');
//      var n=+input[0];
//      let arr=input[1].split(" ").map(Number);
//      let honest=input[2].split(" ").map(Number);
//      let t=0;
//      let k=0;
//      console.log(ans(arr,honest));
//      function ans(arr,honest){
//         if(honest.length===0) return t ;
//               if(arr[0]===honest[0]){ t++;
//         arr.shift();
//      honest.shift();}
// else if(arr[0]!==honest[0]){let temp=arr[0];
//         arr.shift();
//      arr.push(temp);
//      t++;}
//           return ans(arr,honest);}}
//  if (process.env.USER === "Talib") {
//   runProgram(``);
//  } else {
//   process.stdin.resume();
//   process.stdin.setEncoding("ascii");
//   let read = "";
//   process.stdin.on("data", function (input) {
//      read += input;
//   });
//   process.stdin.on("end", function () {
//      read = read.replace(/\n$/, "");
//      read = read.replace(/\n$/, "");
//      runProgram(read);
//   });
//   process.on("SIGINT", function () {
//      read = read.replace(/\n$/, "");
//      runProgram(read);
//      process.exit(0);
//   });
//  }
