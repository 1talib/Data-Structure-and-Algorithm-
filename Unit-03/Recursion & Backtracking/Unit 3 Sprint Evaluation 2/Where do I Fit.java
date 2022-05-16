/*
Description

At your college's annual function you take part in a singing comedy competition. There are many participants, and they are standing backstage holding a piece of paper that has their participation number on it. You almost forgot about the competition and rushed backstage quickly to stand in the line. Now you need to find where do you stand and who are participants in front and behind you in Log(n) time.


Input
First line contains the number of cases (t)

Next 2t lines contains your participation number and the queue in two different lines.

t <= 500000

Length of the string <= 20


Output
You need to output t lines in which there will be two evenly spaced numbers, first will the participation number of the person in front of you and second will the one of the person standing behind.

Note-If no one is in front or behind you, output "Front" or "Last" respectively (without quotes)


Sample Input 1 

3
3
1 4 5 6 8 9
5 
1 2 6 7 8
1
2 3 4 5 6
Sample Output 1

1 4
2 6
Front 2
*/
import java.util.*;
class Main{
    public static int ahead(int [] a, int k){
        int ans = -1;
        int low = 0;
        int high = a.length-1;
        while(low <= high){
            int mid = low + (high- low)/2;
            if(a[mid] == k) return a[mid];
            else if (a[mid] > k) high = mid -1;
            else {
                ans = a[mid];
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int behind (int [] a, int k){
        int ans = -1;
        int low = 0;
        int high = a.length-1;
        while(low <= high){
            int mid = low + (high -low/2);
            if (a[mid] == k) return a[mid];
            else if (a[mid] > k) {
                ans = a[mid];
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return ans;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String dummy = sc.nextLine();
        while(t-->0){
            int p = sc.nextInt();
            String dummy2 = sc.nextLine();
            String str = sc.nextLine();
            String [] st = str.split(" ");
            int n = st.length;
            int[] arr = new int [n];
            int index = 0;
            for (String i: st){
               arr[index++] = Integer.parseInt(i);
            }
            Arrays.sort(arr);
            int ahead = ahead (arr,p);
            int behind = behind(arr,p);
            if(ahead == -1) System.out.print("Front"+ " ");
            else{
                System.out.print(ahead+" ");
            }
            if(behind == -1) System.out.print("Last");
            else {
                System.out.print(behind);
            }
            System.out.println();
         }
      }
   }
