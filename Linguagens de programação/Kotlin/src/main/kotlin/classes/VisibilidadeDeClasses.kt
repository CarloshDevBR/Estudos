package classes

/*
    Tudo por padrão é public
*/

fun main() {
    val me = User()

    me.viewName()
}

// Constructor primário privado
private class User constructor(
    val teste: String = "Silva"
) {
    // Mantem o valor privado e não permite alteração fora da classe
    private val name = "Carlos"

    fun viewName() {
        println(name)
    }
}