package fundamentos.exceptions

fun main() {
    try {
        val x = 10 / 0

        // val obj = Any? = null
        // obj!!.toString()

        "abc".toInt()
    } catch (err: Exception) {
        println(err)
    }
}