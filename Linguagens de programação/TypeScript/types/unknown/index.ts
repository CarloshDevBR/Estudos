// ==> unknown
let valorVariavel: unknown

valorVariavel = true
valorVariavel = 123
valorVariavel = []
valorVariavel = 'Oi! Tudo bem?'

// ==> erro unknown
let valor: unknown

let valor1: boolean = valor
let valor2: any = valor
let valor3: any[] = valor
let valor4: number = valor

// ==> diferença entre any e unknown
let algumaCoisaAny: any
let algumaCoisaUnknown: unknown

console.log(algumaCoisaAny.toFixed(2))
console.log(algumaCoisaUnknown.toFixed(2))
//unknown vai verificar o valor

if (typeof algumaCoisaUnknown === 'number') {
    console.log(algumaCoisaUnknown.toFixed(2))
}

//como na validacao espero que seja um numero o typescript consegue identificar e nao dar mais erro