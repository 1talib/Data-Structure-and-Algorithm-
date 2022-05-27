/*
Description

Electricity consumption is measured via slab rates for a particular wattage capacity, which is as follows

test.png

Apart from the slab rates, a fixed charge of Rs. 80 is also added to every bill.

You are given total amount of bill, N , you need to find total unit consumed.


Input
Input Format:

First and the only line of input contains the bill amount

Constraints:

0 <= N <= 1000


Output
Print number of units consumed.


Sample Input 1 

930
Sample Output 1

170
Hint

Total 930 rupees is the bill amount.

So total unit consumed would be 170. See calculation below.

Charges for 170 units :-

Fixed Charge :- 80
Charges for first 50 units :- 50 * 3 = 150
Charges of next 100 units :- 100 * 5 = 500
Charges of next 20 units :- 20 * 10 = 200
Total Charges => 80 + 150 + 500 + 200 = 930.*/
public static void unitsConsumed(int n){
    //write your code here
    int unit = 0;
    int bill = n-80;
    if(bill>650){
    unit=unit+150+((bill-650)/10);
    }
    else if (bill>150){
    unit=unit+50+((bill-150)/5);
    }
    else
    {
    unit=unit+(bill/3);
  }
     System.out.println(unit);
 }
