package fundamentos.colecoes

import java.util.Objects

// Necessário implementar uma data class, caso contrário o hash code seria diferente
// O data class já implementa o toString, hashCode e equals
data class Dog(private val name: String)

fun main() {
    val set = setOf(
        Dog("Zeus"),
        Dog("Nina"),
        Dog("Nina"),
        Dog("Auau"),
        Dog("Nina"),
        Cat("Aro"),
        Cat("Aro"),
        Cat("Gunter"),
        Cat("Gunter")
    )

    println(set)
}

class Cat(private val name: String) {
    override fun toString() =  "Cat(name=$name), hashCode=${hashCode()}"

    override fun hashCode(): Int {
        return Objects.hash(name)
    }

    override fun equals(other: Any?): Boolean {
        if (other is Cat) return this.name == other.name

        return false
    }
}