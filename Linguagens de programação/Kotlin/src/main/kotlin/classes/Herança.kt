package classes

/*
    OBS -  No kotlin não existe herança multipla
*/

fun main() {
    // Da erro pq abstract nao permite a criacao da instancia da classe
    // val animal = Animal("white")

    // Toda classe terá esses três métodos
    // animal.toString()
    // animal.hashCode()
    // animal.equals(null)

    val cat = Cat("black")
    val bird = Bird("red")

    val animal1: Animal = bird
    val animal2: Animal = Cat("blue")

    // println(animal is Animal)
    println(cat is Cat)
    println(cat is Animal)
    println(bird is Bird)
    println(bird is Animal)

    println(cat.color)
    cat.eat()
    cat.meow()

    println(bird.color)
    bird.eat()
    bird.sing()
}

// Herança (necessário invocar a classe)
// Toda classe irá herdar de Any em última instancia
// O open serve para explicitamente dizer ao Kotlin que essa classe será herdada
// abstract class é criada para ser herdada
abstract class Animal(val color: String) {
    fun eat() {
        println("eating...")
    }
}

private class Cat(color: String) : Animal(color) {
    fun meow () {
        println("meow meow")
    }
}

private class Bird(color: String) : Animal(color) {
    fun sing() {
        println("la la la")
    }
}