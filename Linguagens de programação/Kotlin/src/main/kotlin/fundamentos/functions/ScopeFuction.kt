package fundamentos.functions

/*
    Funções de escopo tem o proposito de deixar o código mais clean

    Let - Comumente utilizado para validações de Null, permite alterar um objeto e
    caso necessário retorne o objeto alterado.

    Run - útil para inicializar um objeto e realizar algumas operações nele.

    With - Parecido com o Run, é usado para alterar propriedades de um objeto, mas
    tem uma sintaxe diferente.

    Apply - Comumente utilizado para aplicar configurações em objetos.

    Also - Quando vc ver "alse" no código, vc pode ler "e tambem faça isso com o objeto", comumente
    utilizado para executrar ações sem modificar o objeto.
*/

data class Product(val name: String, val price: Double) {
    fun disable() {
        println("Desativou o produto")
    }
}

fun save(product: Product) {}

fun main() {
    var product: Product? = null

    // Assegura que o valor não é nulo
    product?.let {
        save(it)
    }

    // Permite inicializar e fazer alguma operação no objeto
    product?.run {
        this.disable()
    }

    // Parecido com o run, mas não tem proteção null antes de entrar na lambda
    with(product) {
        this?.disable()
    }

    // É utilizado para configurar os objetos no padrão Build (Snakbar, Dialog e etc...)
    product?.apply {
        this.disable()
    }

    // Após a criação do objeto
    product?.also {
        save(it)
    }
}