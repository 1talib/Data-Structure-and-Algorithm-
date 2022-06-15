/*Description

Given an array of N integers, print the 3 distinct maximum and 3 distinct minimum elements of the array.


Input
Input Format

First line contains N

Second line contains N space separated integers which are elements of the array.

Constraints

0<=N<=100 (Please note that N can be 0 as well)

The values present in the array can be negative as well.




Output
In the first line, print the least 3 values (sorted) present in the array.

In the second line, print the top 3 values (sorted) present in the array.

In case there are not 3 min value, print "Not Possible" (without quotes).

In case there are not 3 max value, print "Not Possible" (without quotes).

So, according to the above statements, if both are not possible, you have to print "Not Possible" twice (once for each)

In the array, if you found out only 2 distinct min and 2 distinct max elements then also printNot Possibletwice [ one for minimum and other for maximum]


Sample Input 1 

8
1 2 3 4 2 1 6 5
Sample Output 1

1 2 3
4 5 6*/
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        if (n > 5) {
            LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
            Arrays.sort(arr);
            for (int i = 0; i < n; i++) {
                hashSet.add(arr[i]);
            }
            Iterator iterator = hashSet.iterator();
            for (int j = 0; iterator.hasNext(); j++) {
                int value = (int) iterator.next();
                if(hashSet.size()<6){
                    if (j <= 2) {
                        System.out.print(value + " ");
                    }
                    if (j == 2) {
                        System.out.println();
                    }if (j >= 2) {
                        System.out.print(value + " ");
                    }

                }else {
                    if (j <= 2) {
                        System.out.print(value + " ");
                    } else if (j >= hashSet.size() - 3) {
                        System.out.print(value + " ");
                    }

                    if (j == 2) {
                        System.out.println();
                    }
                }
            }
        }else {
            System.out.println("Not Possible");
            System.out.println("Not Possible");
        }
    }
}

