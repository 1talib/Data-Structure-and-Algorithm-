var numbers = [1, 2, 3, 4, 5, 6];

var sum = function (ac, el) {
    return ac + el;
}

var multiple3 = function (el) {
    return el % 3 == 0;
}

var cube = function (el) {
    return el ** 3;
}
var m3CubeSum = numbers.filter(multiple3).map(cube).reduce(sum);
console.log(m3CubeSum);
