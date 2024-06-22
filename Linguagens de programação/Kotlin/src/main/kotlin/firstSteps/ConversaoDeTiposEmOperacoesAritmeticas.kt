package firstSteps

fun main() {
    println(10 / 3) // 3

    val a = 10.0
    val b = 3

    val res = a / b // O calculo capturou o tipo mais abrangente

    println(res) // 3.33

    println(10 / (3).toDouble()) // 3.33
}