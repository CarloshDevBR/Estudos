package polimorfismo

/*
    Casting de tipo altera o tipo referenciado por outro que você definir
*/

fun main() {
    val a: Dog = Dog()
    a.run()
    a.eat()

    val b: Animal = Dog()
    // Transformando a referência Animal pra Dog (Casting)
    val c: Dog = b as Dog

    c.eat()
    c.run()

    // Smart Cast (verifica a referência)
    if(b is Dog) {
        c.eat()
        c.run()
    }
}

abstract class Animal() {
    fun eat() {
        println("Eating...")
    }
}

class Dog : Animal() {
    fun run() {
        println("Running...")
    }
}

class Cat : Animal() {
    fun run() {
        println("Running...")
    }
}