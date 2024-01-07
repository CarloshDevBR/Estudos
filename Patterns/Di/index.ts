interface CalcNumsProps { 
    a: number; 
    b: number; 
    x?: number;
    type: 'multiply' | 'sum' | 'subtract' | 'division' | 'equation';
}

// DI (Injeção de dependências)
const calcNums = ({ a, b, x, type }: CalcNumsProps) => {
    switch (type) {
        case 'sum':
            return a + b

        case 'subtract':
            return a - b

        case 'division':
            return a / b            

        case 'multiply':
            return a * b

        case 'equation':
            return x && a * x + b
            
        default:
            return "Não foi possível fazer o cálculo"

    }
}

console.log(calcNums({ a: 2, b: 3, type: 'multiply' })) // args

console.log(calcNums({ a: 2, b: 3, x: 5, type: 'equation' })) // args