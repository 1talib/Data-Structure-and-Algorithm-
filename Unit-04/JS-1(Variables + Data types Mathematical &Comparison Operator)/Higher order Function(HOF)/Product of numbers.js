var numbers = [2, 3, 4];

var product = function (ac, el){
    return ac * el;
}
var numProduct = numbers.reduce(product);
console.log(numProduct);
