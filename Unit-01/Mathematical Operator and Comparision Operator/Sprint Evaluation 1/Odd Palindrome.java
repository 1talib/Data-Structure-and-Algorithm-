/*
Description

You are given a string stored in a variable with the namestr, and the size of the string is stored in a variable with the nameN

You have to create another string from the given string, such that the characters present at only the odd indexes are considered, in the same order as they are present instr

If the new string formed by using the characters present at odd positions in the stringstr, is a palindrome, printyes, else printno

For example, consider the value stored inN = 6, and the value stored instr = abcdeb. Therefore, the characters present at odd positions areb,d,b. Therefore, the new string formedbdbis a palindrome. Hence, the output becomesyes

Note : The string contains only smaller case English alphabets. Also, the indexing in the string starts from 0

Input
The first line of the input contains the value stored inN

The next line of the input contains the value stored instr


Output
Print the output as per the condition, as mentioned in the problem statement

Sample Input 1 

6
abcdeb
Sample Output 1

yes
Hint

In the sample test case, he value stored inN = 6, and the value stored instr = abcdeb. Therefore, the characters present at odd positions areb,d,b. Therefore, the new string formedbdbis a palindrome. Hence, the output becomesyes*/
public static void oddPalindrome(int n,String str){
    //write your code here
StringBuilder ans = new StringBuilder();
for (int i=0; i<str.length(); i++){
    if(i%2!=0){
     ans.append(str.charAt(i));}}
  int flag = 0;
  for (int i=0; i<ans.length(); i++){
  if (ans.charAt(i)!=ans.charAt(ans.length()-i-1)){
    flag = 1;}}
    if(flag==0){
        System.out.println("yes");
    }else{
         System.out.println("no");}}
