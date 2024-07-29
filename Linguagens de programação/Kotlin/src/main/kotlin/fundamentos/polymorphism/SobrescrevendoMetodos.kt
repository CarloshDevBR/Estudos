package fundamentos.polymorphism

/*
    override serve para alterar um método existente
*/

fun main() {
    // val drink = Drink()
    // drink.prepare()

    val coffe = Coffe()
    coffe.prepare()
}

private open class Drink () {
    // Assim como para herdar, para sobrescrever é necessário colocar o open a frente do método
    open fun prepare() {
        println("Prepare DRINK!!")
    }
}

private class Coffe : Drink() {
    // sobrescrevendo o método
    override fun prepare () {
        // super irá executar a implementação prepare da classe Drink
        super.prepare()

        println("Prepare COFFE!!!")
    }
}