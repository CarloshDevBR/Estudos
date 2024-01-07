// Quando utilizar type
// Tipos primitivos (obrigatório)
type Nullish  = undefined | null
type Fruit = 'maça' | 'banana' | 'laranja'

// Tuples (obrigatório)
const array: [number, string, boolean] = [1, '2', true]

type RowProps = [colOnw: number, colTwo: number]

const row: RowProps = [1, 2]

// Funções
type SumProps = (numberOne: number, numberTwo: number) => void

// Union Types (os unions são formados por |) (obrigatório)
type Job = 'Software Enginer' | 'QA'

// Mapped types (obrigatório)
type FruitCountProps = {
    [key in Fruit]: number
}

const fruits: FruitCountProps = {
    banana: 1,
    laranja: 3,
    maça: 10
}

// Quando utilizar interface
// Polimorfismo
interface Bird {
    fly(): void;
    sleep(): void
}

class Pombo implements Bird {}

class BeijaFlor implements Bird {}

// Declaration Merging
interface Car {
    size: number;
    run(): void
}

interface Car {
    color: string
}