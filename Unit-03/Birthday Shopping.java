import java.io.*;
import java.lang.*;
import java.util.*;
class Main{
    public static void ans ( int n , int k , int cur, List<Integer>list){
        if(list.size() == k){
            for (Integer i : list) System.out.print(i + " ");
            System.out.println();
            return;
        }
        for ( int i = cur ; i <= n ; i++){
            list.add(i);
            ans(n,k,i + 1,list);
            list.remove(list.size()-1);
        }
    }
    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List <Integer> list = new ArrayList<>();
        ans(n,k,1,list);
    }
}
