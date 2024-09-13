package fundamentos.vars

const val msg = "Hi!" // Tempo de compilação. Só funciona em escopo global

fun main() {
    //Mutável
    var name = "Carlos Henrique"

    name = "CH"

    println(name)

    //Imutável
    val age = 22 // Tempo de execução. Só funciona em escopo local

    println(age)

    println(msg)
}