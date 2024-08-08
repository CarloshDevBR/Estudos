package exercicios.exercicio_45.control

object Console {
    fun readInt(msg: String): Int {
        println(msg)

        var age: Int? = null

        while (age == null || age <= 0) {
            age = readlnOrNull()?.toIntOrNull()
        }

        return age
    }

    fun readString(msg: String): String {
        println(msg)

        var info: String? = null

        while (info == null) {
            info = readlnOrNull()
        }

        return info
    }
}