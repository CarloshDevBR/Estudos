package fundamentos.functions.ext

fun String.hide(): String {
    return "".padStart(length, '*')
}