package firstSteps

fun main() {
    val x = 20

    when (x) {
        in 0..10 -> println("Está entre 0 e 10")
        in 11..20 -> println("Está entre 11 e 20")
    }
}