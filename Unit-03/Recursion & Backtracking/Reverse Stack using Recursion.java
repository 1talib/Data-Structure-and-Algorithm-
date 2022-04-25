/*Description

You'll be given a stack. You have to reverse the stackwithout using any inbuilt function or for and while loops. You have to reverse it by recursion only.


Input
InputFormat

First n lines will contain the stack of length n.

You have to stop taking input when you find -1



Constraints

n <= 1000

0 <= element of the stack <= 100000




Output
You have to display the reversed stack


Sample Input 1 

1
2
3
4
-1
Sample Output 1

4
3
2
1*/
import java.util.*;
class Main
{
    static Stack<Integer> st = new Stack<>();
    static int rem() {
        int rev = st.pop();
        if (st.isEmpty()) {
            return rev;
        } else {
            int last = rem();
            st.push(rev);
            return last;
        }
    }
    static void  reverse()
    {
        if (st.isEmpty()) {
            return;
        }
        int c = rem();
        reverse();
        st.push(c);
    }
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
    int t =sc .nextInt();
       while(t!=-1){
           st.push(t);
          t=sc.nextInt();  
       }
        reverse();
        for(int i=0;i<st.size();i++){
        System.out.println(st.get(i));
          }
    }
}
