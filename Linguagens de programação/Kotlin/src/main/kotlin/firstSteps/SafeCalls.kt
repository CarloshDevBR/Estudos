package firstSteps

fun main() {
    val s1: String? = null
    println(s1)

    val s2 = s1?.uppercase()
    println(s2)

    val s3 = s2?.reversed()
    println(s3)

    val l = s2?.length
    println(l)

    smartCast()
}

fun smartCast() {
    val s1: String? = null

    // O compilador entende que não é nulo
    if (s1 != null) {
     println(s1.lowercase())
    }
}