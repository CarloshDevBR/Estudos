// => Exemplo 01 - Function (Named Function)
function SayHi(name: string): void {
    console.log(`Hello ${name}`)
}

SayHi('Carlos');

// => Exemplo 02 - Função Anônima (Function Expression)
const Sum = function (a: number, b: number): void {
    console.log(a + b)
}

// => Exemplo 03 Função de Flecha (Arrow Function)
const Goodbye = (name: string): void => {
    console.log(`Bye ${name}`)
}

Goodbye('Carlos');

// => Exemplo 04 (Functionn Constructor)
const SayIloveYou = new Function('name', 'return "Eu te amo, " + name')

console.log(SayIloveYou('Dea!'))