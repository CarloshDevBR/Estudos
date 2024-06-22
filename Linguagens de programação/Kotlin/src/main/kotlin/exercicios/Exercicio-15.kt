package exercicios

fun main() {
    val res = evaporator(10.0, 10.0, 5.0)

    println(res)
}

private fun evaporator(content: Double, evap_per_day: Double, threshold: Double): Int {
    var days = 0
    var currentContent: Double = content
    val thresholdContent: Double = content * (threshold / 100)

    while (currentContent >= thresholdContent) {
        currentContent -= currentContent * (evap_per_day.toDouble() / 100)

        days++
    }

    return days
}