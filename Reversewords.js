function reverseWords(sentence) {

return sentence.split(' ').map(word => word.split('').reverse().join('')).join(' ');

}

let inputSentence = "This is a sunny day";

let reversedSentence = reverseWords(inputSentence);

console.log(reversedSentence);

Output:

shiT si a ynnus yad

2. Perform sorting of an array in descending order.

Source code:

function sortDescending(arr) {

return arr.sort((a, b) => b - a);

}

let numbers = [5, 2, 8, 1, 4];

let sortedDescending = sortDescending(numbers);

console.log(sortedDescending);
