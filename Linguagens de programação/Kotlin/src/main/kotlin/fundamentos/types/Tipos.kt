package fundamentos.types

/*
    fundamentos.string - Textos
    char - Um Único Caracter
    byte - Números Inteiros (-127 até 127)
    short - Números Inteiros (-32768 até 32767)
    int - Números Inteiros (-2147483648 até 2147483647)
    long - Números Inteiros (-9223372036854775808 até 9223372036854775807)
    float - Números Decimais (1.1234567 até 7 casas decimais)
    double - Números Decimais (1.123456789 até 15 casas decimais)
    boolean - Valores Booleanos (Estados) - true ou false
*/

fun main() {
    val name: String = "Carlos"
    println("$name Silva")

    val char: Char = 'A'
    println(char)
    println(char.code) // código associado ao caractere A

    val byteNumber: Byte = 127 // Byte: 1 byte - 8 bits
    println(byteNumber)

    val shortNumber: Short = 3000 // Short: 2 bytes - 16 bits
    println(shortNumber)

    val intNumber: Int = 431235 // Int: 4 bytes - 32 bits
    println(intNumber)

    val longNumber: Long = 2313213213L // Long: 8 bytes - 64 bits
    println(longNumber)

    val floatNumber: Float = 1.5223123F // Float: 4 bytes - 32 bits
    println(floatNumber)

    val doubleNumber: Double = 1.321312323232424 // Double: 8 bytes - 64 bits
    println(doubleNumber)

    val booleanValue: Boolean = false
    println(booleanValue)
}