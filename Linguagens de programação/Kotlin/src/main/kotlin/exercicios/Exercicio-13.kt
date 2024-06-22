package exercicios

fun main() {
    val resNotReversed = spacing("Carlos", isUpperCase = true)
    val resIsReversed = spacing("Carlos", true)

    println(resNotReversed)
    println(resIsReversed)
}

private fun spacing(str: String, convert: Boolean = false, isUpperCase: Boolean = false): String {
    var res = ""

    for (c in str) {
        res += " $c"
    }

    res = res.trim()

    if (isUpperCase) {
        res = res.uppercase()
    }

    if (convert) return res.reversed()

    return res
}