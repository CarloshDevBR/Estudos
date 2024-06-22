// ==> Exemplo 01: loop for
for (let y = 0; y <= 5; y++) {
    console.log(y)
}

// ==> Exemplo 02: for of itera arrays
const fruits = ['banana', 'batata', 'maracujá']

for (const index of fruits) {
    console.log(index)
}

// ==> Exemplo 02: for in itera objetos
const person = {
    name: 'Carlos',
    job: 'Software enginer',
    age: 22,
    description: 'I am Carlos'
}

for (const key in person) {
    console.log(person[key])
}
