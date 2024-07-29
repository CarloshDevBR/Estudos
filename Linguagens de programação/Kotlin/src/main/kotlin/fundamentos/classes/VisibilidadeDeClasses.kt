package fundamentos.classes

/*
    Tudo por padrão é public
*/

fun main() {
    val me = User()

    val teste = Person2()

    // Da erro ao tentar chamar um metodo protected
    // teste.viewName()

    // Error ao chamar o metodo
    // me.viewName()
}

open class User constructor(
    // Atributo do constructor primário privado
    private val lastName: String = "Silva"
) {
    // Mantem o valor privado e não permite alteração fora da classe
    private val name = "Carlos"

    // Permite a visibilidade na subclasse mas nao permite as demais fundamentos.classes
    protected fun viewName() {
        println("$name $lastName")
    }
}

private class Person2 : User("Silva") {
    fun teste() {
        // Chama o metodo da classe herdada
        viewName()
    }
}