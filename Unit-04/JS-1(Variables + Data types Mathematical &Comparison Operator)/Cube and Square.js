/*Description

You are given two numbers n and m, you need to check if cube of n is greater than square of m.


Input
First line contains two space separated integers n and m.


Output
Print true if cube of n is greater than square of m, or else print false.


Sample Input 1 

2 3
Sample Output 1

false
*/
function cubeAndSquare(n,m) {
    var cube = n*n*n;
    var square = m*m;
    if (cube>square){
        console.log(true);
    }else{
       console.log(false);
    }
}

