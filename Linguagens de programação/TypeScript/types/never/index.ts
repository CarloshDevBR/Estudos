// ===> Never - Throw Exception
function error(message: string): never {
    throw new Error(message)
}

console.log(error('Erro inesperado!'))

// ===> Never inferido automaticamente
function rejectMessage() {
    return error('Rejeitada')
}

// ===> Função que contém loop infinito retorna o tipo 'never'
const loop = () => {
    while (true) {
        console.log('Cuidado hehehehe')
    }
}

loop()

// ===> Diferença entre os tipos 'never' x 'void'
const testeVoid: void = null
const testeNever: never = null

// o tipo void consegue ser atribuido a algum valor, já o never nao