package fundamentos.packages.p1

// Método 02
// import fundamentos.packages.p2.b2

// Importa tudo do pacote
import fundamentos.packages.p2.*

// Renomeando a importação
import fundamentos.packages.p3.Counter as c2Decrement

import fundamentos.packages.p3.c1

fun main() {
    a1()

    // Método 01
    // fundamentos.packages.p2.b1()

    b1()
    b2()

    c1()

    val c1 = Counter()
    c1.increment()

    val c2 = c2Decrement()
    c2.decrement()
}

fun a1 () {}

fun a2 () {}