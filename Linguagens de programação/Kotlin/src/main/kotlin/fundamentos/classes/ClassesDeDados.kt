package fundamentos.classes

// data class cria um objeto que armazena dados
// no data class todos os parametros tem que ser propriedades (atributos)
data class Person(val id: Int, val name: String, val lastName: String, val age: Int)

fun main() {
    val person1 = Person(1, "Carlos", "Henrique", 22)

    val person2 = Person(2, "Pedro", "Maia", 22)

    // Copia sobrescrevendo o age
    val person3 = person2.copy(age = 30)

    // Kotlin compara a referencia na memoria
    println(person2 == person3)

    println(person1)
    println(person2)
    println(person3)
}