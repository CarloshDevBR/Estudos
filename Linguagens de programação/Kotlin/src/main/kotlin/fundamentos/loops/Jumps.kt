package fundamentos.loops

fun main() {
    // continue faz um jump e passa para o próximo número
    for (i in 0..50) {
        if (i % 10 == 0) {
            continue
        }

        println("$i")
    }

    for (i in 0 .. 50) {
        if (i == 30) {
            break
        }

        println("$i")
    }
}