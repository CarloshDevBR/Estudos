/*
    O Polimorfismo é a alteração da classe herdada.
    As subclasses herdarão as superclasses e terão novas implementações.
*/

fun main() {
    val p = Programmer()
    p.work() // a implementação de Programmer será invocada

    val t = Teacher()
    t.work() // a implementação de Teacher será invocada

    val a: Programmer = Programmer()
    a.work() // a implementação de Programmer será invocada

    val b: KotlinProgrammer = KotlinProgrammer()
    b.work() // a implementação de KotlinProgrammer será invocada

    val c: Programmer = KotlinProgrammer()
    b.work() // a implementação de KotlinProgrammer será invocada
}

private abstract class Employee {
    // Métodos abstratos não são implementados
    abstract fun work()
}

private open class Programmer : Employee() {
    override fun work() {
        println("Programmer working...")
    }
}

private class KotlinProgrammer : Programmer() {
    override fun work() {
        println("Kotlin programmer working...")
    }
}

private class Teacher : Employee() {
    override fun work() {
        println("Teacher working...")
    }
}