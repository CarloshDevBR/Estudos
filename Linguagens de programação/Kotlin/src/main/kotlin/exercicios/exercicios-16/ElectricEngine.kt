package exercicios.`exercicios-16`

class ElectricEngine(private var battery: Int) : Engine {
    private var engineOn: Boolean = false

    override fun start() {
        if (battery > 0) {
            engineOn = true
        }
    }

    override fun stop() {
        engineOn = false
    }

    override fun move() {
        when {
            battery == 0 -> println("Está sem carga")
            engineOn -> {
                consumeBattery()
                println("zzzzzzz")
            }
            else -> println("O motor precisa estar ligado!")
        }
    }

    private fun consumeBattery() {
        battery--
        println("Bateria: $battery")
    }

    override fun status(): String {
        return if (engineOn) "Ligado" else "Desligado"
    }
}