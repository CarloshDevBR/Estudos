package classes

data class Person(val id: Int, val name: String, val age: Int)

fun main() {
    val user = createUser()

    println(user)
}

fun createUser(): Person {
    val person = Person(1, "Carlos", 22)

    return person
}