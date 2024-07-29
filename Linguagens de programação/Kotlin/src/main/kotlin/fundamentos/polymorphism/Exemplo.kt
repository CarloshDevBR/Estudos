package fundamentos.polymorphism

fun main() {
    val user = Account(Person("Carlos", "Silva", 22))

    user.deposit(100.0)
    user.print()
}

interface Naneable {
    val firstName: String
    val lastName: String
    val fullName: String
        get() = "$firstName $lastName"
    val age: Int
}

interface Printable {
    fun print()
}

data class Person(
    override val firstName: String,
    override val lastName: String,
    override val age: Int
) : Naneable

class Account(val owner: Naneable) : Printable {
    private var balance: Double = 0.0

    fun deposit(value: Double) {
        balance += value
    }

    override fun print() {
        println("Balance for ${owner.fullName}: $balance")
    }
}