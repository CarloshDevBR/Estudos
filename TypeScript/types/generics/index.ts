// ==> Generic Types
const teste = <T, Bool>(data: T, active: Bool) => data

const value = teste<{ nome: string }, boolean>({ nome: 'Carlos' }, false)

value.nome.toLowerCase()

// ==> Generics nas chaves
interface TesteProps {
    action: <T>(value: T) => void;
}

// ==> Generics diretamente na declaração
interface Teste2Props<T, T2, T3> {
    action: (value: T) => void;
}

// ==> Regras com Generics
type Length = {
    length: number
}

const teste3 = <T extends Length>(value: T) => value

const value3 = teste3(2)

value3.length

// ==> Generics com keyof (herdando os tipos do T)
const teste4 = <T>(value: T, key: keyof T) => value[key]

teste4({ nome: 'Carlos', idade: 21 }, 'nome')