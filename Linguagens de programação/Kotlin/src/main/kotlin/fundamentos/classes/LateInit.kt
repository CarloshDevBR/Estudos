package fundamentos.classes

// lateinit - inicialização tardia de variáveis

fun main() {
    Receita().print()
}

class Receita {
    // Não existe na memória até ser inicializada
    private lateinit var inst: String

    fun createReceiver() {
        inst = "Lave as mãos"
    }

    fun print() {
        // Verifica se foi inicializada
        if (!this::inst.isInitialized) {
            inst = "Lave as mãos"
        }
    }
}