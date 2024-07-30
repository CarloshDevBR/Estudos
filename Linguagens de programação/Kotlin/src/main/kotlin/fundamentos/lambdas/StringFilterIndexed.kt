package fundamentos.lambdas

fun main() {
    val s = "sdasdwe12312412d12eaw2e12e1d23131d12dasda DAWDAWD"

    // Vai capturar someente os numeros
    val res1 = s.filter { it.isDigit() }

    // Vai capturar somente as letras maiusculas
    val res2 = s.filter { it.isLetter() && it.isUpperCase() }
    
    val res3 = s.filterIndexed { i, c ->
        val digit: Boolean = c.isDigit()

        if (digit) {
            println("$c $i")
        }

        // Com labels consegue retornar
        return@filterIndexed digit
    }

    println(res1)
    println(res2)
    println(res3)
}