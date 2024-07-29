package fundamentos.types/*
    is = é
    !is = !é
*/

fun main() {
    val n1: Byte = 127

    if (n1 is Byte) {
        print(n1)
    }
/*
    if (n1 !is String) {
        print(n1)
    }
 */
}