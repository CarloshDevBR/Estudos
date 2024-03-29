const emptyString = '' // falsy
const resultEmptyString = emptyString || "Hello!"
console.log(resultEmptyString) // Hello

const zeroValue = 0 // falsy
const resultZero = zeroValue || 42
console.log(resultZero) //

const truthyValue = 'truthy' // truthy
const resultTruthy = truthyValue || "Hello!"
console.log(resultTruthy)