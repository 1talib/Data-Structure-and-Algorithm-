/*Description

There are N trucks numbered from 1 to N. The trucks are coming on a road in a random manner.(by random, it means that any order of number: not sorted) There is a side lane which can be used to order the sequence of truck properly(1,2,3,..N)

Use these (Ref :https://imgur.com/a/yWLhQiK) images for better understanding of sample test case.

If it is possible to achieve using the side land, print "yes"

else print "no"


Input
Input Format :

There are several test cases.

The first line of each test case contains a single number n, the number of trucks.

The second line contains the numbers 1 to n in an arbitrary order.

All the numbers are separated by single spaces. These numbers indicate the order in which the trucks arrive in the approach street.

Input ends with number 0

Constraints :

N < 1000


Output
For each test case your program has to output a line containing a single word "yes" if the trucks can be re-ordered with the help of the side lane, and a single word "no" in case it is not possible.


Sample Input 1 

5
5 1 2 4 3 
0
Sample Output 1

yes */
import java.util.*;
class Main{
    public static boolean find(int[] arr){
        Stack<Integer> stack  = new Stack<>();
        int curr = 1;
        for ( int i=0; i<arr.length; i++){
            if( curr== arr[i]){curr++;
                continue;
        }else if(!stack.isEmpty() && stack.peek() == curr){
       while(!stack.isEmpty() && stack.peek() == curr){
        stack.pop();
         curr++;
                }
            }
        if(!stack.isEmpty() && stack.peek()<arr[i]) return false;
        stack.push(arr[i]);
        }
        return true;
    }
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int num =sc.nextInt();
            if(num== 0) break;
            int[] arr = new int[num];
            for (int i = 0; i<arr.length; i++) arr[i] = sc.nextInt();
            if(find(arr)) System.out.println("yes");
            else{
                System.out.println("no");
            }
        }
    }
}
