/*Description

India & Australia just finished a Test Series, which was part of the inaugural world test championship. The points earned by the two teams are stored in the variable with the nameIndPoints, AusPoints, respectively

You are also given the matches played by the two teams, stored in variables with the namesIndMatches, AusMatchesrespectively

Now, you have to print the winner between the two teams based on the following conditions`

If the points scored by India are greater than the points scored by Australia, print "India", without quotes

If the points scored by Australia are greater than the points scored by India, print "Australia", without quotes

If the points of the two teams are same, and India has played lesser matches then Australia, print "India", without quotes

If the points of the two teams are same, and Australia has played lesser matches then India, print "Australia", without quotes

If the points of the two teams are same, and the number of matches played by the two teams are also same, then print "Play another game!", without quotes

`


Input
The first line of the input contains the value stored in the variable with the nameIndPoints

The second line of the input contains the value stored in the variable with the nameAusPoints

The third line of the input contains the value stored in the variable with the nameIndMatches

The fourth line of the input contains the value stored in the variable with the nameAusMatches


Output
Print the output, as per the conditions as mentioned in the problem statement

Sample Input 1 

580
500
12 
10
Sample Output 1

India
Sample Input 2 

500
500
12 
12
Sample Output 2

Play another game!
Hint

In the first sample test case, the value stored inIndPoints = 580, AusPoints = 500, IndMatches = 12, AusMatches = 12

Since, the points scored by India are more than the points scored by Australia, hence the output becomesIndia

In the second sample test case, the value stored inIndPoints = 500, AusPoints = 500, IndMatches = 12, AusMatches = 12

Since, the points scored by both the teams are same, and also both the teams played the same number of games, therefore, the output isPlay another game!*/
public static void worldTestChampionship(int India,int Australia,int India_matches,int Australia_matches){
    //write your code here
    if(India>Australia){
        System.out.println("India");
    } else if(Australia>India){
        System.out.println("Australia");
  }else if(Australia>India){
        System.out.println("Australia");
  }else if(Australia==India&&India_matches<Australia_matches){
        System.out.println("India");
  }else if(Australia==India&&India_matches>Australia_matches){
        System.out.println("Australia");
  }else {
        System.out.println("Play another game!");}}
