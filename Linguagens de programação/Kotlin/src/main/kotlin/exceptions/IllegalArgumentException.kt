package exceptions

fun main() {
    try {
        val s = StudentGrades()
            .add(10.0)
            .add(7.2)
            .add(5.2)
            .add(-6.8)
            .average()

        println(s)
    } catch (err: Exception) {
        println(err)

        err.printStackTrace()
    }
}

class StudentGrades {
    private var sum: Double = 0.0
    private var numberOfGrades: Int = 0

    fun add(grade: Double): StudentGrades {
        if (grade in 0.0 .. 10.0) {
            // Uma exception que serve pra validar argumentos.
            throw IllegalArgumentException("Invalid grade")
        }

        // Solução mais simples pra utilizar o IllegalArgumentException
        require(grade in 0.0 .. 10.0) { "Grade" }

        sum += grade

        numberOfGrades++

        return this
    }

    fun average(): Double {
        return sum / numberOfGrades
    }
}