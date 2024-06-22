package exercicios

fun main() {
    // Times multiplica e Minus divide, são funções matemáticas que podem substituir o operador.
    // ToIntOrNull retorna um null se o valor não for um int
    // ?: vai retornar o valor 2 como padrão se for um null
    println(readln().toIntOrNull()?:2.times(2).times(2).minus(10))
}