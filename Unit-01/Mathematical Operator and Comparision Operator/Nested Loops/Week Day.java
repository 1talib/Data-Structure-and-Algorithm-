/*
Description

You are given a number, stored in the variable, with the namenum

Print the required value according to the following conditions

if 

num = 1, print "Monday"

num = 2, print "Tuesday"

num = 3, print "Wednesday"

num = 4, print "Thursday"

num = 5, print "Friday"

num = 6, print "Saturday"

num = 7, print "Sunday"

It is guaranteed, that the value stored in num, will be in the range from1 to 7


Input
The first and the only line of the input contains the value stored innum


Output
Print the value according to the condition given in the problem statement


Sample Input 1 

2
Sample Output 1

Tuesday
Hint

In the sample test case, the value stored innum = 2

Therefore, according to the condition given in the problem statement, the answer will beTuesday*/
 public static void weekday(int num){
    //write your code here
    String result = "";

            if ( num == 0 )
            {
                result = "Sunday";
            }
            else if ( num == 1 )
            {
                result = "Monday";
            }
            else if (num == 2 )
            {
                result = "Tuesday";
            }
            else if ( num == 3 )
            {
                result = "Wednesday";
            }

            else if ( num == 4 )
            {
                result = "Thursday";
            }
            else if ( num == 5 )
            {
                result = "Friday";
            }
            
            else if ( num == 6 )
            {
                result = "Saturday";
            }
            else if (num == 7 )
            {
                result = "Sunday";
            }
            else
            {
                result = "ERROR";
            }
            System.out.println(result);
  }
