// É adicionada por último na Call Stack e será a primeira a ser executada
function adicionar(n1: number, n2: number): number {
    return n1 + n2
}

// É adicionada na Call Stack
function media(n1: number, n2: number): number {
    return adicionar(n1, n2) / 2
}

let resultado = media(10, 20)