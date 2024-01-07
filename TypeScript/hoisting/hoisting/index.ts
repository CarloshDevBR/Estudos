// Hoisting com funções
Example()

function Example(): void {
    console.log('Hoisting')
}

// Hoisting com variáveis
console.log(example)
var example = 'example with variables'

// Hoisting em função
var y = 20

function fn1() {
    console.log('escopo externo', y) // 20

    function fn2() {
        console.log('escopo interno', y) // undefined
        
        var y = 40

        console.log('escopo interno', y) // 40
    }

    return fn2
}

const closure = fn1()

closure()