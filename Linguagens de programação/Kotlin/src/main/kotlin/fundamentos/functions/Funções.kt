package fundamentos.functions

fun main() {
    sayHello()
    sayMyName("Carlos")
    // Passando duas funções fundamentos.lambdas
    sayMyLastName ("Carlos", { "Ribeiro" }, { "Silva" })
    // Também pode execurtar dessas formas
    // sayMyLastName ("Carlos") { "Silva" }
    // sayMyLastName ("Carlos", lastName = { "Silva" })
    val cal = sum(5, 1)
    val mult = multiply(5, 5)
    println(cal)
    println(mult)
    println("FIM!")
}

// Função com valor padrão
private fun sayHello(msg: String = "Hi! Hello!") {
    println(msg)
}

// Parametros de funções (os parametros sao constantes, ou seja readonly)
fun sayMyName(name: String) {
    println(name)
}

// Parametro lambda
fun sayMyLastName(firstName: String, lastName: () -> String, endName: () -> String) {
    println("$firstName $lastName $endName")
}

// Retorno de valores
fun sum(n1: Int, n2: Int): Int {
    return n1 + n2
}

// Usando como expressão (apenas com uma única expressão)
fun multiply(a: Int, b: Int) = a * b