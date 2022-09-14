let myAwesomeCallback = function (randomElementName, card) {

    if(randomElementName === card) {
        counter++; // counter = (counter + 1)
    }
};

let checkTheValues = function (stack, card) {
    let counter = 0;

    stack.forEach(myAwesomeCallback(card));

    return counter;
}

let testStack = [0, 3, 3, 3];

console.log(checkTheValues(testStack, 3));

checkTheValues = function (stack, card) {
    let counter = 0;

    stack.forEach(callBack);

    return counter;
};