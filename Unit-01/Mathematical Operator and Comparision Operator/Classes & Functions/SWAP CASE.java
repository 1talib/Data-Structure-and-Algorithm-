/*Given a string swap the case and print the output
Sample Input - Test
Sample Output - tEST
NOTE: Use multiple functions to achieve the result, NOT one single code block*/
public class swap {
 static char UpperCaseToLowerCase(char c){
   int p = c-65+97;
   char res = (char)p;
   return res ;
 } 
  static char lowerCaseToUpperCase(char c){
    int p = c -97 + 65;
    char res = (char)p;
    return res ;
  }
  public static void main(String args[]){
    String str = "Test", ans = " ";
     for (int i = 0; i < 4; i++){
       if (str.charAt(i) >= 'A' && str.charAt(i)<= 'Z'){
         char ch = UpperCaseToLowerCase(str.charAt(i));
         ans = ans + ch;
       }
       else{
         char ch = lowerCaseToUpperCase(str.charAt(i));
         ans = ans + ch;
       }
  }
    System.out.println(str);
    System.out.println(ans);
    }
}
