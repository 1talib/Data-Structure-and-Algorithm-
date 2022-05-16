/*Description

You are given name and marks of N different students in a hackerrank contest. Your task is to write a program that makes leaderboard of the students under following conditions:

- If two students get same marks they get same rank

- The student placed next to the same marks students will get the rank skipping the intermediate ranks.

Refer to the sample test case for better understanding

Note : You cannot use built-in sort function. Using that can lead to disqualification. Write your own sorting algorithm


Input
Input Format :
First line of input contains N

Next N line contains name and marks respectively of N different students (where name and marks is separated by a space)



Constraints :

N < 100


Output
Output N names with their rank. Follow these rules for generating the list:

1. The students having more mark gets better rank

2. If students have similar mark, their rank will be same(In case of similar marks, the person whose name comes first in alphabetical order comes first in order. However their rank will be same)

3. The student placed next to the same marks students will get the rank skipping the intermediate ranks.


Sample Input 1 

6
rancho 45
chatur 32
raju 30
farhan 28
virus 32
joy 45
Sample Output 1

1 joy
1 rancho
3 chatur
3 virus
5 raju
6 farhan*/
import java.util.*;
class Main{
    public static void main ( String [] args ){
        Scanner scan = new Scanner (System.in);
        int Num = scan.nextInt();
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        for ( int i = 0 ; i<=100; i++){
            list.add(new ArrayList<>());
        }
        for (int i = 0; i<Num; i++){
            String name = scan.next();
            int marks = scan.nextInt();
            list.get(marks).add(name);
        }
        int rank = 1;
        for (int i = 100; i>=0; i--){
            ArrayList<String> names = list.get(i);
            if(names.size()!=0){
            names = sort(names);
            for(int j= 0; j<names.size(); j++){
                System.out.println(rank+" "+names.get(j));
                }
            }
            rank+=names.size();
        }
    }
    static ArrayList<String> sort(ArrayList<String> names){
        String[] list = new String[names.size()];
        for ( int i = 0; i<names.size(); i++){
            list[i] = names.get(i);
        }
    for (int i = 0; i<list.length; i++){
      int  min = i; 
       for (int j = i+1; j<list.length; j++){
         if(list[min].compareTo(list[j]) > 0 ){
             min = j; 
         }  
      }
      if ( min != i){
          swap( list, i ,min);
      }
   }
   ArrayList<String> output = new ArrayList<>();
   for (int i = 0; i<names.size(); i++){
       output.add(list[i]);
   } return output; }
   static void swap ( String [] names , int i , int j){
       String temp  = names[i];
       names[i] = names [j]; 
       names [j] = temp; 
      }
   }
   
