package exercicios

fun main() {
    val res = disemvowel("Este site é para perdedores LOL!")

    println(res)
}

private fun disemvowel(str: String): String {
    val vogals = arrayOf("a", "e", "i", "o", "u")

    val formatedString = StringBuilder()

    for (c in str) {
        if (!vogals.contains(c.lowercaseChar().toString())) {
            formatedString.append(c)
        }
    }

    return formatedString.toString().trim()
}
