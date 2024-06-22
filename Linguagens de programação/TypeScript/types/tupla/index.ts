// ==> Tuple
let nomeTupla: [number, string, string] = [1, 'dois', 'três']

// ==> Tuple com labels (heterogênea)
let nomeProfissional: [nome: string, cargo: string, idade: number, salario: number ] = ['carlos', 'front-end', 21, 2500]

// ==> Tuple com spread operator (homogênea)
let listaFrutas: [string, ...string[]] = ['maça', 'goiaba', 'uva', 'melancia']

// ==> Tuple heterogênea
let listaFrutas2: [number, boolean, ...string[]] = [5, true, ...listaFrutas]

// ==> Uso de funções com Tuple
function listaPessoas(nomes: string[], idades: number[]) {
    return [...nomes, ...idades]
}

console.log(listaPessoas(['Carlos', 'Dea'], [21, 22]))

// ==> Labeled Tuples com spread operator numa função
type Nome = 
    | [primeiroNome: string, sobrenome: string]
    | [primeiroNome: string, nomeMeio: string, sobrenome: string]

function criarPessoa(nome: Nome) {
    return [...nome]
}

console.log(criarPessoa(['Carlos', 'Henrique']))

console.log(criarPessoa(['Carlos', 'Henrique', 'Ribeiro']))