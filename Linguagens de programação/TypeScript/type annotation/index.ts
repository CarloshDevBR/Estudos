// ==> Variáveis [Type Annotations]
let nome: string = 'Carlos'

console.log(nome)

// ==> Arrays [Type Annotations]
const lista: string[] = ['Tigre', 'Leão', 'Onça']

console.log(lista)

// ==> Objetos [Type Annotations]
type CarroProps = {
    modelo: string;
    ano: number;
    preco: number;
}

const carro: CarroProps = {
    modelo: 'Civic',
    ano: 2006,
    preco: 20000,
}

console.log(carro)

// ==> Functions [Type Annotations]
function multplicarNumero(num1: number, num2: number) {
    return num1 * num2
}

console.log(multplicarNumero(2,1))