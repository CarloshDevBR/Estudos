/* 
    Closure é quando uma função "lembra" seu escopo léxico, 
    mesmo quando a função é executada fora desse escopo léxico.
*/

let x = 50

export const sumXMore3 = () => {
    return x + 3
}