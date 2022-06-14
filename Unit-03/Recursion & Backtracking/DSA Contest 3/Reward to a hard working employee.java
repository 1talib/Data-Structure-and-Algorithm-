/*Description

Rahul is a hard-working employee. So, his boss decided to promote him.Rahul was overjoyed about getting to know this. But soon he realized he needed to shift to another Town X.

Rahul needed to transport his n boxes to Town X for which he contacted the company "Packers and Movers".This company sent him m trucks. Each truck took 1 hour to go from his house to Town X and another 1 hour to return.

But each truck could carry only 1 box at a time and also each truck has a limit for the maximum weight of the box it can carry.

A truck can be used multiple times. Find the minimum time in which he can transfer all his n boxes to Town X.


Input
Input Format:

The first line contains 2 integers n and m.

The next line contains n integers denoting the weight of each box.

This is followed by a line containing m integers denoting the maximum capacity of each truck.

Constraints:

1<=n,m<=10000

1<=weight of each box<=1000000

1<=maximum capacity of each truck<=1000000


Output
Print the minimum time to transfer all the boxes to Town X.

Note: Test cases are such that a solution always exist.


Sample Input 1 

7 2
10 2 16 19 6 11 5
29 25
Sample Output 1

7
Hint

Explanation to Sample test case:

The first truck carries the first box and then return to the house in 2 hours again carries the 2nd box and return and again the 3rd box and return taking a total of 6 hours.

The second truck similarly carries the next 3 boxes and return to the house in 6 hours. In the 6th hour, one of the two truck gets loaded with the 7th box and reaches Town X with the last box at the 7th hour.*/
 import java.util.*;
class Main{
    public static boolean isPossible( int time, int[] arr, int[] cap){
        int boxesInOneRound = time/2;
        if(time%2!=0){
            boxesInOneRound++;
        }
        int j = arr.length-1;
        for(int i = cap.length-1; i>=0;i--){
            int count = 0;
            while(j>=0 && count<boxesInOneRound){
                if (cap[i] >= arr[j]){
                    count++;
                }else{
                    return false;
                }
                j--;
            }
        }
        if (j>=0)
        return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[]arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[]cap = new int[m];
        for(int i = 0; i<m; i++){
            cap[i] = sc.nextInt();
        }
        Arrays.sort(arr); Arrays.sort(cap);
        int l=1, r=(int)1e8;
        int ans = -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(isPossible(mid, arr, cap) == true){
                ans = mid;
                r = mid-1;
            }else{
                l=mid+1;
            }
        }
        System.out.println(ans);
    }
}
