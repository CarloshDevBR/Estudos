package polimorfismo

fun main() {
    val p = Programmer()
    p.work()

    val t = Teacher()
    t.work()
}

private abstract class Employee {
    // Métodos abstratos não são implementados
    abstract fun work()
}

private class Programmer : Employee() {
    override fun work() {
        println("Programmer working...")
    }
}

private class Teacher : Employee() {
    override fun work() {
        println("Teacher working...")
    }
}