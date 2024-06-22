package firstSteps

fun main() {
    /*
        Byte -> UByte
        Short -> UShort
        Int -> UInt
        Long -> ULong
    */

    val x = 100u // sufixo u transforma o valor pra UInt
    val y = 100UL // sufixo u transforma o valor pra ULong

    x.toInt() // volta para o tipo Int
    y.toDouble() // transforma em um tipo sem sinal double
}