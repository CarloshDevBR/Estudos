package firstSteps

fun main() {
    val name: String = "Carlos"
    println(name + " Henrique")
    println("Seu nome invertido é ${name.reversed()}") // Inverte o valor da variável
    println("$name Silva")
    println("O rato roeu\na roupa do\nrei de \"Roma\".")

    val literalString = """
        O rato roeu
         a roupa do
          rei de "Roma"
    """.trimIndent() // remove os espaços da indentação
    println(literalString)
}