package exercicios

fun main() {
    val res = CharGenerator('A', 'Z')

    println(res.next())
    println(res.next())
    println(res.next())
}

class CharGenerator(
    val min: Char,
    val max: Char
) {
    fun next() = (min..max).random()
}