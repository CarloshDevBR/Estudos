package fundamentos.classes

fun main() {
    val r1 = Rectangle(10, 10)

    val n1 = r1.width
    val n2 = r1.height
    val n3 = r1.surface

    println("$n1 $n2 $n3")
}

private class Rectangle(
    width: Int,
    height: Int
) {
    var height: Int = height
        // Método pra alterar o valor da propriedade
        // Util para criar tratamentos
        private set(value) {
            if (value >= 0) {
                field = value
            }
        }

    var width: Int  = width
        // Trocando a visibilidade
        private set

    // Val nao pode setar um valor depois de atribuir
    val x = 10
        // Método para recuperar o valor da propriedade
        get() {
            return field
        }

    // Sempre será calculado em tempo real
    val surface: Int get() = width * height
}