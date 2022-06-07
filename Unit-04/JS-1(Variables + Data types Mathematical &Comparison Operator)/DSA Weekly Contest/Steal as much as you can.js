/*Description

A thief is stealing from a jewellery store and wants to steal the greatest value of gems possible. However, the getaway car he brought with him can only fit a maximum weight ofC. All the gems in the store have a value and a weight associated with them such that gem ihas a value v(i)and a weight w(i).

Your task is to figure out the maximum valueVof gems he can steal given the weight limit of the car. You can break a given gem into any fraction of itself.

NOTE: Maximum value vshould be rounded to the nearest integer

For example:

Let Total Weight C = 50

Number of gems = 3

The Value of gems: 60 100 120

The Weight of gems: 10 20 30

The total value of the gems he can carry is = 240

The fraction of each item taken is: 1 1 0.66666666666

Total weight is : 1*10 + 1*20 + 0.66666666666*30 = 49.999999999799996


Input
Input Format

First line contains an integer denoting the capacity C

Second line contains the total number of gems n

Third line contains the value of each gem separated by a space

Fourth line contains the weight of each gem separated by a space

Constraints

0 <= C

0 < n <= 1000000

0 <= v(i)

0 <= w(i)


Output
For each test case output a single integer: the maximum value rounded to the nearest integer


Sample Input 1 

50 
3
60 100 120 
10 20 30
Sample Output 1

240*/
function par(out, v, w, lo, hi){
    i = lo,
    j = hi,
    piv = out[hi];
    while(i<j){
        while(out[j]<=piv && j>0){
            j--;
        }
        while(out[i]>=piv && i<hi){
            i++;
        }
        if(i<j){
            var temp = out[i];
            out[i] = out[j];
            out[j] = temp;
            var temp = v[i]
            v[i] = v[j];
            v[j] = temp;
            var temp = w[i]
            w[i] = w[j];
            w[j] = temp;
        }
    }
    var temp = out[i];
            out[i] = out[hi];
            out[hi] = temp;
            var temp = v[i];
            v[i] = v[hi];
            v[hi] = temp;
            var temp = w[i];
            w[i] = w[hi];
            w[hi] = temp;
           return i;
}
function quick(out,v,w,lo,hi){
    if(lo<hi){
        i = par(out, v, w, lo, hi);
        quick(out, v, w, lo, i-1);
        quick(out, v, w, i+1, hi);
    }
}
function  steal(tw, n, v, w){
    var ans = 0;
    var out = [];
    for(var i = 0; i<n; i++){
        out.push(v[i]/w[i]);
    }
    var lo = 0; 
    var hi = out.length-1;
    quick(out, v, w, lo, hi);
    for(var i = 0; i<n; i++){
        if(w[i]<=tw){
            ans += v[i];
            tw = tw - w[i];
        }else{
            ans =(ans + v[i] * (tw/w[i]));
            ans = Math.round(ans);
            break;
        }
    }
    console.log(ans);
}
function runProgram(input){
    input = input.trim().split("\n");
    var tw = +input[0];
    var n = +input[1];
    var v = input[2].trim().split(" ").map(Number);
    var w = input[3].trim().split(" ").map(Number);
    steal(tw, n, v, w);
 }
if (process.env.USERNAME === "Talib") {
runProgram(input);
} else {
  process.stdin.resume();
  process.stdin.setEncoding("ascii");
  let read = "";
  process.stdin.on("data", function (input) {
  read += input;
  });
  process.stdin.on("end", function () {
  read = read.replace(/\n$/, "");
  read = read.replace(/\n$/, "");
  runProgram(read);
  });
  process.on("SIGINT", function () {
  read = read.replace(/\n$/, "");
  runProgram(read);
  process.exit(0) ;
  });
}
