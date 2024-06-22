// ==> Global Scope
var variables = 'Global Context'

function printGlobalContext(): void {
    console.log(variables)
}

printGlobalContext()

// ==> Local Scope
function printLocalContext(): void {
    var variables = 'Local Context'

    console.log(variables)
}

// ==> Block Scope
if (true) {
    const variable = 'Block Context'

    var varVariable = 'Block Context'

    console.log(variable)
}

console.log(variable) // ReferenceError

console.log(varVariable)