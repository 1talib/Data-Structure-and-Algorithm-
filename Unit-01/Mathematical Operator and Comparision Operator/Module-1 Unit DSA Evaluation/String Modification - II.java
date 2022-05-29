/*Description

You are given a string of odd length, such that the length of the string is stored in a variable with the nameN

The string is stored in a variable with the namestr

You have to create a modified string, such that, the second half of the string is pushed to the front, while the first half of the stringis pushed to the back, keeping the middle character at the same position

For example, consider the value stored instr = varun, andN = 5

Then, in the modified string, the second half, whichun, is brought to the front, while the first half,va, keeping the middle character at the same position

Therefore, the new modified string isunrva


Input
The first line of the input contains the value stored inN

The next line contains the value stored instr


Output
Print the modified string as explained in the problem statement

Sample Input 1 

5
varun
Sample Output 1

unrva
Hint

In the sample test case, the value stored instr = varun, andN = 5

Then, in the modified string, the second half, whichun, is brought to the front, while the first half,va, keeping the middle character at the same position

Therefore, the new modified string isunrva*/
public static void stringModification(int n, String str){
    //write your code here
    for(int i=n/2+1; i<n; i++){
        System.out.print(str.charAt(i));}
      System.out.print(str.charAt(n/2));
       for(int i=0; i<n/2; i++){
       System.out.print(str.charAt(i));}}
