package fundamentos.colecoes

fun main() {
    val list = listOf("Carlos")

    val mutableList = mutableListOf("Carlos")

    mutableList.add("Silva")
    mutableList.add("Teste")

    mutableList.removeLast()

    println(mutableList)
}