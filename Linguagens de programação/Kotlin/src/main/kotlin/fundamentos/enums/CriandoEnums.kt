package fundamentos.enums

// É possível criar um construtor
enum class Month(val numberOfMonth: Int) {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    // Apos o ; é possível criar métodos
    fun next(): Month {
        return Month.values().find { it.numberOfMonth == numberOfMonth + 1 } ?: JANUARY
    }
}

fun main() {
    val month = Month.MAY

    println(month.numberOfMonth)

    // Transforma em string e retorna o valor
    println(month.name)

    // Captura a ordem
    println(month.ordinal)

    // Usando métodos no enum
    val nextMonth = month.next().next().next()

    println(nextMonth)
}