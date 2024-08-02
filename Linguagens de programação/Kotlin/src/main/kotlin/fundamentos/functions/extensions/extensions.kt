package fundamentos.functions.extensions

fun String.hide(): String {
    return "".padStart(length, '*')
}