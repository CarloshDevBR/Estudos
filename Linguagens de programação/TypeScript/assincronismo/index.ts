// Exemplo: 01
console.log('1')

setTimeout(() => {
    console.log('2')
},0)

console.log('3')

// log: 1, 3 e 2

// Exemplo: 02
console.log('1')

setTimeout(() => {
    console.log('2')
},0)

Promise.resolve().then(() => {
    console.log('3')
})

console.log('4')

// log: 1, 4, 3 e 2

// Exemplo: 03
console.log('1')

setTimeout(() => {
    console.log('2')
},0)

Promise.resolve().then(() => {
    console.log('3')
})

setTimeout(() => {
    console.log('4')
},1000)

Promise.resolve().then(() => {
    setTimeout(() => {
        console.log('5')
    },1000)
})

console.log('6')

// log:  1, 6, 3, 2, 4 e 5


// Exemplo: 04
let promise1 = Promise.resolve()
let promise2 = Promise.resolve()

setTimeout(() => {
    console.log(0)
}, 0)

promise1
    .then(() => console.log(1))
    .then(() => console.log(2))
    .then(() => console.log(3))

promise2
    .then(() => console.log(4))
    .then(() => console.log(5))

// log:  1, 4, 2, 5, 3 e 0