package fundamentos.classes

/*
    O this se refere a instancia da classee (o escopo da classe)
*/

fun main() {
    val t = Teste("Carlos", 22, "Programmer")
}

class Teste(val name: String, val age: Short) {
    private var work: String? = null

    constructor(name: String, age: Short, work: String) : this(name, 18) {
        // Vai referenciar o work da instancia da classe e não do construtor secundário
        this.work
    }
}