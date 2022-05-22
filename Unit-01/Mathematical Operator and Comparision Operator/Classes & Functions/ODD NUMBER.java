/*
Write a functionisOddwhich returns a boolean value based the number is odd or not
Use this function to print the odd numbers from 0 to a given limit(included)*/
public class isOdd {
   public static void main(String args[]) {
	isOdd(10);}
   public static void isOdd (int n){
     int i ;
     for ( i = 1; i<=n; i++)
     if ( i%2 == 1){
		System.out.println("Odd" + " " + i);
	   }else{
       	System.out.println("Even" + " " + i);
     }
	}
 }
