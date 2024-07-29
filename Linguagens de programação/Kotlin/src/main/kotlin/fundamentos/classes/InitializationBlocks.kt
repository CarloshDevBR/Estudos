package fundamentos.classes

fun main() {
    val s1 = Square(10)
    val s2 = Square(5)
}

class Square(val size: Int) {
    // Chamado toda vez que uma instancia é criada (ideal para validar dados)
    init {
        println("init_1")

        // Caso o valor seja false solta uma Exception e para a aplicação
        require(size > 0)
    }

    // Possível adicionar mais de um init
    init {
        println("init_2")
    }
}