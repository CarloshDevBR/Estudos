package fundamentos.loops

fun main() {
    loop@ for (i in 'A'..'E') {
        for (j in 1..5) {
            println("$i$j")

            if (j == 3) {
                break@loop
            }
        }

        println("$i")
    }

    println("\nFIM")
}