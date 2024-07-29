package fundamentos.polymorphism

fun main() {
    val t = Three("red", 1.50)
    val tCloned = t.clone()

    println(t)
    println(tCloned)
}

interface Cloneable {
    fun clone(): Cloneable
}

// Interface tambem pode implementar outra interface
interface Teste : Cloneable {
    fun teste()
}

// Implementando a interface na data classe
// Kotlin permite multiplas implementações
data class Three(
    val color: String,
    val height: Double
) : Cloneable, Teste {
    override fun teste() {
        println("Three color: $color, height: $height")
    }

    override fun clone(): Three {
        return Three(color, height)
    }
}