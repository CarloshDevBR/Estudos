//Formas de declarar

// ==> Exemplos: array de string
const arrayString: string[] = ['maça', 'manga', 'goiaba', 'morango']

// ==> Exemplos: array de number
const arrayNumber: number[] = [1, 2, 3, 4]

// ==> Exemplos: Array (Objeto)
const arrayObj: Array<object> = [
    {
        nomeFruta: 'pêra',
    },
    {
        nomeFruta: 'banana',
    },  
]

//Métodos

// ==> Exemplos: push (adiciona um novo item no final do array)
arrayObj.push({
    nomeFruta: 'kiwi',
})

// ==> Exemplos: pop (remove um item no final do array)
arrayObj.pop()

// ==> Exemplos: unshift (adiciona um novo item no começo do array)
arrayObj.unshift({
    nomeFruta: 'kiwi',
})

// ==> Exemplos: shift (remove um item do começo do array)
arrayObj.shift()

//Spread Operetor

// ==> Exemplos: Spread (esparrama os valores na variável)
const array01 = [1, 2, 3, 4, 5]

const array02 = [6, 7, 8, 9, 10]
 
const concatArray01 = [...array01, ...array02]

//Laço de repetição

// ==> Exemplos: for (default)
for (let i = 0; i < arrayString.length; i++) {
    console.log(arrayString[i])
}