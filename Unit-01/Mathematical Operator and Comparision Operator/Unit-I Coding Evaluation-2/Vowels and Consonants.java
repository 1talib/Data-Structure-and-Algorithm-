/*
Description

You are given a string with only lowercase letters stored in a variable with the namestr

The size of the string is stored in a variable with the nameN

You have to findX * Y,

where X is the number of vowels in the string
and Y is number of consonants in the string

For example, consider the value stored inN = 5, andstr = "masai"

Number of Vowels = 3, Number of Consonants = 2

Therefore, the value ofX = 3, and the value ofY = 2

Therefore,X * Y = 3 * 2 = 6


Input
The first line of the input contains the value stored inN

The next line contains a string, which is stored in the variablestr


Output
Print the value of the equationX * Y, as explained in the problem statement

Sample Input 1 

5
masai
Sample Output 1

6
Hint

In the sample test case, he value stored inN = 4, andstr = "masai"

Number of Vowels in the string = 3, number of Consonants in the Array = 2

Therefore, the value ofX = 3, and the value ofY = 2

Therefore, the value of the given equation =X * Y = 3 * 2 = 6, which is the required answer*/
 public static void vowelsAndConsonants(int n, String str){
    //write your code here
    int vCount = 0, cCount = 0;    
     for(int i = 0; i < n; i++) {    
if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){    
         vCount+=1;    
    }    
    else{          
        cCount+=1;    
      }    
    }    
    System.out.println(vCount*cCount);    
  }
