package polimorfismo

interface Vahicle {
    fun drive()
}

// Podemos criar um objeto anonimo que nao precisara ser instanciado
fun main() {
    val vehicle = object: Vahicle {
        override fun drive() {
            println("Driving...")
        }
    }

    vehicle.drive()
}
