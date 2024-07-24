package exercicios

fun main() {
    val tv = TV()
    val telephone = Telephone()

    tv.on()
    tv.off()

    tv.status()

    telephone.on()
    telephone.off()

    telephone.status()
}

abstract class Device {
    protected var isOn: Boolean = false

    fun on() {
        isOn = true

        println("ligou")
    }

    fun off() {
        isOn = false

        println("desligou")
    }
}

class TV : Device() {
    fun status() {
        println(isOn)
    }
}

class Telephone : Device() {
    fun status() {
        println(isOn)
    }
}