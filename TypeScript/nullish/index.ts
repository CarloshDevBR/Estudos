const nullValue = null
const defaultValue = nullValue ?? "Default"
console.log(defaultValue)

const user = { name: "Carlos" }
console.log(user.name?.toUpperCase() ?? "not available") // CARLOS
console.log(user.email?.toUpperCase() ?? "not available") // not available

const result = (null || undefined) ?? "Que?!"
console.log(result) // Que?!

function test(bar?: number): void {
    bar = bar ?? 10

    console.log(bar)
}

test() // 10
test(22) // 22

const product = {
    price: 0
}

const defaultPrice = product.price ?? 42
const defaultName = product.name ?? "No name"

console.log('Price: ', defaultPrice) // 0
console.log('Name: ', defaultName) // No name

console.log(null || ((undefined ?? null) ? undefined : null)) // null