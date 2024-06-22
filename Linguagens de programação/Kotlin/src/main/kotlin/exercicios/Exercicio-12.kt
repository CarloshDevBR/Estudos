package exercicios

fun main() {
    val yearHuman = readln().toIntOrNull()?:1

    val res = calculateYearDogAndHuman(yearHuman)

    println("A $yearHuman anos na vida humana equivale a $res anos caninos.")
}

private fun calculateYearDogAndHuman(yearHuman: Int ): Int {
    val defaultYearDog: Byte = 7

    return yearHuman * defaultYearDog
}