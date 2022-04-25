import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
    public static void solve (List<List<Integer>>ans ,List<Integer>list,int n, int i){
        List<Integer> temp = new ArrayList<> (list);
        ans.add(temp);
        for ( int j = i; j<=n; j++){
            list.add(j);
            solve(ans,list,n,j+1);
            list.remove(list.size()-1);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans,new ArrayList<>(),n,1);
        for (List<Integer> i: ans){
            for ( Integer j : i) System.out.print(j + " ");
            System.out.println();
        }
    }
}
