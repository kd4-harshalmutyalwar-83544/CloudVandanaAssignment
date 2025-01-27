const prompt = require("prompt-sync")();

function sortDesc(array) {
    let len = array.length;

    for (let i = 0; i < len - 1; i++)
     {
        for (let j = i + 1; j < len; j++)
         {
            if (array[i] < array[j]) {
                let temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }
    return array;
}

let inputArray = [];
let inputLength = prompt("Enter the length of the array:");

for (let i = 0; i < inputLength; i++) {
    let num = parseFloat(prompt(`Enter element ${i + 1}:`));
    inputArray.push(num);
}

let sortedArray = sortDesc(inputArray);
console.log("Sorted Array in Descending Order: ", sortedArray);