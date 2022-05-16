/*Description

Strings with Multiple test case, such that the size of the string is not given


Input
The first line of the input containsT, the number of test cases

The nextTlines containing the input string


Output
For each test case, print the string on a new line, as shown in the sample test case

Sample Input 1 

2
aman
rutwik
Sample Output 1

aman
rutwik*/
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String arr[] = new String[size];
        for(int i = 0;i<size;i++)
        {
        arr[i] = scan.next();
        System.out.println(arr[i]);
        }
    }
}
